package com.dh.meli.testes01.calculadora;

public class Calculadora {

    public double soma(double a, double b) {
        return a + b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}