package com.juanchis.oftalmologo.app;

import com.juanchis.oftalmologo.dominio.Oftalmologo;

public class AppOftal {
    public static void main(String[] args) {
        Oftalmologo ofta = new Oftalmologo();

        ofta.revisarPaciente("Juan", 18);
        ofta.revisarPaciente("Pedro", 20);
        ofta.revisarPaciente("Ana", 41);

        ofta.getPacientesAOperar();

    }
}
