package org.kodigo2024;

/**
 * Clase que representa la operación de multiplicación. Esta clase hereda de la clase abstracta
 * Operacion y proporciona una implementación para la operación de multiplicación.
 *
 * @author Ronald Mejia
 */
public class Multiplicacion extends Operacion {

    /**
     * Constructor que inicializa la operación de multiplicación con su nombre.
     */
    public Multiplicacion() {
        super("Multiplicacion");
    }

    /**
     * Realiza la operación de multiplicación entre dos números.
     *
     * @param num1 el primer número
     * @param num2 el segundo número
     * @return el resultado de la multiplicación
     */
    @Override
    public double realisarOperacion(Numero num1, Numero num2) {
        return num1.getValor() * num2.getValor();
    }
}