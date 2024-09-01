package org.kodigo2024;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        // Crear operaciones
        Operacion suma = new Suma();
        Operacion resta = new Resta();
        Operacion multiplicacion = new Multiplicacion();
        Operacion division = new Division();
        Operacion potencia = new Potencia();
        Operacion raizCuadrada = new RaizCuadrada();

        while (true) {
            System.out.println("Menú de Operaciones");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Salir");

            opcion = Validaciones.solicitarIntValido(scanner);
            Numero num1 = null;
            Numero num2 = num1;
            switch (opcion) {
                case 1:
                    // Crear calculadora con operación suma
                    Calculadora calculadoraSuma = new Calculadora(suma);
                    num1 = new Numero(Validaciones.pedirDoublePositivo(scanner));
                    num2 = new Numero(Validaciones.pedirDoublePositivo(scanner));
                    double resultadoSuma = calculadoraSuma.relizaOperacion(num1, num2);
                    System.out.println("Resultado de la suma: " + resultadoSuma);
                    break;
                case 2:
                    // Crear calculadora con operación resta
                    Calculadora calculadoraResta = new Calculadora(resta);
                    num1 = new Numero(Validaciones.pedirDoublePositivo(scanner));
                    num2 = new Numero(Validaciones.pedirDoublePositivo(scanner));
                    double resultadoResta = calculadoraResta.relizaOperacion(num1, num2);
                    System.out.println("Resultado de la resta: " + resultadoResta);

                    break;
                case 3:
                    // Crear calculadora con operación multiplicación
                    Calculadora calculadoraMultiplicacion = new Calculadora(multiplicacion);
                    num1 = new Numero(Validaciones.pedirDoublePositivo(scanner));
                    num2 = new Numero(Validaciones.pedirDoublePositivo(scanner));
                    double resultadoMultiplicacion = calculadoraMultiplicacion.relizaOperacion(num1, num2);
                    System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
                    break;
                case 4:
                    // Crear calculadora con operación división
                    Calculadora calculadoraDivision = new Calculadora(division);
                    num1 = new Numero(Validaciones.pedirDoublePositivo(scanner));
                    num2 = new Numero(Validaciones.pedirDoublePositivo(scanner));
                    double resultadoDivision = calculadoraDivision.relizaOperacion(num1, num2);
                    System.out.println("Resultado de la división: " + resultadoDivision);
                    break;
                case 5:
                    // Crear calculadora con operación potencia
                    Calculadora calculadoraPotencia = new Calculadora(potencia);
                    num1 = new Numero(Validaciones.pedirDoublePositivo(scanner));
                    num2 = new Numero(Validaciones.pedirDoublePositivo(scanner));
                    double resultadoPotencia = calculadoraPotencia.relizaOperacion(num1, num2);
                    System.out.println("Resultado de la potencia: " + resultadoPotencia);
                    break;
                case 6:
                    // Crear calculadora con operación raíz cuadrada
                    Calculadora calculadoraRaizCuadrada = new Calculadora(raizCuadrada);
                    num1 = new Numero(Validaciones.pedirDoublePositivo(scanner));
                    num2 = new Numero(Validaciones.pedirDoublePositivo(scanner));
                    double resultadoRaizCuadrada = calculadoraRaizCuadrada.relizaOperacion(num1, new Numero(1.0));
                    System.out.println("Resultado de la raíz cuadrada: " + resultadoRaizCuadrada);
                    break;
                case 7:
                    System.out.println("Adiós!");
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }


}

