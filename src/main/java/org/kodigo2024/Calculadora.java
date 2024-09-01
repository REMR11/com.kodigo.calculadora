package org.kodigo2024;

public class Calculadora {
    private Operacion operacion;

    public Calculadora(Operacion operacion) {
        this.operacion = operacion;
    }

    public double relizaOperacion(Numero num1, Numero num2){
        return operacion.realisarOperacion(num1, num2);
    }
}
