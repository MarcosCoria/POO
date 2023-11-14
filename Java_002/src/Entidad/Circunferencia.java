/* Ejercicio_02: Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area= π*〖radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio). */
package Entidad;

import static java.lang.Math.PI;
import java.util.Scanner;

/*@author G96xyFast */
public class Circunferencia {
    private double radio;
    // Constructor vacío
    public Circunferencia() {
    }
    // Constructor con atributo pasado por parámetro
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    // Getters y Setters
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    // este método es irrelevante, ya que se pueden pasar los valores al objeto creado en el 'main'
    public double CrearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese radio: ");
        double num= leer.nextDouble();
        while (num<=0) {
            System.out.println("Error. Ingrese un radio mayor a 0: ");
            num= leer.nextDouble();
        }
        return num;
    }
    public double area(double rad){
        double aux= PI*Math.pow(rad,2);
        return aux;
    }
    public double perimetro(double rad){
        double aux= 2*PI*rad;
        return aux;
    }
}