import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.mostrarDatos();

        }
    }
class Libro {

    //declaracion de variables

    String titulo;
    String autor;
    int añoPublicacion;

    public Libro() {
        String titulo_input = JOptionPane.showInputDialog("Ingrese el titulo del libro");
        String autor_input = JOptionPane.showInputDialog("Ingrese el autor del libro");
        String año_str = JOptionPane.showInputDialog("Ingrese el año de publicaion del libro");
        int añoInput = Integer.parseInt(año_str);

        this.autor = autor_input;
        this.titulo = titulo_input;
        this.añoPublicacion = añoInput;
    }
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null,"Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nAño: " + this.añoPublicacion);
    }
}
