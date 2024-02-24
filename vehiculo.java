package vehiculo;
import java.util.*;

public class Vehiculo {
    Scanner entrada = new Scanner(System.in);

    String marcaVehiculo;
    int modeloVehiculo;
    int motorVehiculo;
    int cantidadPuertas;
    int capacidadAsientos;
    int velocidadMaxima;
    int velocidadActual = 0;
    enum Color {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
    Color color;

    enum TipoVehiculo {DEPORTIVO, SEDAN, CAMIONETA, FURGONETA, COUPE}
    TipoVehiculo tipoVehiculo;

    enum TipoCombustible {GASOLINA, ETANOL, DIESEL, GAS, HIBRIDO}
    TipoCombustible tipoCombustible;

    int multas = 0;
    double valorMulta = 200000;

    public Vehiculo(String marcaVehiculo, int modeloVehiculo, int motorVehiculo, int cantidadPuertas, int capacidadAsientos, int velocidadMaxima, Color color, TipoVehiculo tipoVehiculo, TipoCombustible tipoCombustible) {
        this.marcaVehiculo = marcaVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.motorVehiculo = motorVehiculo;
        this.cantidadPuertas = cantidadPuertas;
        this.capacidadAsientos = capacidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoCombustible = tipoCombustible;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public int getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(int modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public int getMotorVehiculo() {
        return motorVehiculo;
    }

    public void setMotorVehiculo(int motorVehiculo) {
        this.motorVehiculo = motorVehiculo;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCapacidadAsientos() {
        return capacidadAsientos;
    }

    public void setCapacidadAsientos(int capacidadAsientos) {
        this.capacidadAsientos = capacidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
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

    void imprimirDetalles() {
        System.out.println("Detalles del vehículo:");
        System.out.println("Marca: " + marcaVehiculo);
        System.out.println("Modelo: " + modeloVehiculo);
        System.out.println("Motor: " + motorVehiculo);
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
        System.out.println("Capacidad de asientos: " + capacidadAsientos);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
        System.out.println("Color: " + Color.AZUL);
        System.out.println("Tipo de vehículo: " + TipoVehiculo.FURGONETA);
        System.out.println("Tipo de combustible: " + TipoCombustible.GASOLINA);
    }
}
