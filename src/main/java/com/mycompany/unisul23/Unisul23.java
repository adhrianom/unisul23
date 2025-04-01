package com.mycompany.unisul23;
import javax.swing.JOptionPane;
public class Unisul23 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero inicial: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero final: "));
        int soma = 0;
        int i = num1;
        while (num1 <= num2) {
            soma = soma + i;
            JOptionPane.showMessageDialog(null, soma);
            i++;
        }
        JOptionPane.showMessageDialog(null, "A soma dos numeros de " + num1 + " até " + num2 + " é " + soma);
    }
}
