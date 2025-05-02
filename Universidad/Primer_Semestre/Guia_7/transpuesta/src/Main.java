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
        String resultadoCompleto = "La matriz transpuesta es: \n \n ";
        for (int i = 0; i < MatrizTranspuestaResultante.length; i++) {
            for (int j = 0; j < MatrizTranspuestaResultante[i].length; j++) {
                resultadoCompleto += MatrizTranspuestaResultante[i][j];
                if (j < MatrizTranspuestaResultante[i].length - 1) {
                    resultadoCompleto += " \t ";
                }
            }
            resultadoCompleto += " \n ";
        }
        JOptionPane.showMessageDialog(null, resultadoCompleto, "Resultado de la transpuesta", JOptionPane.INFORMATION_MESSAGE);
    }
}
