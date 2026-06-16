# scripts/

Herramientas de apoyo **para el equipo** que mantiene este repositorio.

> Los estudiantes **no** necesitan estos scripts ni instalar nada. El curso se
> sigue 100 % en el navegador usando editores en línea (Replit, JDoodle,
> OnlineGDB). Estos scripts solo sirven para que el equipo pueda compilar y
> probar los ejemplos rápidamente en su computadora.

## Requisitos

- Tener instalado el JDK (Java Development Kit) 17 o superior.
- Verificar con: `javac -version`

## Uso

**Linux / macOS:**

```bash
chmod +x scripts/run-example.sh
scripts/run-example.sh completed-examples/lesson01-hola-mundo
```

**Windows:**

```bat
scripts\run-example.bat completed-examples\lesson01-hola-mundo
```

Cada script compila el archivo `Main.java` de la carpeta indicada en una carpeta
`build/` temporal y luego lo ejecuta. Para las lecciones que piden datos al
usuario (las que usan `Scanner`), escribe los datos en la consola cuando se
ejecuten.
