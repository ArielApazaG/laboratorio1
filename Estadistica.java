package laboratorio01ej3;
public class Estadistica {
    private double[] numeros;
    private int n;
    public Estadistica(double[] numeros) {
        this.numeros = numeros;
        this.n = numeros.length;
    }
    public double getPromedio() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / n;
    }
    public double getDesviacionEstandar() {
        double promedio = getPromedio();
        double sumatoria = 0;
        for (double num : numeros) {
            sumatoria += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(sumatoria / (n - 1));
    }
}