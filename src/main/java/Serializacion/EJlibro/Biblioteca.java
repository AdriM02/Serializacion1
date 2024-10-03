package Serializacion.EJlibro;
import java.io.*;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    public void verLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void SerializarBiblioteca(String NombreArchivo) {
        try (FileOutputStream fileOutput = new FileOutputStream(NombreArchivo);
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
            for (Libro libro : libros) {
                objectOutput.writeObject(libro);
            }
            System.out.println("Libros añadidos exitosamente al archivo "+NombreArchivo);


        } catch (IOException e) {
            System.err.println("Error al almacenar los libros: " + e.getMessage());
        }

    }

    public  void DeserializarBilblioteca(String NombreArchivo){
        try (FileInputStream fileInput = new FileInputStream(NombreArchivo);
             ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {

            while (true) {
                try {
                    Libro libro = (Libro) objectInput.readObject();
                    System.out.println("\nInformación del Libro:");
                    System.out.println(libro.toString());
                }catch (EOFException e) {
                    System.err.println("Alcanzado el final del archivo");
                    break;
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer el archivo "+NombreArchivo + e.getMessage());
        }

    }
}
