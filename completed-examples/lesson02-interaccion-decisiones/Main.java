// Lección 2: Interacción y decisiones
// Parte A: leer datos del usuario con Scanner
// Parte B: tomar decisiones con if / else y switch
// En el editor en línea, escribe los datos en el panel de "Input"/"stdin".

import java.util.Scanner; // Importamos Scanner para poder leer datos escritos por el usuario.

public class Main {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer información desde la consola.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al recomendador de actividades");

        // Pedimos el nombre del usuario y lo guardamos como texto.
        System.out.print("Escribe tu nombre: ");
        String name = scanner.nextLine();

        // Pedimos la edad del usuario y la guardamos como número entero.
        System.out.print("Escribe tu edad: ");
        int age = scanner.nextInt();

        System.out.println();
        System.out.println("Hola, " + name + ".");

        // Usamos if/else para tomar una decisión según la edad ingresada.
        if (age >= 12) {
            System.out.println("Puedes realizar esta práctica sin ayuda.");
        } else {
            System.out.println("Te recomendamos realizar esta práctica con ayuda de un adulto.");
        }

        System.out.println();

        // Mostramos un menú simple con opciones para el usuario.
        System.out.println("Elige una actividad:");
        System.out.println("1. Repasar conceptos");
        System.out.println("2. Resolver ejercicios");
        System.out.println("3. Revisar ejemplos completos");
        System.out.print("Opción: ");

        // Leemos la opción elegida por el usuario.
        int option = scanner.nextInt();

        // Usamos switch para responder según la opción seleccionada.
        switch (option) {
            case 1:
                System.out.println("Actividad recomendada: repasa qué son Scanner, if y switch.");
                break;
            case 2:
                System.out.println("Actividad recomendada: cambia la edad y prueba diferentes respuestas.");
                break;
            case 3:
                System.out.println("Actividad recomendada: compara tu código con el ejemplo completo.");
                break;
            default:
                // default se ejecuta cuando el usuario escribe una opción que no existe.
                System.out.println("Opción no válida. Intenta elegir 1, 2 o 3.");
                break;
        }

        // Cerramos el Scanner porque ya no vamos a leer más datos.
        scanner.close();
    }
}
