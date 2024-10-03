package Serializacion.EJlibro;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
    private transient double descuento;

    public Libro(String titulo, String autor, String isbn, double precio, double descuento) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", precio=" + precio +
                ", descuento=" + descuento +
                '}';
    }
}
