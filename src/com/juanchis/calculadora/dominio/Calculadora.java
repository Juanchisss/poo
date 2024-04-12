package com.juanchis.calculadora.dominio;

public class   Calculadora {
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b, boolean redondear) {
        return a / b;
    }
}
