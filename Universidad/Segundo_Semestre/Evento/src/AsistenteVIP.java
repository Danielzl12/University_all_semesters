public class AsistenteVIP extends Asistentes {

    public AsistenteVIP(String nombre, String email, String numero) {
        super(nombre, email, numero);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("- Asistente VIP: Tiene acceso a zona preferencial " + getNombre() + "\n Email: " + getEmail());
    }
}