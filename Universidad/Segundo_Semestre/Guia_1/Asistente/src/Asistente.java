import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class Asistente {
    private List<Estudiante> estudiantesRegistrados;
    private List<Asignatura> asignaturasRegistradas;
    private Date Date;

    public Asistente(){
        this.estudiantesRegistrados = new ArrayList<>();
        this.asignaturasRegistradas = new ArrayList<>();
    }
    public void registrarEstudiante(Estudiante estudiante){
        this.estudiantesRegistrados.add(estudiante);
    }
    public void registrarAsignaturas(Asignatura asignatura){
        this.asignaturasRegistradas.add(asignatura);
    }
    public void generarAlertas(){
        for (Asignatura asginaturaActual: this.asignaturasRegistradas){
            for (Evaluacion evaluacionActual: asginaturaActual.getEvaluaciones()){
                Date fechaDeEntrega = evaluacionActual.fecha_de_entrega;
                Date fechaDeHoy = new Date();
                long diferenciaDeTiempo = fechaDeEntrega.getTime() - fechaDeHoy.getTime();
                if(diferenciaDeTiempo <= 604800000 && diferenciaDeTiempo >= 0){
                    System.out.println("Quedan 7 dias para la entrega");
                }
            }
        }
    }
}