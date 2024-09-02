package org.kodigo2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Clase principal que ejecuta una calculadora básica que permite al usuario realizar
 * operaciones matemáticas simples, como suma, resta, multiplicación, división, potencia
 * y raíz cuadrada.
 *
 * El programa presenta un menú al usuario con las opciones disponibles y le pide que
 * seleccione una de ellas. Luego, pide los números necesarios para realizar la operación
 * seleccionada y muestra el resultado.
 *
 * @author Ronald Mejia
 */
public class Main {
    /**
     * Mapa que asocia cada opción con la operación correspondiente.
     */
    private static final Map<Integer, Operacion> operaciones = new HashMap<>();

    static {
        operaciones.put(1, new Suma());
        operaciones.put(2, new Resta());
        operaciones.put(3, new Multiplicacion());
        operaciones.put(4, new Division());
        operaciones.put(5, new Potencia());
        operaciones.put(6, new RaizCuadrada());
    }

    /**
     * Método principal que ejecuta el programa.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("Menú de Operaciones");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Salir");

            try {
                opcion = Validaciones.solicitarIntValido(scanner);
            } catch (Exception e) {
                System.out.println("Error al leer la opción. Intente nuevamente.");
                continue;
            }

            if (opcion == 7) {
                System.out.println("Adiós!");
                return;
            }

            realizarOperacion(opcion, scanner);
        }
    }

    /**
     * Realiza la operación seleccionada por el usuario.
     *
     * @param opcion  Opción seleccionada por el usuario.
     * @param scanner Scanner para leer los datos de entrada.
     */
    private static void realizarOperacion(int opcion, Scanner scanner) {
        Operacion operacion = operaciones.get(opcion);

        if (operacion == null) {
            System.out.println("Opción inválida. Intente nuevamente.");
            return;
        }

        Numero num1 = null;
        Numero num2 = null;

        try {
            num1 = new Numero(Validaciones.pedirDoublePositivo(scanner));
            if (opcion != 6) {
                num2 = new Numero(Validaciones.pedirDoublePositivo(scanner));
            } else {
                num2 = new Numero(1.0);
            }
        } catch (Exception e) {
            System.out.println("Error al leer los números. Intente nuevamente.");
            return;
        }

        Calculadora calculadora = new Calculadora(operacion);
        double resultado;

        try {
            resultado = calculadora.relizaOperacion(num1, num2);
        } catch (Exception e) {
            System.out.println("Error al realizar la operación. Intente nuevamente.");
            return;
        }

        System.out.println("Resultado de la " + getNombreOperacion(opcion) + ": " + resultado);
    }

    /**
     * Obtiene el nombre de la operación correspondiente a la opción seleccionada.
     *
     * @param opcion Opción seleccionada por el usuario.
     * @return Nombre de la operación.
     */
    private static String getNombreOperacion(int opcion) {
        switch (opcion) {
            case 1:
                return "suma";
            case 2:
                return "resta";
            case 3:
                return "multiplicación";
            case 4:
                return "división";
            case 5:
                return "potencia";
            case 6:
                return "raíz cuadrada";
            default:
                return "";
        }
    }
}