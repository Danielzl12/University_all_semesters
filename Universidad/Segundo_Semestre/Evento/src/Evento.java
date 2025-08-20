import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
    String nombre;
    Date fecha;
    private List<Asistentes> personas_que_asisten;
    int limite = 5;

    // Constructor
    public Evento(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.personas_que_asisten = new ArrayList<>();
    }

    public void agregarAsistente(Asistentes nuevo_asistente) {
        if (getCuposDisponibles() > 0) {
            this.personas_que_asisten.add(nuevo_asistente);
            System.out.println(" Asistente '" + nuevo_asistente.getNombre() + "' inscrito correctamente.");
            System.out.println(" Cupos restantes: " + getCuposDisponibles());
        } else {
            System.out.println(" No se pudo inscribir a '" + nuevo_asistente.getNombre() + "'. El evento está lleno.");
        }
    }



    public int getCuposDisponibles() {
        return this.limite - this.personas_que_asisten.size();
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public List<Asistentes> getPersonas_que_asisten() {
        return personas_que_asisten;
    }
}