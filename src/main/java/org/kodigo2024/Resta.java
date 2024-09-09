package org.kodigo2024;

/**
 * Clase que representa la operación de resta. Esta clase hereda de la clase abstracta
 * Operacion y proporciona una implementación para la operación de resta.
 *
 * @author Ronald Mejia
 */
public class Resta extends Operacion {

    /**
     * Constructor que inicializa la operación de resta con su nombre.
     */
    public Resta() {
        super("Resta");
    }

    /**
     * Realiza la operación de resta entre dos números.
     *
     * @param num1 el primer número
     * @param num2 el segundo número
     * @return el resultado de la resta
     *
     * @exception  RuntimeException Si ocurreo un error inesperado al realizar la resta
     */
    @Override
    public double realisarOperacion(Numero num1, Numero num2) {
        try {
            return num1.getValor() - num2.getValor();
        } catch (Exception e) {
            throw new RuntimeException("Error al realizar la resta", e);
        }
    }
}