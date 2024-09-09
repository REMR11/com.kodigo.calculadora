package org.kodigo2024;

/**
 * Clase abstracta que representa una operación matemática. Esta clase proporciona
 * una implementación básica para las operaciones, incluyendo un nombre y métodos
 * para obtener y establecer el nombre. Las clases que hereden de esta clase deben
 * implementar el método abstracto realizarOperacion.
 *
 * @author Ronald Mejia
 */
public abstract class Operacion {

    /**
     * El nombre de la operación.
     */
    private String nombre;

    /**
     * Constructor que inicializa la operación con su nombre.
     *
     * @param nombre el nombre de la operación
     * @exception IllegalArgumentException si intentas ingresar un valor nulo
     */

    public Operacion(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre de la operación no puede ser null o vacío");
        }
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre de la operación.
     *
     * @return el nombre de la operación
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la operación.
     *
     * @param nombre el nuevo nombre de la operación
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Realiza la operación matemática entre dos números. Debe ser implementado
     * por las clases que hereden de esta clase.
     *
     * @param num1 el primer número
     * @param num2 el segundo número
     * @return el resultado de la operación
     */
    public abstract double realisarOperacion(Numero num1, Numero num2);
}
