package com.juanchis.veterinaria.dominio;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private List<Mascota> pacientes;

    public Veterinaria() {
        this.pacientes = new ArrayList<>();
    }

    //agregar condicion de no esterilizado?
    public Mascota revisarMascota(String nombre, String sexo, int edad) {
        Mascota mascota = null;
        if (sexo.contains("F") && edad >= 18 | sexo.contains("H") && edad >= 12) {
            mascota = new MascotaApta(nombre, sexo, edad);
        } else {
            mascota = new MascotaNoApta(nombre, sexo, edad);
        }

        pacientes.add(mascota);
        System.out.println(mascota);
        return mascota;
    }

    public List<MascotaApta> getPacientesAOperar() {
        List<MascotaApta> mascotasOperar = new ArrayList<>();
        for (Mascota pet : pacientes) {
            if (pet instanceof MascotaApta && !pet.isEsterilizado()) {
                mascotasOperar.add((MascotaApta) pet);
            }
        }
        System.out.println(mascotasOperar);
        return mascotasOperar;
    }

    public void operarATodos() {
        for (MascotaApta mascOperar : getPacientesAOperar()) {
            mascOperar.operar();
        }
    }

    public void operar(String nombre) throws MascotaNoOperableException, MascotaOperadaException {
        for (Mascota mascota : pacientes) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                if (!(mascota instanceof MascotaApta)) {
                    throw new MascotaNoOperableException("La mascota no es operable");
                } else if (mascota.isEsterilizado()) {
                    throw new MascotaOperadaException("La mascota ya esta operada");
                } else {
                    ((MascotaApta) mascota).operar();
                }
            }

        }
    }

}

