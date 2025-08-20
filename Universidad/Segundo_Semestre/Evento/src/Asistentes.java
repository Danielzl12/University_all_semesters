public class Asistentes {
    String nombre;
    String email;
    String numero;

    public Asistentes(String nombre, String email, String numero) {
        this.nombre = nombre;
        this.email = email;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getNumero() {
        return numero;
    }
}