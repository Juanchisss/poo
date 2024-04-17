package com.juanchis.calculadora.dominio;

public class Calculadora {

    public static double sumar(double[] numeros) {
        double resultado = 0;
        for (double numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public static double restar(double[] numeros) {
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }

    public static double multiplicar(double[] numeros) {
        double resultado = 1;
        for (double numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }

    public static double dividir(double a, double b, boolean redondear) {
        return a / b;
    }
}
