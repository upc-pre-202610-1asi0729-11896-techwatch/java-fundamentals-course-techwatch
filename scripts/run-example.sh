#!/usr/bin/env bash
# -----------------------------------------------------------------------------
# run-example.sh
# Compila y ejecuta el archivo Main.java de la carpeta indicada (Linux / macOS).
#
# IMPORTANTE: los estudiantes NO necesitan este script. Ellos usan editores en
# línea (Replit, JDoodle, OnlineGDB) y solo un navegador web. Este script es una
# herramienta de apoyo para el equipo que mantiene el repositorio.
#
# Uso:
#   ./run-example.sh completed-examples/lesson01-hola-mundo
#   ./run-example.sh starter-files/lesson05-bucles
# -----------------------------------------------------------------------------
set -e

DIR="${1:?Indica la carpeta de la lección, p.ej. completed-examples/lesson01-hola-mundo}"

if [ ! -f "$DIR/Main.java" ]; then
  echo "No se encontró $DIR/Main.java"
  exit 1
fi

OUT="build/$(basename "$DIR")"
mkdir -p "$OUT"

echo ">> Compilando $DIR/Main.java ..."
javac -encoding UTF-8 -d "$OUT" "$DIR/Main.java"

echo ">> Ejecutando ..."
echo "-----------------------------------------"
java -cp "$OUT" Main
