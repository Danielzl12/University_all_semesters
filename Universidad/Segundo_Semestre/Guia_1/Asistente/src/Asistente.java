import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Asistente {
    private List<Estudiante> estudiantesRegistrados;
    private List<Asignatura> asignaturasRegistradas;

    public Asistente() {
        this.estudiantesRegistrados = new ArrayList<>();
        this.asignaturasRegistradas = new ArrayList<>();
    }

    // Métodos para registrar (los que ya tenías)
    public void registrarEstudiante(Estudiante estudiante) {
        this.estudiantesRegistrados.add(estudiante);
    }

    public void registrarAsignaturas(Asignatura asignatura) {
        this.asignaturasRegistradas.add(asignatura);
    }

    // Getters para que el Main pueda ver las listas
    public List<Estudiante> getEstudiantesRegistrados() {
        return estudiantesRegistrados;
    }

    public List<Asignatura> getAsignaturasRegistradas() {
        return asignaturasRegistradas;
    }

    // --- ¡MÉTODO GENERAR ALERTAS MEJORADO! ---
    public void generarAlertas() {
        System.out.println("\n--- Buscando alertas de entregas próximas (en 7 días o menos) ---");
        boolean haAlertas = false;

        // Recorremos a cada estudiante registrado
        for (Estudiante estudiante : this.estudiantesRegistrados) {
            // De cada estudiante, tomamos sus asignaturas inscritas
            for (Asignatura asignatura : estudiante.getAsignaturasInscritas()) {
                // Y de cada asignatura, revisamos sus evaluaciones
                for (Evaluacion evaluacion : asignatura.getEvaluaciones()) {

                    long diferenciaEnMilisegundos = evaluacion.getFecha_de_entrega().getTime() - new Date().getTime();
                    long diasRestantes = diferenciaEnMilisegundos / (1000 * 60 * 60 * 24);

                    if (diasRestantes >= 0 && diasRestantes <= 7) {
                        System.out.println("--------------------------------------------------");
                        // La alerta ahora es específica para el estudiante
                        System.out.println(" ¡ALERTA PARA " + estudiante.getNombres().toUpperCase() + "!");
                        System.out.println("   -> Asignatura: " + asignatura.getNombre_asignatura());
                        System.out.println("   -> Evaluación: " + evaluacion.getNombre_evaluacion());
                        System.out.println("   -> Días restantes: " + diasRestantes);
                        System.out.println("--------------------------------------------------");
                        haAlertas = true;
                    }
                }
            }
        }

        if (!haAlertas) {
            System.out.println("No se encontraron entregas próximas para los estudiantes inscritos.");
        }
        System.out.println("--- Búsqueda de alertas finalizada ---\n");
    }
}