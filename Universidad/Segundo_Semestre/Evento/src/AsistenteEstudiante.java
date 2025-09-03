public class AsistenteEstudiante extends Asistentes {

    public AsistenteEstudiante(String nombre, String email, String numero) {
        super(nombre, email, numero);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("- Estudiante: Tiene acceso a zona preferencial " + getNombre() + "\n Email: " + getEmail());
    }
}