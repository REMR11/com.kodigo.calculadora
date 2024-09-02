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
     */
    @Override
    public double realisarOperacion(Numero num1, Numero num2) {
        return Math.pow(num1.getValor(), num2.getValor());
    }
}
