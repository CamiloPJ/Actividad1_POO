package ejercicio4.ejercicio4;
public class Ejercicio4 {

    public static void main(String[] args) {
        double num, cuadrado, cubo;
        num = 2; /* se lee el numero */
        cuadrado= Math.pow(num, 2); /*Se eleva el numero al cuadrado */
        cubo= Math.pow(num, 3);/*Se eleva el numero al cubo */
        
        System.out.println("el numero es: " + num);
        System.out.println("el cuadrado es: " + cuadrado);
        System.out.println("el cubo es: " + cubo);
    }
}
