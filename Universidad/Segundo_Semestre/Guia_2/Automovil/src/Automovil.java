// Clase base que representa un automóvil genérico con propiedades comunes
public class Automovil {
    // Marca del automóvil (por ejemplo: BMW, Tesla)
    String marca;
    // Modelo del automóvil (por ejemplo: Serie 3, Model S)
    String modelo;
    // Color de la carrocería
    String color;
    // Tipo de transmisión (manual o automática)
    String tipo_de_transmision;

    // Constructor que inicializa los atributos comunes del automóvil
    public Automovil(String marca, String modelo, String color, String tipo_de_transmision) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo_de_transmision = tipo_de_transmision;
    }

    // Método que simula la acción de acelerar
    public void acelerar() {
        System.out.println("El " + this.marca + " " + this.modelo + " está acelerando.");
    }

    // Método que simula la acción de frenar
    public void frenar() {
        System.out.println("El " + this.marca + " " + this.modelo + " está frenando.");
    }
}