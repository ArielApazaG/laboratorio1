package laboratorio01ej2;
import java.util.Scanner;
public class Laboratorio01ej2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los coeficientes a, b, c:");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        double discriminante = ecuacion.getDiscriminante();
        if (discriminante > 0) {
            System.out.println("La ecuacion tiene dos raices: " + String.format("%.4f", ecuacion.getRaiz1()) + " y " + String.format("%.4f", ecuacion.getRaiz2()));
        } else if (discriminante == 0) {
            System.out.println("La ecuacion tiene una raiz: " + String.format("%.4f", ecuacion.getRaiz1()));
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
        entrada.close();
    }
}