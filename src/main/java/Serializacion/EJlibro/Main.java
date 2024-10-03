package Serializacion.EJlibro;

public class Main {
    public static void main(String[] args) {
        String archivo = "Biblioteca.dat";

        Libro libro1  = new Libro("El Quijote","Cervantes","i3124d",31.5d,14d);
        Libro libro2  = new Libro("One piece 1","Oda","54g543",7.4d, 2d);
        Libro libro3  = new Libro("Jujutsu kaisen 18","Gege","rf23f",9.99d,3.2d);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);
        biblioteca.verLibros();

        biblioteca.SerializarBiblioteca(archivo);
        biblioteca.DeserializarBilblioteca(archivo);
    }
}
