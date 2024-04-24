package com.juanchis.celular.app;

import com.juanchis.celular.dominio.Celular;
import com.juanchis.celular.dominio.Smarthphone;

import java.util.ArrayList;
import java.util.List;


public class AppCelular {
    public static void main(String[] args) {
    Celular celu = new Celular();
    Smarthphone iphone = new Smarthphone();
    Celular xs = new Smarthphone();

    List<Celular> dispositivos = new ArrayList<>();

    dispositivos.add(celu);
    dispositivos.add(iphone);
    dispositivos.add(xs);

    mostrarDispositivos(dispositivos);

    //INTENTO POR IMPORTAR AGENDA Y HACER USO DE SUS CONTACTOS Y METODOS
    //celu.verContacto("Juanchis");


    }

public static void mostrarDispositivos(List<Celular> dispositivos){
        for (Celular dispositivo : dispositivos){
            if (dispositivo instanceof Smarthphone){
                System.out.printf("Soy un Iphone bro, porque soy Smart\n");
            }
            else  {
                System.out.printf("Soy un celular panela bro\n");
            }

            dispositivo.encenderPantalla(true);
        }

}

}
