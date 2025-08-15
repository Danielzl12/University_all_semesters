// Clase que representa a un conductor que opera un automóvil
public class Conductor {
    // Nombre del conductor
    String nombre;
    // Referencia al vehículo que el conductor está utilizando
    Automovil vehiculo_que_conduce;

    // Constructor que asocia un conductor con un vehículo
    public Conductor(String nombre, Automovil vehiculo) {
        this.nombre = nombre;
        this.vehiculo_que_conduce = vehiculo;
        System.out.println("El conductor " + nombre + " se ha subido a su " + vehiculo.marca + " " + vehiculo.modelo + ".");
    }

    // Metodo de acelerar
    public void pisarAcelerador() {
        System.out.print(this.nombre + " decide acelerar. ");
        this.vehiculo_que_conduce.acelerar();
    }

    // Metodo de freno
    public void pisarFreno() {
        System.out.print(this.nombre + " necesita detenerse. ");
        this.vehiculo_que_conduce.frenar();
    }

    // Intenta ir a una gasolinera. Solo tiene sentido si el vehículo es de gasolina
    public void irALaGasolinera() {
        // instanceof verifica si el objeto es de un tipo específico
        if (vehiculo_que_conduce instanceof Gasolina) {

            Gasolina autoGasolina = (Gasolina) vehiculo_que_conduce;
            autoGasolina.cargarCombustible();
        } else {
            System.out.println(this.nombre + " intentó ir a la gasolinera,pero su carro es eléctrico");
        }
    }

    // Busca una estación de carga. Solo tiene sentido si el vehículo es eléctrico
    public void buscarEstacionDeCarga() {
        if (vehiculo_que_conduce instanceof Electric) {
            Electric autoElectrico = (Electric) vehiculo_que_conduce;
            autoElectrico.cargarBateria();
        } else {
            System.out.println(this.nombre + " buscó una estación de carga,pero su carro es de gasolina");
        }
    }
}