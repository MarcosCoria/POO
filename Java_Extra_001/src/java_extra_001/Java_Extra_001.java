/* Ejercicio_01: Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes. */
package java_extra_001;

import Entidad.Cancion;
import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_001 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cancion tema= new Cancion();
        System.out.println("Ingrese titulo de la canción: ");
        tema.setTitulo(Nombre());
        System.out.println("Ingrese nombre del autor: ");
        tema.setAutor(Nombre());
        System.out.println(tema.toString());
    }   
    public static String Nombre(){
        Scanner leer = new Scanner(System.in);
        String nombre= leer.nextLine();
        while (nombre.equals("") || nombre.equals(" ")) {
            System.out.println("Error. Ingrese otro nombre válido: ");
            nombre= leer.nextLine();
        }
        return nombre;
    }
}