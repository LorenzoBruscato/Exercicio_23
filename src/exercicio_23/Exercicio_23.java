package exercicio_23;

import javax.swing.JOptionPane;

public class Exercicio_23 {

    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("digite seu primeiro numero"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("digite seu segundo numero"));
        double soma = 0;
        double i = n1;
        while (i <= n2) {
            soma = soma + i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "soma: " + soma);

    }
}