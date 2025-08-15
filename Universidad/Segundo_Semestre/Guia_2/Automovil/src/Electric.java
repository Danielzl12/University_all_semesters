// Clase que representa un automóvil eléctrico
public class Electric extends Automovil {
    // Autonomía estimada con una carga completa (en kilómetros)
    int autonomia_en_km;


    // Constructor que inicializa atributos del automóvil eléctrico y los comunes de la clase base
    public Electric(String marca, String modelo, String color, String tipo_de_transmision, int autonomia_en_km) {
        super(marca, modelo, color, tipo_de_transmision);
        this.autonomia_en_km = autonomia_en_km;
    }

    // metodo para cargar bateria
    public void cargarBateria() {
        System.out.println("Conectando el " + this.marca + " " + this.modelo + " a la estación de carga rápida.");
    }
}