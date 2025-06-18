# Descripcíón del proyecto
Este proyecto implementa una **calculadora simple** por consola en Java, utilizando el patrón de arquitectura **MVC (Modelo - Vista - Controlador)**.

## ¿Cómo funciona?

1. El usuario ve el menú en la consola (generado por `View`).
2. El usuario selecciona una operación y proporciona dos números (entrada gestionada por `View`).
3. `Controller` toma la entrada, decide qué hacer y llama al método apropiado en `Model`.
4. `Model` realiza el cálculo y devuelve el resultado.
5. `Controller` pasa el resultado a `View`, que lo muestra al usuario.
6. El proceso se repite hasta que el usuario elige salir.

## Explicación Clases

## 'View.java'

Gestiona la interfaz de usuario por consola. Aquí el usuario:

Ve el menú

Introduce números

Ve los resultados

Ve errores


### 'Model.java'

Encapsula toda la lógica, sus métodos simplemente devuelven resultados de suma, resta, multiplicación y división.

## 'Controller.java'

Se comunica tanto con el modelo como con la vista. Tiene la lógica de flujo:

Muestra el menú

Recibe la opción del usuario

Llama al modelo para hacer el cálculo

Muestra el resultado con la vista

## 'Main.java'

lase de entrada. Crea las instancias de Model, View y Controller, y luego ejecuta el controlador: