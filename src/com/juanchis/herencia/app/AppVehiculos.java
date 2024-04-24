package com.juanchis.herencia.app;

import com.juanchis.herencia.dominio.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppVehiculos {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo nando = new Vehiculo();

        Carro corolirri = new Carro();

        Taxi taxi = new Taxi();

        Bicicleta bici = new Bicicleta();

        BiciRuta biciRuta = new BiciRuta();

        vehiculos.add(nando);
        vehiculos.add(corolirri);
        vehiculos.add(taxi);
        vehiculos.add(bici);
        vehiculos.add(biciRuta);

        acelerarVehiculos(vehiculos);

        frenarVehiculos(vehiculos);
    }

    public static void acelerarVehiculos(List<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Carro) {
                System.out.println("Soy un carro...");
            } else if (vehiculo instanceof Bicicleta) {
                System.out.printf("Soy una Bici...");
            }

            vehiculo.acelerar(new Random().nextInt(100));
            System.out.printf("El" + vehiculo + "Va a " + vehiculo.getVelocidad() + "Km/H");

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
                System.out.printf("El" + vehiculo + "ha frenado hasta llegar a " + vehiculo.getVelocidad() + "Km/h");
            }
        }

}
