import javax.swing.*;


public class Main {
    int[] ArrayNumbers;
    int Sumatoria;
    String ArrayDisplay;


    public Main() {
        ArrayNumbers = new int[5];
        Sumatoria = 0;
        for (int pos = 0; pos < 5; pos++) {
            ArrayDisplay= JOptionPane.showInputDialog("Introduce un numero: ");
            ArrayNumbers[pos] =Integer.parseInt(ArrayDisplay);
            Sumatoria= Sumatoria + ArrayNumbers[pos];
        }
        JOptionPane.showMessageDialog(null, "La sumatoria es: " + Sumatoria);
    }

    public static void main(String[] args) {
        Main solution = new Main();

    }
}
