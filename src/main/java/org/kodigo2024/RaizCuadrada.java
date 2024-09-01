package org.kodigo2024;

public class RaizCuadrada extends Operacion {
    public RaizCuadrada() {
        super("Raíz Cuadrada");
    }

    /**
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public double realisarOperacion(Numero num1, Numero num2) {
        return Math.sqrt(num1.getValor());
    }
}
