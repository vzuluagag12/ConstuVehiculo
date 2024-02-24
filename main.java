package vehiculo;

import vehiculo.Vehiculo.Tipo;
import vehiculo.Vehiculo.Color;
import vehiculo.Vehiculo.Combustible;

public class Main {

    public static void main(String[] args) {

        Vehiculo miVehiculo = new Vehiculo("Toyota", 2018, 6, 4, 5, 250, Color.NARANJA, Tipo.SUV, Combustible.GASOLINA);
        miVehiculo.mostrarDetalles();

        System.out.println("Velocidad permitida en carretera: 200 km/h");

        miVehiculo.velocidadActual = 180;
        System.out.println("\nVelocidad actual = " + miVehiculo.velocidadActual);

        miVehiculo.acelerar(60);
        System.out.println("Acelerando, velocidad actual = " + miVehiculo.velocidadActual);

        miVehiculo.acelerar(60);
        System.out.println("Acelerando, velocidad actual = " + miVehiculo.velocidadActual);

        miVehiculo.desacelerar(50); 
        System.out.println("Desacelerando, velocidad actual = " + miVehiculo.velocidadActual);

        miVehiculo.acelerar(70);
        System.out.println("Acelerando, velocidad actual = " + miVehiculo.velocidadActual);

        miVehiculo.desacelerar(50);
        System.out.println("Desacelerando, velocidad actual = " + miVehiculo.velocidadActual);

        miVehiculo.mostrarTiempoLlegada(800);

        miVehiculo.frenar();
        System.out.println("Frenando, velocidad actual = " + miVehiculo.velocidadActual);

        miVehiculo.desacelerar(20);

        miVehiculo.mostrarMulta();
    }
}

