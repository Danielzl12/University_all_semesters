import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        LibroNuevo libroVar = new LibroNuevo();
        libroVar.mostrarDatos();
        Biblioteca miBiblioteca = new Biblioteca();
        JOptionPane.showMessageDialog(null,"Ingrese los datos del primer libro");
        LibroNuevo libro1 = new LibroNuevo();
        miBiblioteca.agregarLibro(libro1);
        JOptionPane.showMessageDialog(null,"Ingrese los datos del segundo libro");
        LibroNuevo libro2 = new LibroNuevo();
        miBiblioteca.agregarLibro(libro2);
        JOptionPane.showMessageDialog(null,"Ingrese los datos del tercer libro");
        LibroNuevo libro3 = new LibroNuevo();
        miBiblioteca.agregarLibro(libro3);
        JOptionPane.showMessageDialog(null,"Ingrese los datos del cuarto libro");
        LibroNuevo libro4 = new LibroNuevo();
        miBiblioteca.agregarLibro(libro4);

        miBiblioteca.mostrarLista();


        }
    }
class LibroNuevo {

    //variables declaration

    String titulo;
    String autor;
    int añoPublicacion;

    public LibroNuevo() {
        String titulo_input = JOptionPane.showInputDialog("Ingrese el titulo del libro");
        String autor_input = JOptionPane.showInputDialog("Ingrese el autor del libro");
        String año_str = JOptionPane.showInputDialog("Ingrese el año de publicacion del libro");
        int añoInput = Integer.parseInt(año_str);

        this.autor = autor_input;
        this.titulo = titulo_input;
        this.añoPublicacion = añoInput;
    }
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null,"Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nAño: " + this.añoPublicacion);
    }
}
