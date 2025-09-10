
public class Administrativo extends Persona {

    private String salario;


    public Administrativo(String nombres, String apellidos, int nroID, String tipoID, String salario) {


        super(nombres, apellidos, nroID, tipoID);
        this.salario = salario;
    }

    public void generarListadoEstudiantes() {
        System.out.println("El administrativo " + nombres + " está generando un listado de estudiantes.");
    }

    @Override
    public void consultarInfoPersonal() {
        System.out.println("--- INFO ADMINISTRATIVO ---");
        System.out.println("Nombre Completo: " + nombres + " " + apellidos);
        System.out.println("ID: " + tipoID + " " + nroID);

        System.out.println("Salario: $" + salario);
        System.out.println("---------------------------\n");
    }
}