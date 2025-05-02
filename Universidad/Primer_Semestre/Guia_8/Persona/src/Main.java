import javax.swing.*;

public class Main {



    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.mostrarDatos();
        persona.modificarCiudad();
        persona.mostrarDatos();
    }
}
class Persona{
    //declaracion de variables
    String nombre;
    String ciudad;
    int edad;

    public Persona() {
        String nombre_input = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String ciudad_input = JOptionPane.showInputDialog("Ingrese su ciudad: ");
        String edad_str = JOptionPane.showInputDialog("Ingrese su edad: ");
        int edad_input = Integer.parseInt(edad_str);

        this.nombre = nombre_input;
        this.ciudad = ciudad_input;
        this.edad = edad_input;
    }
    public void mostrarDatos(){

        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre + "\nCiudad: " + this.ciudad + "\nEdad: " + this.edad);
    }
    public void modificarCiudad(){
        String nueva_ciudad_input = JOptionPane.showInputDialog("Ingrese el cambio de ciudad: ");
        this.ciudad = nueva_ciudad_input;
    }
}
