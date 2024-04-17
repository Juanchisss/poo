package com.juanchis.juego.app;

import com.juanchis.juego.dominio.Juego;

import javax.swing.*;
import java.util.Arrays;

public class AppJuego {
    public static final ImageIcon ICONOJUEGO = new ImageIcon(AppJuego.class.getResource("iconojuego.png"));
    public static final int Jugar = 1;
    public AppJuego() {

    }

    int opcion =   JOptionPane.showOptionDialog(null, "Bienvenid@. ¿Que quieres hacer", "Juego",
            0,0, ICONOJUEGO, Arrays.asList("A","Jugar","Resultados").toArray() , null);



    }

    //    String nombre = (String) JOptionPane.showInputDialog(null, "¿Que vas a seleccionar?",
    //           "Juego Rock Pappers Sickosr", JOptionPane.QUESTION_MESSAGE, ICONOJUEGO, Arrays.asList("Piedra", "Papel", "Tijera").toArray(), null);




