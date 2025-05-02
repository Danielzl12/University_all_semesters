import javax.swing.*;

public class Main {
//Matriz creation
    int [][] matriz;
//matrix input
    public Main() {
        matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String input = JOptionPane.showInputDialog("Ingrese el valor para [" + i + "][" + j + "]");
                matriz[i][j] = Integer.parseInt(input);
            }
        }
    }
// new method
    public void CalcularYMostrarPromediosPorFilas() {
        for (int i = 0; i < matriz.length; i++) {
           int sumaFila = 0;
           for (int j = 0; j < matriz[i].length; j++) {
               sumaFila += matriz[i][j];
           }
           double promedioFila = (double) sumaFila / matriz[i].length;
           JOptionPane.showMessageDialog(null, "El promedio de la fila " + i + " es: " + promedioFila);
        }
    }
// calling the methods
    public static void main(String[] args) {
    Main matr = new Main();
    matr.CalcularYMostrarPromediosPorFilas();
        }
    }
