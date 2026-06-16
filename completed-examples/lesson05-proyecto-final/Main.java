// Lección 5: Proyecto final y buenas prácticas
// Proyecto: "Registro de Estudiantes"
// Junta todo lo aprendido: clases, objetos, encapsulación, arrays y bucles.

import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public boolean estaAprobado() {
        return promedio >= 13;
    }

    public void mostrar() {
        String estado = estaAprobado() ? "Aprobado" : "Desaprobado";
        System.out.println("- " + nombre + " | Edad: " + edad +
                           " | Promedio: " + promedio + " | " + estado);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes deseas registrar? ");
        int cantidad = entrada.nextInt();
        entrada.nextLine(); // limpiar el salto de línea pendiente

        // Array de objetos: una lista de estudiantes.
        Estudiante[] estudiantes = new Estudiante[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nEstudiante #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Edad: ");
            int edad = entrada.nextInt();
            System.out.print("Promedio (0-20): ");
            double promedio = entrada.nextDouble();
            entrada.nextLine();
            estudiantes[i] = new Estudiante(nombre, edad, promedio);
        }

        // Recorremos el array para mostrar el registro y el promedio general.
        System.out.println("\n===== REGISTRO DE ESTUDIANTES =====");
        double suma = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i].mostrar();
            suma += estudiantes[i].getPromedio();
        }
        System.out.println("Promedio general del salón: " + (suma / estudiantes.length));

        // ---------- Buenas prácticas y errores comunes ----------
        // 1) Usa nombres descriptivos (edadMinima, no x).
        // 2) Compara texto con .equals(), NO con ==.
        String clave = "java";
        if (clave.equals("java")) {
            System.out.println("\nTip: para comparar texto usa .equals(), no ==");
        }
        // 3) Cuidado con la división entera: 7/2 = 3, pero 7.0/2 = 3.5.

        entrada.close();
    }
}
