package vehiculo;

import vehiculo.Vehiculo.TipoVehiculo;
import vehiculo.Vehiculo.Color;
import vehiculo.Vehiculo.TipoCombustible;

public class Main {

    public static void main(String[] args) {

        Vehiculo miVehiculo = new Vehiculo("Toyota", 2018, 6, 4, 5, 250, Color.NARANJA, TipoVehiculo.SUV, TipoCombustible.GASOLINA);
        miVehiculo.mostrarDetalles();

        System.out.println("Velocidad permitida en carretera: 200 km/h");

        miVehiculo.setVelocidadActual(180);
        System.out.println("\nVelocidad actual = " + miVehiculo.getVelocidadActual());

        miVehiculo.acelerar(60);
        System.out.println("Acelerando, velocidad actual = " + miVehiculo.getVelocidadActual());

        miVehiculo.acelerar(60);
        System.out.println("Acelerando, velocidad actual = " + miVehiculo.getVelocidadActual());

        miVehiculo.desacelerar(100);
        System.out.println("Desacelerando, velocidad actual = " + miVehiculo.getVelocidadActual());

        miVehiculo.acelerar(70);
        System.out.println("Acelerando, velocidad actual = " + miVehiculo.getVelocidadActual());

        miVehiculo.desacelerar(100);
        System.out.println("Desacelerando, velocidad actual = " + miVehiculo.getVelocidadActual());

        miVehiculo.mostrarTiempoLlegada(400);

        miVehiculo.frenar();
        System.out.println("Frenando, velocidad actual = " + miVehiculo.getVelocidadActual());

        miVehiculo.desacelerar(20);

        miVehiculo.mostrarMulta();
    }
}
