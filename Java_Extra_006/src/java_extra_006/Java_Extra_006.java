/* Ejericio_06: Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo */
package java_extra_006;

import Entidad.Rectangulo;
import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_006 {
    public static void main(String[] args) {
        // Falta realizar las verificaciones
        Scanner leer = new Scanner(System.in);
        Rectangulo rec= new Rectangulo();
        System.out.println("Ingrese base del rectángulo: ");
        rec.setLado1(Comprobar());
        System.out.println("Ingrese altura del rectángulo: ");
        rec.setLado2(Comprobar());
        rec.CalcularArea(rec);
    }   
    public static double Comprobar(){
        Scanner leer = new Scanner(System.in);
        double aux= leer.nextDouble();
        while (aux<=0) {
            System.out.println("Error. Ingrese un dato válido: ");
            aux=leer.nextInt();
        }
        return aux;
    }
}