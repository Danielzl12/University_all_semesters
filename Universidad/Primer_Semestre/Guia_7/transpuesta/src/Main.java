import javax.swing.*;


public class Main {

    //declaracion de las variables
    int[][] matriz;

    //input de la matriz
    public Main() {
        matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String input = JOptionPane.showInputDialog("Ingrese el valor para [" + i + "][" + j + "]");
                matriz[i][j] = Integer.parseInt(input);
            }
        }

    }

    //lógica de la transpuesta
    public int[][] transpuesta() {
        int[][] matrizTranspuesta = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTranspuesta;
    }

    //llamada a las clases
    public static void main(String[] args) {
        Main mrt = new Main();
        int[][] MatrizTranspuestaResultante = mrt.transpuesta();
        StringBuilder resultadoCompleto = new StringBuilder("La matriz transpuesta es: \n \n ");
        for (int[] ints : MatrizTranspuestaResultante) {
            for (int j = 0; j < ints.length; j++) {
                resultadoCompleto.append(ints[j]);
                if (j < ints.length - 1) {
                    resultadoCompleto.append(" \t ");
                }
            }
            resultadoCompleto.append(" \n ");
        }
        JOptionPane.showMessageDialog(null, resultadoCompleto.toString(), "Resultado de la transpuesta", JOptionPane.INFORMATION_MESSAGE);
    }
}
