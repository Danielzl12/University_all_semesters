// Clase principal que ejecuta una simulación sencilla de tráfico entre un auto a gasolina y uno eléctrico
public class Main {
    public static void main(String[] args) {
        // Mensaje inicial de la simulación
        System.out.println("--- INICIO DE LA SIMULACIÓN DE TRÁFICO ---");
        System.out.println();

        // Crear un automóvil a gasolina y uno eléctrico con sus características
        Gasolina carroGasolina = new Gasolina("BMW", "Serie 3", "Negro", "Automática");
        Electric carroElectrico = new Electric("Tesla", "Model S", "Blanco", "Automática", 500);

        // Mostrar los vehículos listos para el viaje
        System.out.println("Dos vehículos listos para el viaje:");
        System.out.println("- Un " + carroGasolina.marca + " " + carroGasolina.modelo);
        System.out.println("- Un " + carroElectrico.marca + " " + carroElectrico.modelo);
        System.out.println();

        // Crear conductores y asignarlos a sus vehículos
        Conductor conductor1 = new Conductor("Daniel", carroGasolina);
        Conductor conductor2 = new Conductor("Dana", carroElectrico);
        System.out.println();

        // Ambos conductores inician el viaje acelerando
        System.out.println("--- COMIENZA EL VIAJE ---");
        conductor1.pisarAcelerador();
        conductor2.pisarAcelerador();
        System.out.println();

        // Se confunden respecto a dónde deben recargar/abastecer
        System.out.println("--- LOS CONDUCTORES NECESITAN RECARGAR Y SE CONFUNDEN ---");
        conductor2.irALaGasolinera(); // El auto eléctrico no debería ir a la gasolinera
        conductor1.buscarEstacionDeCarga(); // El auto a gasolina no debería ir a la estación de carga
        System.out.println();

        // Corrigen sus acciones y van al lugar correcto
        System.out.println("--- LOS CONDUCTORES CORRIGEN Y VAN AL LUGAR CORRECTO ---");
        System.out.println("Dana se da cuenta de su error");
        conductor2.buscarEstacionDeCarga();
        System.out.println("Daniel también corrige su error");
        conductor1.irALaGasolinera();
        System.out.println();

        // Retoman el viaje después de cargar/tanquear
        System.out.println("--- LOS CONDUCTORES TERMINAN Y CONTINÚAN SU VIAJE ---");
        System.out.println("Carga y tanqueada completadas. " + conductor1.nombre + " y " + conductor2.nombre + " vuelven a sus vehículos.");

        // Se suben y se van
        conductor1.pisarAcelerador();
        conductor2.pisarAcelerador();
        System.out.println();

        // Encuentran tráfico y deben frenar
        System.out.println("--- ENCUENTRAN TRÁFICO Y DEBEN FRENAR ---");
        conductor1.pisarFreno();
        conductor2.pisarFreno();
        System.out.println();

        // Mensaje final de la simulación
        System.out.println("--- FIN DE LA SIMULACIÓN ---");
    }
}