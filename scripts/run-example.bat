@echo off
REM ---------------------------------------------------------------------------
REM run-example.bat
REM Compila y ejecuta el archivo Main.java de la carpeta indicada (Windows).
REM
REM IMPORTANTE: los estudiantes NO necesitan este script. Ellos usan editores
REM en linea (Replit, JDoodle, OnlineGDB) y solo un navegador web. Este script
REM es una herramienta de apoyo para el equipo que mantiene el repositorio.
REM
REM Uso:
REM   run-example.bat completed-examples\lesson01-hola-mundo
REM   run-example.bat starter-files\lesson05-bucles
REM ---------------------------------------------------------------------------
setlocal

if "%~1"=="" (
  echo Indica la carpeta de la leccion, p.ej. completed-examples\lesson01-hola-mundo
  exit /b 1
)

if not exist "%~1\Main.java" (
  echo No se encontro "%~1\Main.java"
  exit /b 1
)

set "OUT=build\%~nx1"
if not exist "%OUT%" mkdir "%OUT%"

echo ^>^> Compilando "%~1\Main.java" ...
javac -encoding UTF-8 -d "%OUT%" "%~1\Main.java"
if errorlevel 1 exit /b 1

echo ^>^> Ejecutando ...
echo -----------------------------------------
java -cp "%OUT%" Main

endlocal
