import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

int[][] matriz;
int suma = 0;

    public Main() {
        matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String input = JOptionPane.showInputDialog("Ingrese el valor para [" + i + "][" + j + "]");
                matriz[i][j] = Integer.parseInt(input);
            }
        }
        //Suma
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "La suma de la matriz es: " + suma);
    }

    public static void main(String[] args) {
    Main m = new Main();
        }
    }
