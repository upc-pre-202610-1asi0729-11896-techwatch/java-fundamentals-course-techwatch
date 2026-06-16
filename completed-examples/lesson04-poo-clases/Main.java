// Lección 4: Programación Orientada a Objetos (POO)
// Clases, objetos, atributos, constructores y encapsulación.

// Una CLASE es un "molde". Un OBJETO se crea a partir de ese molde con "new".
class Estudiante {
    // Encapsulación: atributos PRIVADOS (protegidos del exterior).
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor: define los valores iniciales del objeto.
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;   // "this.nombre" es el atributo; "nombre" el parámetro
        this.edad = edad;
        this.promedio = promedio;
    }

    // Getters: permiten LEER los atributos.
    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    // Setter: permite CAMBIAR un atributo de forma controlada (con validación).
    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 20) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio inválido (debe estar entre 0 y 20).");
        }
    }

    // Comportamiento (método) del objeto.
    public void presentarse() {
        System.out.println("Soy " + nombre + ", tengo " + edad +
                           " años y mi promedio es " + promedio + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear objetos (instancias) con "new". Cada uno tiene sus propios valores.
        Estudiante e1 = new Estudiante("Ana", 15, 16.5);
        Estudiante e2 = new Estudiante("Luis", 16, 12.0);

        e1.presentarse();
        e2.presentarse();

        // Usar un setter con validación.
        e2.setPromedio(14.0);   // válido: cambia el promedio
        e2.setPromedio(99.0);   // inválido: muestra mensaje y NO cambia
        System.out.println(e2.getNombre() + " ahora tiene promedio " + e2.getPromedio());
    }
}
