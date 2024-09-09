package org.kodigo2024;

/**
 * Clase que representa la operación de raíz cuadrada. Esta clase hereda de la clase abstracta
 * Operacion y proporciona una implementación para la operación de raíz cuadrada.
 *
 * @author Ronald Mejia
 */
public class RaizCuadrada extends Operacion {

    /**
     * Constructor que inicializa la operación de raíz cuadrada con su nombre.
     */
    public RaizCuadrada() {
        super("Raíz Cuadrada");
    }

    /**
     * Realiza la operación de raíz cuadrada sobre un número.
     *
     * @param num1 el número sobre el que se realiza la raíz cuadrada
     * @param num2 no se utiliza en esta operación
     * @return el resultado de la raíz cuadrada
     *
     * @exception  ArithmeticException Si ingresas un valor negativo o Cero.
     */
    @Override
    public double realizarOperacion(Numero num1, Numero num2) {
        try {
            if (num1.getValor() < 0) {
                throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
            }
            return Math.sqrt(num1.getValor());
        } catch (ArithmeticException e) {
            throw new RuntimeException("Error al realizar la raíz cuadrada", e);
        }
    }
}
