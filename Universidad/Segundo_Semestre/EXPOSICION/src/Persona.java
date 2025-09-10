
public abstract class Persona {

    // Atributos protegidos para que las clases hijas puedan acceder a ellos
    protected String nombres;
    protected String apellidos;
    protected int nroID;
    protected String tipoID;

    // Constructor para inicializar los atributos comunes
    public Persona(String nombres, String apellidos, int nroID, String tipoID) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nroID = nroID;
        this.tipoID = tipoID;

    }

    // Metodo abstracto el cual las otras classess van a sobreeescribir
    public abstract void consultarInfoPersonal();

    // Getters para acceder a la información desde fuera
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }
}

