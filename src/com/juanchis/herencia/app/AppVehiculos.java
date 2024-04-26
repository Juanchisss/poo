package com.juanchis.herencia.app;

import com.juanchis.herencia.dominio.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppVehiculos {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo nando = new Vehiculo("Nando","A pata");

        Carro corolirri = new Carro("Toyota", "Corola");

        Taxi taxi = new Taxi("Hyundai", "Accent", "Copebombasx");

        Bicicleta bici = new Bicicleta("Trek","Marlin7");

        BiciRuta biciRuta = new BiciRuta("Dogma","Pinarello");

        vehiculos.add(nando);
        vehiculos.add(corolirri);
        vehiculos.add(taxi);
        vehiculos.add(bici);
        vehiculos.add(biciRuta);

        acelerarVehiculos(vehiculos);

    }

    public static void acelerarVehiculos(List<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
//            if (vehiculo instanceof Carro) {
//                System.out.println("Soy un carro...");
//            } else if (vehiculo instanceof Bicicleta) {
//                System.out.printf("Soy una Bici...");
//            }

            vehiculo.acelerar(new Random().nextInt(100));
            System.out.printf(vehiculo + "va a " + vehiculo.getVelocidad() + "Km/H\n");

        }
    }

        public static void frenarVehiculos(List<Vehiculo> vehiculos){
            for(Vehiculo vehiculo : vehiculos){
                if(vehiculo instanceof Carro){
                    System.out.printf("Soy un carro...");
                }
                else if (vehiculo instanceof  Bicicleta) {
                    System.out.printf("Soy una bici...");
                }

                vehiculo.frenar(new Random().nextInt(100));
                System.out.printf(vehiculo + "ha frenado hasta llegar a " + vehiculo.getVelocidad() + "Km/h");
            }
        }

}
