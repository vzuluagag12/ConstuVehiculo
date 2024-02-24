package vehiculo;

import java.util.Scanner;

public class Vehiculo {
    Scanner entrada = new Scanner(System.in);
    
    String marca;
    int modelo;
    int motor;
    int numPuertas;
    int capacidadAsientos;
    int velocidadMaxima;
    int velocidadActual = 0;

    enum Color {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
    Color color;

    enum Tipo {DEPORTIVO, SEDAN, CAMIONETA, FURGONETA, COUPE, SUV}
    Tipo tipo;

    enum Combustible {GASOLINA, ETANOL, DIESEL, GAS, HIBRIDO}
    Combustible combustible;

    int multas = 0;
    double valorMulta = 200000;

    public Vehiculo(String marca, int modelo, int motor, int numPuertas, int capacidadAsientos, int velocidadMaxima, Color color, Tipo tipo, Combustible combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.numPuertas = numPuertas;
        this.capacidadAsientos = capacidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.tipo = tipo;
        this.combustible = combustible;
    }

    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad <= velocidadMaxima && velocidadActual + incrementoVelocidad > 200) {
            velocidadActual += incrementoVelocidad;
            multas++;
            System.out.println("¡Cuidado! Multa por exceso de velocidad: " + velocidadActual + " km/h");
        } else {
            System.out.println("La velocidad del vehículo está limitada a 250 km/h");
        }
    }

    void desacelerar(int decrementoVelocidad) {
        if ((velocidadActual - decrementoVelocidad) > 0) {
            velocidadActual -= decrementoVelocidad;
        } else {
            System.out.println("No se puede disminuir la velocidad más allá de cero");
        }
    }

    void frenar() {
        velocidadActual = 0;
    }

    void mostrarMulta() {
        System.out.println("Número de multas acumuladas: " + multas);
        multas *= valorMulta;
        System.out.println("El valor total de las multas es de " + multas);
    }

    double calcularTiempoLlegada(double distancia) {
        return distancia / velocidadActual;
    }

    void mostrarTiempoLlegada(double distancia) {
        double tiempo = calcularTiempoLlegada(distancia);
        System.out.println("A una distancia de " + distancia + " km, a una velocidad de " + velocidadActual + " km/h, el tiempo estimado de llegada es de " + tiempo + " horas");
    }

    void mostrarDetalles() {
        System.out.println("Detalles del vehículo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor);
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("Capacidad de asientos: " + capacidadAsientos);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
        System.out.println("Color: " + color);
        System.out.println("Tipo de vehículo: " + tipo);
        System.out.println("Tipo de combustible: " + combustible);
    }
}
