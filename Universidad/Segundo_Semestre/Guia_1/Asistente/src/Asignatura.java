import java.util.ArrayList;
import java.util.List;

public class Asignatura {
//ATRIBUTOS DE LA CLASE
    String nombre_asignatura;
    String modalidad_asignatura;
    List<Evaluacion> evaluaciones;

    //CONSTRUCTOR
    public Asignatura(String nombre_asignatura,String modalidad_asignatura){
        this.nombre_asignatura = nombre_asignatura;
        this.modalidad_asignatura = modalidad_asignatura;
        this.evaluaciones = new ArrayList<>();
    }

    //METODOS

    public void agregar_evaluacion(Evaluacion nueva_evaluacion){
        this.evaluaciones.add(nueva_evaluacion);
    }

    public String getNombre_asignatura(){
        return  nombre_asignatura;
    }
    public String getModalidad_asignatura(){
        return  modalidad_asignatura;
    }

    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }
}