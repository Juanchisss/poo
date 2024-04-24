package com.juanchis.persona.app;

import com.juanchis.persona.dominio.Estudiante;
import com.juanchis.persona.dominio.Persona;
import com.juanchis.persona.dominio.Profesor;

import java.util.ArrayList;
import java.util.List;

    public class appPersona {
        public static void main(String[] args) {
            List<Estudiante> estudiantes = new ArrayList<>();
            List<Profesor> profesores = new ArrayList<>();
            List<String> asignaturas = new ArrayList<>();

            Persona pedrito = new Persona();

            Estudiante juanchis = new Estudiante("Juanchis");

            Profesor alejo = new Profesor("Alejo", asignaturas);

            estudiantes.add(juanchis);
            profesores.add(alejo);


            alejo.setAsignaturas(asignaturas);

            asignaturas.add("POO");

            juanchis.caminar();
            pedrito.caminar();

            Estudiante.estudiar(estudiantes);
            Profesor.ensenar(profesores);


        }



    }
