package org.kodigo2024;

/**
 * Clase que representa la operación de potencia. Esta clase hereda de la clase abstracta
 * Operacion y proporciona una implementación para la operación de potencia.
 *
 * @author Ronald Mejia
 */
public class Potencia extends Operacion {

    /**
     * Constructor que inicializa la operación de potencia con su nombre.
     */
    public Potencia() {
        super("Potencia");
    }

    /**
     * Realiza la operación de potencia sobre dos números.
     *
     * @param num1 la base de la potencia
     * @param num2 el exponente de la potencia
     * @return el resultado de la potencia
     *
     * @exception ArithmeticException Si ingresas un parametro negativo o un cero.
     */
    @Override
    public double realizarOperacion(Numero num1, Numero num2) {
        try {
            return Math.pow(num1.getValor(), num2.getValor());
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede realizar la operación de potencia con un exponente negativo y una base cero.");
            return Double.NaN; // Devuelve Not a Number (NaN) en caso de error
        }
    }
}