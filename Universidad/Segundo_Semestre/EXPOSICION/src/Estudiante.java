// Archivo: Estudiante.java
public class Estudiante extends Persona {
    private String codigo;

    public Estudiante(String nombres, String apellidos, int nroID, String tipoID, String codigo) {

        super(nombres, apellidos, nroID, tipoID);
        this.codigo = codigo;
    }


    @Override
    public void consultarInfoPersonal() {
        System.out.println("--- INFO ESTUDIANTE ---");
        System.out.println("Nombre Completo: " + nombres + " " + apellidos);
        System.out.println("ID: " + tipoID + " " + nroID);
        System.out.println("Código: " + codigo);
        System.out.println("-----------------------\n");
    }
}