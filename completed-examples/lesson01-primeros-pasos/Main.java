// Lección 1: Primeros pasos en Java
// Parte A: tu primer programa (Hola Mundo)
// Parte B: variables, tipos de datos y operadores
// Pega este código en un editor en línea (Replit, JDoodle u OnlineGDB) y presiona "Run".

public class Main {
    public static void main(String[] args) {
        // ---------- Parte A: Hola Mundo ----------
        // System.out.println muestra un mensaje en la pantalla (la consola).
        System.out.println("¡Hola, mundo!");
        System.out.println("Este es mi primer programa en Java.");

        // ---------- Parte B: variables y tipos de datos ----------
        // Una variable es una "caja" con nombre donde guardamos un valor.
        int edad = 15;                 // números enteros
        double promedio = 16.5;        // números con decimales
        char inicial = 'A';            // un solo carácter (comillas simples)
        boolean esEstudiante = true;   // verdadero o falso
        String nombre = "Ana";         // texto (comillas dobles)

        // El símbolo + une (concatena) texto con valores.
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Es estudiante?: " + esEstudiante);

        // ---------- Operadores aritméticos: + - * / % ----------
        int a = 7, b = 2;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División entera: " + (a / b));   // 3 (sin decimales)
        System.out.println("Residuo (módulo): " + (a % b));  // 1
        System.out.println("División con decimales: " + (7.0 / 2.0)); // 3.5
    }
}
