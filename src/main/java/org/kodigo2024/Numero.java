package org.kodigo2024;

/**
 * Clase que representa un número. Esta clase proporciona una implementación básica
 * para un número, incluyendo un valor y métodos para obtener y establecer el valor.
 *
 * @author Ronald Mejia
 */
public class Numero {

    /**
     * El valor del número.
     */
    private double valor;

    /**
     * Constructor que acepta String como parametro
     * @param valor
     */
    public Numero(String valor) {
        this.valor = Double.parseDouble(valor);
    }

    /**
     * Constructor que inicializa el número con su valor.
     *
     * @param valor el valor del número
     * @exception  IllegalArgumentException si ingresas un valor invalido
     */
    public Numero(double valor) {
        if (Double.isNaN(valor) || Double.isInfinite(valor)) {
            throw new IllegalArgumentException("El valor no es un número válido");
        }
        this.valor = valor;
    }

    /**
     * Obtiene el valor del número.
     *
     * @return el valor del número
     */
    public double getValor() {
        return valor;
    }

    /**
     * Establece el valor del número.
     *
     * @param valor el nuevo valor del número
     * @exception IllegalArgumentException si ingresas un valor invalido
     */
    public void setValor(double valor) {
        if (Double.isNaN(valor) || Double.isInfinite(valor)) {
            throw new IllegalArgumentException("El valor no es un número válido");
        }
        this.valor = valor;
    }
}