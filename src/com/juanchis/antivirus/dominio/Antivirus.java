package com.juanchis.antivirus.dominio;

import java.util.List;

public class Antivirus {
    public void escanear(List<Viruseable> elementos) {
        int contVirus = 0;

        for (Viruseable elemento : elementos) {
            if (elemento.tieneVirus()) {
                contVirus++;
                System.out.println(elemento.getNombre() + " tiene virus.");
            }

            System.out.println("Se encontraron " + contVirus + " archivos infectados.");
        }
    }
}
