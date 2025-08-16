// clase que representa un automóvil de combustión (gasolina)
public class Gasolina extends Automovil {


    // constructor que delega la inicialización de atributos comunes a la clase base
    public Gasolina(String marca, String modelo, String color, String tipo_de_transmision) {
        super(marca, modelo, color, tipo_de_transmision);
    }

    // metodo para cargar la gasolina
    public void cargarCombustible() {
        System.out.println("Cargando gasolina en el " + this.marca + " " + this.modelo + "...");
    }
}