package org.kodigo2024;

public abstract class Operacion {
    private String nombre;

    public Operacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double realisarOperacion(Numero num1, Numero num2);
}
