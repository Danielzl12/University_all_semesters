import javax.swing.*;

public class Main {

    int[][] matriz;
    int mayor;

    public Main() {
        matriz = new int[3][3]; // Using 3x3 as an example size
        // Fill the matrix with user input
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String input = JOptionPane.showInputDialog(null, "Ingrese un numero para posición [" + i + "][" + j + "]");
                matriz[i][j] = Integer.parseInt(input);
            }
        }

        // Initialize mayor with the first element
        mayor = matriz[0][0];

        // Find the largest element
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }

        // Display the result once after finding the largest element
        JOptionPane.showMessageDialog(null, "El mayor es: " + mayor);
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
    }
