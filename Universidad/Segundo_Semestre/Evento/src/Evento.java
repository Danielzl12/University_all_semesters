import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
    String nombres;
    Date fecha;
    private List<Asistentes> personas_que_asisten;
    private List<Evento> evento_a_crear;
    int limite = 5;

    public Evento(String nombres, Date fecha) {
        this.nombres = nombres;
        this.fecha = fecha;
        this.personas_que_asisten = new ArrayList<>(); // Inicializamos la lista
        this.evento_a_crear = new ArrayList<>();
    }

        public void registrarEvento(Evento nuevo_evento) {
            this.evento_a_crear.add(nuevo_evento);
        }



        public void agregarAsistente(Asistentes nuevo_asistente) {

        if (this.personas_que_asisten.size() < this.limite) {
            this.personas_que_asisten.add(nuevo_asistente);
            System.out.println("Asistente '" + nuevo_asistente.getNombre() + "' agregado correctamente.");

            int cuposRestantes = this.limite - this.personas_que_asisten.size();
            System.out.println("--Cupos restantes: " + cuposRestantes);

        } else {

            System.out.println("No se pudo agregar a '" + nuevo_asistente.getNombre() + "'. El evento está lleno.");
        }
    }

    public List<Asistentes> getPersonas_que_asisten() {
        return personas_que_asisten;
    }
}