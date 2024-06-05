package com.juanchis.veterinaria.dominio;

public class MascotaApta extends Mascota implements Operable{
    public MascotaApta(String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
    }


    @Override
    public void operar() {
        this.esterilizado = true;
    }
}
