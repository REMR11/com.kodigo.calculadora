package org.kodigo2024;

public class Suma extends Operacion{

    public Suma(String nombre) {
        super("Suma");
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public double realisarOperacion(Numero num1, Numero num2) {
        return num1.getValor() + num2.getValor();
    }
}
