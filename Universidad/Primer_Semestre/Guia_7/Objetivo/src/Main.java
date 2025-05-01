import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // declaracion de variables
    int [][] matriz;
    int objetivo;


    public Main() {
        matriz = new int[3][3]; //tamaño de la matriz
        //usuario ingresa datos de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String input = JOptionPane.showInputDialog(null, "Ingrese un numero para posición [" + i + "][" + j + "]");
                matriz[i][j] = Integer.parseInt(input);
            }
        }
      //Input del numero objetivo
        String input = JOptionPane.showInputDialog(null, "Ingrese el numero objetivo");
            objetivo = Integer.parseInt(input);

        //logica para encontrar el numero objetivo
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
