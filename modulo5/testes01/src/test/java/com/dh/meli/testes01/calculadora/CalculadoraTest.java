package com.dh.meli.testes01.calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {
    Calculadora calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculadora();
        System.out.printf("Before");
    }

        // dado_que_quando_então
        // metodosTestados_oqueéEsperado_DadosFornecidos
        @Test
        @DisplayName("Valida Soma")
        void testSoma_returnDouble_whenValidInput() {
            double n1 = 10;
            double n2 = 20;
            double expected = 30;
            double resultado = calc.soma(n1, n2);
            assertEquals(expected, resultado, 0);
        }

        @Test
        void testDivide_returnDouble_whenTwoPositiveNumbers() {
            double n1 = 30;
            double n2 = 3;
            double expected = 10;
            double resultado = calc.divide(n1, n2);
            assertEquals(expected, resultado, 0);
        }

    @Test
    void testDivide_returnZero_whenDivisorIqualsZero() {
        double n1 = 30;
        double n2 = 0;
        double expected = 0;
        double resultado = calc.divide(n1, n2);
        assertEquals(expected, resultado, 0);
    }
}
