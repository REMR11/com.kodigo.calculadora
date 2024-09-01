package org.kodigo2024;

public class Division extends  Operacion{
    public Division(String nombre) {
        super("Division");
    }

    /**
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public double realisarOperacion(Numero num1, Numero num2) {
        if (num2.getValor() == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return num1.getValor() / num2.getValor();
    }
}
