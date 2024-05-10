package com.juanchis.tiendaBicis.dominio;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    protected ArrayList<Empleado> empleados;

    public Nomina(){this.empleados = new ArrayList<>();

        Empleado juan = new Directo("Juanchis", 4_840_000);
        empleados.add(juan);

        Empleado julian = new Vendedor("Julian", 2_050_000,45_510_000);
        empleados.add(julian);

        Empleado johana = new Freelance("Johana", 71_000, 89);
        empleados.add(johana);

        Empleado david = new Directo("David", 3_975_000);
        empleados.add(david);

        Empleado gustavo = new Freelance("Gustavin", 42_500,65);
        empleados.add(gustavo);

    }


    public void calcularNomina() {
        for (Empleado empleado : empleados) {
            System.out.println("Salario de " + empleado.getNombre() + ": " + empleado.calcularSalario());
        }
        long total = 0;
        for (Empleado empleados : empleados) {
            total += empleados.calcularSalario();
        }
        System.out.println("El total de la nomina es: " + total );
    }

    public void listarDirectos(){
        System.out.printf("Empleados Directos\n");
        for(Empleado empleado : empleados){
            List<Empleado> directos = new ArrayList<>();
            if (empleado instanceof Directo){
                directos.add(empleado);
            }
            for (Empleado directo : directos){
                System.out.println(directo);
            }
        }
    }

    public void listarFreelancers(){
        System.out.printf("Empleados Freelancers \n");
        for(Empleado empleado : empleados){
            List<Freelance> freelancers = new ArrayList<>();
            if(empleado instanceof Freelance){
                freelancers.add((Freelance) empleado);
            }
            for(Freelance free : freelancers){
                System.out.println(free);
            }

        }
    }

}
