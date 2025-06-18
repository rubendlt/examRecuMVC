
public class Model {
    // Método para sumar dos números
    public double add(double a, double b) {
        return a + b;
    }

    // Método para restar dos números
    public double subtract(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public double multiply(double a, double b) {
        return a * b;
    }

    // Método para dividir dos números, extepción de división por cero
    public double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("No se puede dividir por cero.");
        return a / b;
    }
}
