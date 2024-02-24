package ejercicio2.ejercicio2;
public class Ejercicio2 {

    public static void main(String[] args) {
        double suma, X, Y; /*Se declaran las variables a utilizar, las cuales son suma, X y Y*/
        suma=0; /*Se le asigna el valor de 0 a la variable suma*/
        X=20;/*Se le asigna el valor de 20 a la variable X*/
        suma=suma+X; /*Se realiza la suma de la variable suma con la variable X*/
        Y=40; /* Se le asigna el valor de 40 a la variable Y*/
        X=X + Math.pow(Y,2); /* Se suma la variable X con el cuadrado de Y*/
        suma = suma + (X/Y); /* se hace la suma de la varaible suma con la division entre X y Y*/
        System.out.println("El valor de la suma es: " + suma); /*Se imprime el valor total de suma*/
    }
}
