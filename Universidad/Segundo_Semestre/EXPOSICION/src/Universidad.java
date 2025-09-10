
import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private String nombre;
    private String direccion;


    private List<Persona> personas;

    public Universidad(String nombre, String direccion) {

        this.nombre = nombre;
        this.direccion = direccion;

        //SE INIZIALIZA LA LISTA
        this.personas = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;

    }

    public void registrarPersona(Persona persona) {
        this.personas.add(persona);
        System.out.println(">> " + persona.getNombres() + " " + persona.getApellidos() + " ha sido registrado(a) en la universidad " + this.nombre + ".");
    }

    public void mostrarListaPersonas() {
        System.out.println("\n=============================================");
        System.out.println("     MIEMBROS DE LA UNIVERSIDAD " + this.nombre);
        System.out.println("=============================================");

        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas.");
            return;
        }


        for (Persona persona : personas) {


            persona.consultarInfoPersonal();
        }
    }
}