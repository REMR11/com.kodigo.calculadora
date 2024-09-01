package org.kodigo2024;

public class Multiplicacion extends  Operacion{
    public Multiplicacion() {
        super("Multiplicacion");
    }

    /**
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public double realisarOperacion(Numero num1, Numero num2) {
        return num1.getValor() * num2.getValor();
    }
}
