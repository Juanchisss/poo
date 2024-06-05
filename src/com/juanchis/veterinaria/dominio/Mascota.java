package com.juanchis.veterinaria.dominio;

public abstract class Mascota {
    protected String nombre;
    protected String sexo;
    protected int edad;
    protected boolean esterilizado = false;

    public Mascota(String nombre,String sexo,int edad){
        this.nombre=nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }


    public int getEdad() {
        return edad;
    }


    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }
}
