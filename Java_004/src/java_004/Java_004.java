/* Ejercicio_04: Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base*altura / Perímetro = (base + altura)*2  */
package java_004;

import Entidad.Rectangulo;

/* @author G96xyFast */
public class Java_004 {
    public static void main(String[] args) {
        Rectangulo rec= new Rectangulo();
        rec= rec.CrearRectangulo();
        System.out.println("La superficie del rectángulo es: " + rec.Superficie(rec.getBase(), rec.getAltura()));
        System.out.println("El perímetro del rectángulo es: " + rec.Perimetro(rec.getBase(), rec.getAltura()));
        rec.Dibujar(rec.getBase(), rec.getAltura());
    }   
}