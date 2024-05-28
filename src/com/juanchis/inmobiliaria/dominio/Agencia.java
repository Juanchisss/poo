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


    public boolean arrendar(Arrendable inmueble) {
        if (inmueble instanceof Arrendable) {
            Arrendable arrendable = inmueble;
            inmueble.arrendar();
            return true;
        }
        return false;
    }

    //sugerencia de ia, con la diferencia del casteo

    public boolean devolver(Inmueble inmueble) {
        if (inmueble instanceof Arrendable) {
            Arrendable arrendable = (Arrendable) inmueble;
            if (inmueble.arrendado) {
                arrendable.devolver();
                return true;
            }
        }
        return false;
    }

    public boolean vender (Inmueble inmueble){
        if (!inmueble.arrendado){
            inmuebles.remove(inmueble);
        }
        return true;
    }

    public List<Inmueble> getArrendablesDisponibles(){
        List<Inmueble> disponibles = new ArrayList<>();
        for(Inmueble inmueble : inmuebles){
            if (inmueble instanceof Arrendable && !inmueble.arrendado){
                Arrendable arrendable = (Arrendable) inmueble;
                disponibles.add(inmueble);
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
            }
        }
        return arrendados;
    }

}


