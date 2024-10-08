package org.kodigo2024;

/**
 * Clase que representa la operación de suma. Esta clase hereda de la clase abstracta
 * Operacion y proporciona una implementación para la operación de suma.
 *
 * @author Ronald Mejia
 */
public class Suma extends Operacion {

    /**
     * Constructor que inicializa la operación de suma con su nombre.
     */
    public Suma() {
        super("Suma");
    }

    /**
     * Realiza la operación de suma entre dos números.
     *
     * @param num1 el primer número
     * @param num2 el segundo número
     * @return el resultado de la suma
     *
     * @exception RuntimeException Si ocurre un error al realizar la suma
     */
    @Override
    public double realizarOperacion(Numero num1, Numero num2) {
        try {
            return num1.getValor() + num2.getValor();
        } catch (Exception e) {
            throw new RuntimeException("Error al realizar la suma", e);
        }
    }
}
