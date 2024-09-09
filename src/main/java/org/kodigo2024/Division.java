package org.kodigo2024;

/**
 * Clase que representa la operación de división. Esta clase hereda de la clase
 * Operacion y proporciona la implementación específica para la división.
 *
 * @author Ronald Mejia
 */
public class Division extends Operacion {

    /**
     * Constructor que inicializa la operación de división con su nombre.
     */
    public Division() {
        super("Division");
    }
    /**
     * Realiza la operación de división entre dos números.
     *
     * @param num1 el dividendo
     * @param num2 el divisor
     * @return el resultado de la división
     * @throws ArithmeticException si se intenta dividir por cero
     */
    @Override
    public double realizarOperacion(Numero num1, Numero num2) {
        if (num2.getValor() == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return num1.getValor() / num2.getValor();
    }
}
