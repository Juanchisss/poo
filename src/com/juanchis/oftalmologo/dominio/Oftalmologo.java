package com.juanchis.oftalmologo.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Oftalmologo {
    private String nombre;
    private List<Paciente> pacientes;

    public Oftalmologo(){this.pacientes = new ArrayList<>();}

    public Paciente revisarPaciente(String nombre, int edad){
        Paciente paciente1 = null;
        //Con ambos if compruebo 1. que sea operable y 2 que sea apto
        if(nombre.toLowerCase().contains("a")){
            if (edad <= 40) {
                paciente1 = new PacienteApto(nombre, edad, true);
            } else {
            paciente1 = new PacienteNoApto(nombre, edad, true);
            }

        }else {
            paciente1 = new PacienteNoApto(nombre, edad, false);
        }
        pacientes.add(paciente1);
        return paciente1;
    }

    public void operarPacientes(){
        for(Paciente paciente : pacientes){
            if (paciente instanceof PacienteApto) {
                ((PacienteApto) paciente).operar();
            }
        }
    };

    public List<PacienteApto> getPacientesAOperar(){
        List<PacienteApto> pacienteAptos = new ArrayList<>();
        for(Paciente apto : pacientes){
            if (apto.isNecesitaCirugia() && apto instanceof PacienteApto ){
                pacienteAptos.add((PacienteApto) apto);
            }
        }
        return pacienteAptos;
    }
//
//    public List<PacienteApto> getPacientesAOperar() {
//        return pacientes.stream()
//                .filter(paciente -> paciente.isNecesitaCirugia() && paciente instanceof PacienteApto)
//                .map(paciente -> (PacienteApto) paciente)
//                .collect(Collectors.toList());
//    }
}
