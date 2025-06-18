/**
 * Calculadora - Examen Recuperación MVC
 * Aplicación para operar dos números y mostrar resultado
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        // Bucle principal de la aplicación
        while (continuar) {
            System.out.println("---- Calculadora Simple ----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            int opcion = 0;
            // Validación de entrada para evitar que el programa rompa si no se introduce un número
            try {
                opcion = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Debes introducir un número válido.");
                teclado.next(); // Limpiar el buffer del scanner
                continue; // Volver al inicio del bucle
            }


            if (opcion == 5) {
                continuar = false;
                System.out.println("¡Saliendo!");
                continue;
            }

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opción no válida.");
                System.out.println("--------------------------");
                continue;
            }

            System.out.print("Introduce el primer número: ");
            double numero1 = teclado.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double numero2 = teclado.nextDouble();

            double resultado = 0.0;
            boolean error = false;

            if (opcion == 1) {
                resultado = numero1 + numero2;
            } else if (opcion == 2) {
                resultado = numero1 - numero2;
            } else if (opcion == 3) {
                resultado = numero1 * numero2;
            } else if (opcion == 4) {
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    error = true;
                }
            }

            if (!error) {
                System.out.println("El resultado es: " + resultado);
            }
            System.out.println("--------------------------");
        }

        teclado.close();
    }
}
