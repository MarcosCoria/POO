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
package java_002;

import Entidad.Circunferencia;

/* @author G96xyFast */
public class Java_002 {
    public static void main(String[] args) {
        // Importamos la clase 'Circunferencia'
        Circunferencia circulo= new Circunferencia();
        // Seteamos el radio con el resultado del método
        circulo.setRadio(circulo.CrearCircunferencia());
        // A través del método get la pasamos el 'radio' almacenado a los otros métodos
        System.out.println("Datos del círculo:\nRadio= " + circulo.getRadio()+ ", Area= " + circulo.area(circulo.getRadio()) + ", Perímetro= " + circulo.perimetro(circulo.getRadio()));
    }  
}