package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraModelTest {

    // Prueba del método sumar
    @Test
    void testSumar() {

        CalculadoraModel calculadora = new CalculadoraModel();

        double resultado = calculadora.sumar(5, 3);

        assertEquals(8, resultado);
    }

    // Prueba del método restar
    @Test
    void testRestar() {

        CalculadoraModel calculadora = new CalculadoraModel();

        double resultado = calculadora.restar(10, 4);

        assertEquals(6, resultado);
    }

    // Prueba del método multiplicar
    @Test
    void testMultiplicar() {

        CalculadoraModel calculadora = new CalculadoraModel();

        double resultado = calculadora.multiplicar(5, 4);

        assertEquals(20, resultado);
    }

    // Prueba del método dividir
    @Test
    void testDividir() {

        CalculadoraModel calculadora = new CalculadoraModel();

        double resultado = calculadora.dividir(10, 2);

        assertEquals(5, resultado);
    }

    // Prueba de suma con dos números negativos
    @Test
    void testSumarNegativos() {

        CalculadoraModel calculadora = new CalculadoraModel();

        double resultado = calculadora.sumar(-5, -3);

        assertEquals(-8, resultado);
    }


    // Prueba de suma con un número negativo y otro positivo
    @Test
    void testSumarNegativoPositivo() {

        CalculadoraModel calculadora = new CalculadoraModel();

        double resultado = calculadora.sumar(-5, 3);

        assertEquals(-2, resultado);
    }


    // Prueba de resta con dos números negativos
    @Test
    void testRestarNegativos() {

        CalculadoraModel calculadora = new CalculadoraModel();

        double resultado = calculadora.restar(-5, -3);

        assertEquals(-2, resultado);
    }
}