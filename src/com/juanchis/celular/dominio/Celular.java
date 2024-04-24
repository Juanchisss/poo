package com.juanchis.celular.dominio;

import com.juanchis.taller.punto1.dominio.Agenda;
import com.juanchis.taller.punto1.dominio.Contacto;

import java.util.List;

public class Celular {
    private String marca;
    private boolean encendido;
    private int botones;
    private List<Agenda> contactos;


    public void encenderPantalla(boolean encendido){
        if(encendido == true){
            System.out.printf("Pantalla encendida\n");
        }

    }

    public Contacto verContacto(String nombre){
    return (Contacto) new Agenda().buscar(nombre);
    }

    public String getMarca() {return marca;}

    public boolean isEncendido() {return encendido;}

    public void setEncendido(boolean encendido) {this.encendido = encendido;}

    public int getBotones() {return botones;}

    public void setBotones(int botones) {this.botones = botones;}

    public List<Agenda> getContactos() {return contactos;}

    public void setContactos(List<Agenda> contactos) {this.contactos = contactos;}
}
