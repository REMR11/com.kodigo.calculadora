package org.kodigo2024;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase que proporciona métodos para realizar validaciones de entrada de usuario.
 * Los métodos de esta clase se encargan de solicitar al usuario que ingrese valores
 * numéricos válidos y de validar la entrada para asegurarse de que se cumplan las
 * condiciones específicas.
 *
 * @author Ronald Mejia
 */

public class Validaciones {
    /**
     * Metodo encargado de validar si el numero ingresado cumple como un entero y no
     * avanzara hasta obtener un numero valido.
     * @param scanner
     * @return int numero valido
     */
    public static int solicitarIntValido (Scanner scanner) {
        int number = 0;
        boolean validInput = false;

        do {
            System.out.print("Proporcione una opcion:\n");
            try {
                number = scanner.nextInt();
                if (number <= 0) {
                    System.out.println("El número debe ser positivo.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor ingrese un número decimal válido.");
                scanner.nextLine();
            }
        } while (!validInput);
        return number;
    }

    /**
     * Solicita al usuario que ingrese un valor doble positivo y valida la entrada.
     *
     * @return un valor doble positivo válido
     */
    public static double pedirDoublePositivo(Scanner scanner) {
        double valor = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Ingrese un número positivo: ");
                valor = scanner.nextDouble();
                if (valor <= 0) {
                    System.out.println("Debe ser un número positivo.");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un número decimal válido.");
                scanner.next(); // Limpiar el buffer de entrada
            }
        }

        return valor;
    }
}
