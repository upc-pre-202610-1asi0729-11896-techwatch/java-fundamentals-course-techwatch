// Lección 2: Interacción y decisiones
// Parte A: leer datos del usuario con Scanner
// Parte B: tomar decisiones con if / else y switch
// En el editor en línea, escribe los datos en el panel de "Input"/"stdin".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // ---------- Parte A: leer datos con Scanner ----------
        System.out.print("¿Cómo te llamas? ");
        String nombre = entrada.nextLine();    // lee una línea de texto

        System.out.print("Ingresa tu nota (0 a 20): ");
        int nota = entrada.nextInt();          // lee un número entero

        System.out.println("¡Hola, " + nombre + "!");

        // ---------- Parte B: if / else if / else ----------
        if (nota >= 18) {
            System.out.println("¡Excelente!");
        } else if (nota >= 13) {
            System.out.println("Aprobado.");
        } else {
            System.out.println("Necesitas repasar. ¡Tú puedes!");
        }

        // Operadores de comparación: ==  !=  <  >  <=  >=
        // Operadores lógicos: && (y),  || (o),  ! (no)
        boolean aprobado = nota >= 13;
        System.out.println("¿Aprobado?: " + aprobado);

        // ---------- switch: elegir entre varias opciones ----------
        System.out.print("Elige un día (1=Lunes, 2=Martes, 3=Miércoles): ");
        int dia = entrada.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Opción no válida");
        }

        entrada.close();
    }
}
