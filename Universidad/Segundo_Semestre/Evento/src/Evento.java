import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
    String nombres;
    Date fecha;
    private List<Asistentes> personas_que_asisten;

    public Evento(String nombres, Date fecha){
        this.nombres = nombres;
        this.fecha = fecha;
        this.personas_que_asisten = new ArrayList<>(); //para inicializar la lista
    }

    public void agregarAsistentes(Asistentes nuevos_asistentes){
        this.personas_que_asisten.add(nuevos_asistentes);
    }

    public List<Asistentes> getPersonas_que_asisten() {
        return personas_que_asisten;
    }
}
