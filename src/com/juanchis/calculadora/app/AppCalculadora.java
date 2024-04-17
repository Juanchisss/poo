package com.juanchis.calculadora.app;

import com.juanchis.calculadora.dominio.Calculadora;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class AppCalculadora {
    public static final int SUMAR = 0;
    public static final int RESTAR = 1;
    public static final int MULTIPLICAR = 2;
    public static final int DIVIDIR = 3;
    public static final ImageIcon ICONO = new ImageIcon(AppCalculadora.class.getResource("IconoUco.png"));
    public static JCheckBox redondeoCheckbox = new JCheckBox("¿Redondear?");

    public static void main(String[] args) {
        while (true) {

            int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros desea operar?"));

            double[] numeros = new double[n];
            for (int i=0; i < n; i++ ){
                numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor: " + (i+1)));
            }

            int opcion = JOptionPane.showOptionDialog(null, "Selecciona una operación",
                    "POO - Calculadora", 0, 0, ICONO,
                    Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir", redondeoCheckbox).toArray(), null);

            if (opcion == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
            }

            double resultado = 0;

            switch (opcion) {
                case SUMAR -> resultado = Calculadora.sumar(numeros);
                case RESTAR -> resultado = Calculadora.restar(numeros);
                case MULTIPLICAR -> resultado = Calculadora.multiplicar(numeros);
                case DIVIDIR -> resultado = Calculadora.dividir(numeros[0], numeros[1], false);
            }


            if (redondeoCheckbox.isSelected()) {
                resultado = Math.round(resultado);
            }
            mostrarMensaje("El resultado es " + resultado);
        }


        }
        public static void mostrarMensaje (String mensaje){
            JOptionPane.showMessageDialog(null, mensaje,
                    "POO - Calculadora", JOptionPane.ERROR_MESSAGE, ICONO);
        }
    }


