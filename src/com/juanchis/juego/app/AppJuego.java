package com.juanchis.juego.app;

import com.juanchis.juego.dominio.Juego;
import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AppJuego {
    public static final ImageIcon ICONOJUEGO = new ImageIcon(AppJuego.class.getResource("iconojuego.png"));
    public static List<String> opciones = Arrays.asList("Piedra", "Papel", "Tijera");
    public static int victorias = 0;
    public static int derrotas = 0;
    public static int empates = 0;

    public static void main(String[] args) {
        while (true) {
            int opcion = JOptionPane.showOptionDialog(null, "Bienvenid@. \n ¿Qué quieres hacer?", "Juego",
                    0, 0, ICONOJUEGO, Arrays.asList("Instrucciones", "Jugar", "Resultados").toArray(), null);

            if (opcion == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
            }

            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Estas son las instrucciones perra");
                    break;

                case 1:
                    int opcionUsuario = JOptionPane.showOptionDialog(null, "Selecciona tu jugada", "Jueguito",
                            0, 0, ICONOJUEGO, opciones.toArray(), null);

                    if (opcionUsuario != JOptionPane.CLOSED_OPTION) {
                        // La computadora elige aleatoriamente una opción
                        Random random = new Random();
                        int indiceAleatorio = random.nextInt(opciones.size());
                        String jugadaComputadora = opciones.get(indiceAleatorio);

                        // Comparación de jugadas
                        String resultado = compararJugadas(opcionUsuario, jugadaComputadora);

                        // Actualizar historial
                        if (resultado.equals("Ganaste")) {
                            victorias++;
                        } else if (resultado.equals("Perdiste")) {
                            derrotas++;
                        } else {
                            empates++;
                        }

                        // Mostrar resultado
                        JOptionPane.showMessageDialog(null, "Tu jugada: " + opciones.get(opcionUsuario) +
                                "\nJugada de la computadora: " + jugadaComputadora + "\nResultado: " + resultado);
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Historial de partidas:\n" +
                            "Victorias: " + victorias + "\nDerrotas: " + derrotas + "\nEmpates: " + empates);
                    break;
            }
        }
    }

    public static String compararJugadas(int opcionUsuario, String jugadaComputadora) {
        String opcionUsuarioStr = opciones.get(opcionUsuario);

        if (opcionUsuarioStr.equals(jugadaComputadora)) {
            return "Empate";
        } else if ((opcionUsuarioStr.equals("Piedra") && jugadaComputadora.equals("Tijera")) ||
                (opcionUsuarioStr.equals("Papel") && jugadaComputadora.equals("Piedra")) ||
                (opcionUsuarioStr.equals("Tijera") && jugadaComputadora.equals("Papel"))) {
            return "Ganaste";
        } else {
            return "Perdiste";
        }
    }
}
