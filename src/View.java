import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    // Muestra el menú y devuelve la opción válida del usuario
    public int enseñarMenu() {
        int opcion = 0;
        boolean valido = false;

        while (!valido) {
            System.out.println("Calculadora, que quieres hacer: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 5) {
                    valido = true;
                } else {
                    System.out.println("Opción no válida. Introduce un número del 1 al 5.");
                }
            } catch (Exception e) {
                System.out.println("Error: Debes introducir un número.");
                scanner.next(); // Limpiar entrada inválida
            }
        }
        return opcion;
    }

    // Pide un número al usuario y valida que sea un número real (entero o decimal)
    public double pedirNumero(String mensaje) {
        double numero = 0.0;
        boolean valido = false;

        while (!valido) {
            System.out.print(mensaje);
            try {
                numero = scanner.nextDouble();
                valido = true;
            } catch (Exception e) {
                System.out.println("Error: introduce un número válido.");
                scanner.next(); // Limpiar entrada inválida
            }
        }
        return numero;
    }
    // Muestra el resultado
    public void mostrarResultado(double resultado) {
        System.out.println("El resultado es: " + resultado);
    }

    // Muestra un mensaje de error
    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }
}
