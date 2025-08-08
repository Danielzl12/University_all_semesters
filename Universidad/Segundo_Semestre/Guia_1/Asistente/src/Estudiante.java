import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    String nombres;
    String carrera;
    String semestre;
    private List<Asignatura> asignaturasInscritas; // <-- ¡LA PIEZA CLAVE!

    public Estudiante(String nombres, String carrera, String semestre) {
        this.nombres = nombres;
        this.carrera = carrera;
        this.semestre = semestre;
        this.asignaturasInscritas = new ArrayList<>(); // <-- Se inicializa la lista
    }

    // Metodo para registrar al estudiante
    public void inscribirAsignatura(Asignatura asignatura) {
        this.asignaturasInscritas.add(asignatura);
    }

    // Getters
    public String getNombres() {
        return nombres;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public List<Asignatura> getAsignaturasInscritas() {
        return asignaturasInscritas;
    }
}