package com.juanchis.parcial.dominio;

import com.juanchis.parcial.dominio.Paciente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Eps {
    public static final byte capacidadMax = 100;
    private String nombre;
    private ArrayList<Paciente> pacientes = new ArrayList<>();

    public Eps(String nombre) {
        this.nombre = nombre;
    }


    Paciente paciente = new Paciente("Juan", 123);

    //METODOS

    public boolean afiliarPaciente(long cedula, String nombre) {

        for (Paciente p : this.pacientes) {
            if (p.getCedula() == cedula) {
                System.out.println("El paciente con la cedula " + cedula + " ya existe.");
                return false;
            }
        }

        if (this.pacientes.size() < capacidadMax) {
            this.pacientes.add(paciente);
            return true;
        } else {
            System.out.println("La lista de pacientes esta llena.");
        }
        return false;
    }

    public void sacarPaciente(long cedula) {
        pacientes.removeIf(paciente -> paciente.getCedula() == cedula);
    }

    public void buscarPaciente(long cedula) {
        for (Paciente pacientes : pacientes) {
            if (pacientes.getCedula() == cedula) ;
            System.out.printf("El paciente con la cedula" + cedula + "es" + nombre);
        }
    }

    public List<Paciente> buscarPacientesPorEnfermedad(Enfermedad nombre) {
        return this.pacientes.stream().filter(enf -> enf.getEnfermedades().equals(nombre)).toList();
    }

    public List<Paciente> obtenerPacientesSinEnfermedades() {
        List<Paciente> pacientesSinEnfermedades = new ArrayList<>();
        for (Paciente paciente : pacientes) {
            if (paciente.getEnfermedades() == null) {
                pacientesSinEnfermedades.add(paciente);
            } else {
                System.out.println("No hay pacientes enfermos");
            }
        }

            return pacientesSinEnfermedades;
    }

        public void ordenarPacientesPorNombre() {
            this.pacientes.stream().sorted((p1, p2) -> p1.getNombre().compareTo(p2.getNombre())).collect(Collectors.toList());
        }
    }

