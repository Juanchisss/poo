package com.juanchis.inmobiliaria.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;
    private ArrayList<Inmueble> inmuebles;

    public Agencia(String nombre){
        this.nombre = nombre;
        this.inmuebles = new ArrayList<>();
    }

    public void agregarInmueble(Inmueble i){
        this.inmuebles.add(i);
    }

    public boolean arrendar(Inmueble inmueble){
        try {
            if(inmueble.isArrendado()){
                throw new ArrendadoException();
            }
            else if (!(inmueble instanceof Arrendable)){
                throw new InmuebleNoArrendableException();
            }
            ((Arrendable) inmueble).arrendar();
        } catch (ArrendadoException | InmuebleNoArrendableException e) {
            System.out.println(e.getMessage());;
        }
        return true;
    }


    public boolean devolver(Inmueble inmueble) {
        try {
            if (inmueble instanceof Arrendable) {
                Arrendable arrendable = (Arrendable) inmueble;
                if (inmueble.arrendado) {
                    arrendable.devolver();
                } else if (!(inmueble.isArrendado())) {
                    throw new RuntimeException("El inmueble no está arrendado.");
                }

            }
        } catch (RuntimeException e) {
            System.out.println("El inmueble no está arrendado");
        }

        return true;
    }

    public boolean vender (Inmueble inmueble) throws ArrendadoException {
        try {
            if (!inmueble.arrendado) {
                inmuebles.remove(inmueble);
            }else {
                throw new ArrendadoException();
            }
        } catch (ArrendadoException e) {
            System.out.println ("No se puede vender el inmuebl. " + e.getMessage());;
        }

        return true;
    }

    public List<Inmueble> getArrendablesDisponibles(){
        List<Inmueble> disponibles = new ArrayList<>();
        for(Inmueble inmueble : inmuebles){
            if (inmueble instanceof Arrendable && !inmueble.arrendado){
                disponibles.add(inmueble);
                System.out.println(inmueble);
            }
        }
        return disponibles;
    }

    public List<Inmueble> getArrendados(){
        List<Inmueble> arrendados = new ArrayList<>();
        for(Inmueble arren : inmuebles){
            if(arren instanceof Arrendable && arren.arrendado){
                Arrendable arrendable = (Arrendable) arren;
                arrendados.add(arren);
                System.out.println(arren);
            }
        }
        return arrendados;
    }


}




