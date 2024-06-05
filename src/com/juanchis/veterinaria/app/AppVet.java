package com.juanchis.veterinaria.app;

import com.juanchis.veterinaria.dominio.*;

public class AppVet {
    public static void main(String[] args) throws MascotaOperadaException, MascotaNoOperableException {
        Veterinaria vet = new Veterinaria();

        vet.revisarMascota("Lola", "F", 21);
        vet.revisarMascota("Juan", "M", 11);

        vet.getPacientesAOperar();
        vet.operar("Lola");
        vet.operar("Juan");
//        vet.operar("Lola");
        vet.operarATodos();


    }
}
