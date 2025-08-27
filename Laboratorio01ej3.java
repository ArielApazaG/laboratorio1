package laboratorio01ej3;
import java.util.Scanner;
public class Laboratorio01ej3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextDouble();
        }
        Estadistica estadistica = new Estadistica(numeros);
        System.out.println("El promedio es: " + String.format("%.2f", estadistica.getPromedio()));
        System.out.println("La desviacion estandar es: " + String.format("%.4f", estadistica.getDesviacionEstandar()));
        entrada.close();
    }
}