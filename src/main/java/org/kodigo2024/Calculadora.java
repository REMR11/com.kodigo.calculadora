package org.kodigo2024;

/**
 * Clase que representa una calculadora que puede realizar diferentes operaciones
 * matemáticas. La calculadora utiliza una instancia de la clase Operacion para
 * realizar la operación específica.
 *
 * @author Ronald Mejia
 */
public class Calculadora {
    /**
     * La operación matemática que se va a realizar.
     */
    private Operacion operacion;

    /**
     * Constructor que inicializa la calculadora con una operación específica.
     *
     * @param operacion la operación que se va a realizar
     */
    public Calculadora(Operacion operacion) {
        this.operacion = operacion;
    }

    /**
     * Realiza la operación matemática específica sobre dos números.
     *
     * @param num1 el primer número
     * @param num2 el segundo número
     * @return el resultado de la operación
     */
    public double relizaOperacion(Numero num1, Numero num2){
        return operacion.realisarOperacion(num1, num2);
    }
}
