package ejercicio5.ejercicio5;
public class Ejercicio5 {

    public static void main(String[] args) {
       double radio, area, longitud;
       radio=15;
       area= Math.PI * Math.pow(radio, 2);
       longitud= 2 * Math.PI * radio;
             
        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud del circulo es: " + longitud);
    }
}
