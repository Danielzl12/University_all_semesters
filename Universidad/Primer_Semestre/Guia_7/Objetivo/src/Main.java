import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // variables declaration
    int [][] matriz;
    int objetivo;


    public Main() {
        matriz = new int[3][3]; //tamaño de la matriz
        //user input for the matrix
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String input = JOptionPane.showInputDialog(null, "Ingrese un numero para posición [" + i + "][" + j + "]");
                matriz[i][j] = Integer.parseInt(input);
            }
        }
      //Input objective number
        String input = JOptionPane.showInputDialog(null, "Ingrese el numero objetivo");
            objetivo = Integer.parseInt(input);

        //logic to find the objective number
            boolean encontrado = false;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++){
                    if (matriz[i][j] == objetivo){
                        encontrado = true;
                        JOptionPane.showMessageDialog(null, "Se encontro el numero objetivo (" + objetivo + ") en la posicion [" + i + "][" + j + "]");
                        break;


                    }
            }
        }

        if (!encontrado){
            JOptionPane.showMessageDialog(null, "No se encontro el numero objetivo el cual era "+ objetivo);
        }

    }

    public static void main(String[] args) {
        Main m = new Main();
        }
    }
