    package ejercicio3.ejercicio3;
    public class Ejercicio3 {

        public static void main(String[] args) {
            double horas, salario_hora, retencion, salario_bruto, salario_neto;
            horas=48;
            salario_hora=5000;
            salario_bruto=horas*salario_hora;
            retencion=salario_bruto*0.125;
            salario_neto=salario_bruto-retencion;

            System.out.println("El salario bruto es: " + salario_bruto);
            System.out.println("El porcentaje de retencion es: " + retencion);
            System.out.println("El salario neto es: " + salario_neto);
        }
    }
