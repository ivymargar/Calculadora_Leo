package org.example;

/**
 * Modelo de la calculadora.
 * Contiene las operaciones matemáticas básicas que puede realizar la aplicación.
 *
 * @author Leo Martínez
 */

public class CalculadoraModel {

    /**
     * Realiza la suma de dos números.
     *
     * @param a primer número de la operación
     * @param b segundo número de la operación
     * @return resultado de sumar a y b
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Realiza la resta de dos números.
     *
     * @param a primer número de la operación
     * @param b segundo número de la operación
     * @return resultado de restar b a a
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Realiza la multiplicación de dos números.
     *
     * @param a primer número de la operación
     * @param b segundo número de la operación
     * @return resultado de multiplicar a por b
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Realiza la división de dos números.
     *
     * @param a dividendo de la operación
     * @param b divisor de la operación
     * @return resultado de dividir a entre b
     */
    public double dividir(double a, double b) {
        return a / b;
    }
}