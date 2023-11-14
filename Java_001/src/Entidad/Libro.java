/* Ejericicio_01: . Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas. */
package Entidad;

/* @author G96xyFast */
public class Libro {
    // Modificador 'public' permite acceder a los atributos sin 'getters' y 'setters'
    public int ISBN, numPag;
    public String titulo, autor;
    // Constructor vacío
    public Libro() {
    }
    // Constructor con atributos pasados por parámetros
    public Libro(int ISBN, int numPag, String titulo, String autor) {
        this.ISBN = ISBN;
        this.numPag = numPag;
        this.titulo = titulo;
        this.autor = autor;
    }
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", numPag=" + numPag + ", titulo=" + titulo + ", autor=" + autor + '}';
    }
}