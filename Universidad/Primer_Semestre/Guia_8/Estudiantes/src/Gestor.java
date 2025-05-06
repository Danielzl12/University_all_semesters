import java.util.ArrayList;

//gestor de estudiantes
public class Gestor {
    //creacion del array
    private final ArrayList<Estudiante> listaDeEstudiantes;


    //constructor del gestor
    public Gestor() {
        listaDeEstudiantes = new ArrayList<>();

    }
    //methods para agregar estudiantes al array
    public void adicionarEstudiante(Estudiante estudiante) {
        listaDeEstudiantes.add(estudiante);

    }
    //methods para buscar estudiantes por codigo

    public Estudiante buscarPorCodigo(int codigoEstudiantil) {
        for (Estudiante estudiante : listaDeEstudiantes) {
            if (estudiante.getCodigoEstudiantil() == codigoEstudiantil) {
                return estudiante;
            }
        }
        return null;
    }
    //methods para buscar estudiantes por nombre
    public Estudiante buscarPorNombres(String Nombres) {
        for (Estudiante estudiante : listaDeEstudiantes) {
            if (estudiante.getNombres().equals(Nombres)) {
                return estudiante;
            }
        }
        return null;
    }
}