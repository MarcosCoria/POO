/* Ejericicio_01: Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas. */
package java_001;

import Entidad.Libro;
import java.util.Scanner;

/* @author G96xyFast */
public class Java_001 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Importamos la entidad 'Libro' que creamos en el otro paquete
        Libro libro1= new Libro();
        System.out.println("Ingrese número ISBN: ");
        libro1.ISBN= ComprobarNum();
        System.out.println("Ingrese título del libro: ");
        libro1.titulo= ComprobarNombre();
        System.out.println("Ingrese nombre del autor: ");
        libro1.autor= ComprobarNombre();
        System.out.println("Ingrese número de páginas: ");
        libro1.numPag= ComprobarNum();
        System.out.println("Datos del libro:\nISBN: " + libro1.ISBN + ", Título: " + libro1.titulo + ", Autor: " + libro1.ISBN + ", Números de páginas: " + libro1.numPag);
        System.out.println("Datos del libro 'Método toString()':\n" + libro1.toString());
    }   
    public static int ComprobarNum(){
        Scanner leer = new Scanner(System.in);
        int aux= leer.nextInt();
        while (aux<=0) {
            System.out.println("Error. Ingrese un número mayor a 0: ");
            aux= leer.nextInt();
        }
        return aux;
    }
    public static String ComprobarNombre(){
        Scanner leer = new Scanner(System.in);
        String aux= leer.nextLine();
        while (aux.equals("") || aux.equals(" ")) {
            System.out.println("Error. Ingrese título del libro: ");
            aux= leer.nextLine();
        }
        return aux;
    }
}