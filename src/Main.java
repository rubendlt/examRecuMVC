public class Main {
    public static void main(String[] args) {
        // Instanciación de componentes MVC
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Ejecutar la aplicación
        controller.run();
    }
}
