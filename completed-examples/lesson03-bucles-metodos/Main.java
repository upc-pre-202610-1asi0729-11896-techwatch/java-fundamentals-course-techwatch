// Lección 3: Repetir y reutilizar
// Parte A: bucles for y while
// Parte B: métodos y parámetros

public class Main {
    public static void main(String[] args) {
        // ---------- Parte A: bucles ----------
        // Bucle for: ideal cuando sabemos cuántas veces repetir.
        System.out.println("Contar del 1 al 5 con for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        // Bucle while: repite MIENTRAS la condición sea verdadera.
        System.out.println("Cuenta regresiva con while:");
        int cuenta = 3;
        while (cuenta > 0) {
            System.out.println(cuenta + "...");
            cuenta--; // importante: cambiar la condición para que el bucle termine
        }
        System.out.println("¡Despegue!");

        // ---------- Parte B: métodos ----------
        // Un método es un bloque de código con nombre que podemos reutilizar.
        saludar("Ana");
        saludar("Luis");
        System.out.println("4 + 6 = " + sumar(4, 6));
        System.out.println("Suma del 1 al 10 = " + sumarHasta(10));
    }

    // Método sin valor de retorno (void). Recibe un parámetro.
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al curso.");
    }

    // Método que retorna un int.
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Combina bucle + método: suma de 1 hasta n.
    public static int sumarHasta(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}
