 public class Staff extends Asistentes {

    public Staff(String nombre, String email, String numero) {
            super(nombre, email, numero);
        }

        @Override
        public void mostrarInformacion() {
            System.out.println(" Staff del evento: " + getNombre() + " \n Contacto: " + getEmail());
        }
}
