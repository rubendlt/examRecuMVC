public class Controller {
    private Model model;
    private View view;

    // Constructor que recibe el modelo y la vista
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    // Método principal para ejecutar la lógica de la calculadora
    public void run() {
        boolean running = true;
        while (running) {
            int option = view.enseñarMenu();
            try {
                if (option >= 1 && option <= 4) {
                    // Solicitar los números al usuario
                    double a = view.pedirNumero("Introduce el primer número: ");
                    double b = view.pedirNumero("Introduce el segundo número: ");
                    double result = 0;

                    // Llamar al modelo según la operación seleccionada
                    switch (option) {
                        case 1 -> result = model.add(a, b);
                        case 2 -> result = model.subtract(a, b);
                        case 3 -> result = model.multiply(a, b);
                        case 4 -> result = model.divide(a, b);
                    }
                    view.mostrarResultado(result); // Mostrar el resultado
                } else if (option == 5) {
                    running = false; // Salir del programa
                } else {
                    view.mostrarError("Opción inválida.");
                }
            } catch (Exception e) {
                view.mostrarError(e.getMessage());
            }
        }
    }
}
