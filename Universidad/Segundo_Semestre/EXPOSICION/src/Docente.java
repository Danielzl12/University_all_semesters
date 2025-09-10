
public class Docente extends Persona {
    private String departamento;

    public Docente(String nombres, String apellidos, int nroID, String tipoID, String Departamento) {

        super(nombres, apellidos, nroID, tipoID);
        this.departamento = Departamento;
    }

    @Override
    public void consultarInfoPersonal() {
        System.out.println("--- INFO DOCENTE ---");
        System.out.println("Nombre Completo: " + nombres + " " + apellidos);
        System.out.println("ID: " + tipoID + " " + nroID);
        System.out.println("departamento: " + departamento);
        System.out.println("--------------------\n");
    }
}