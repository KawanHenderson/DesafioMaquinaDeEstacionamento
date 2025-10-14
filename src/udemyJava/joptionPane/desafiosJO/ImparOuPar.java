package UdemyJava.JOptionPane.desafiosJO;

import javax.swing.*;

public class ImparOuPar {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário um número e exibir uma mensagem dizendo
         se o número é par ou ímpar, utilizando JOptionPane.showMessageDialog.
        */
        int intNumero;

        while(true) {
            String numero = JOptionPane.showInputDialog("Digite um número:");
            try {
                if (numero == null || numero.isEmpty()){
                    break;
                }
                intNumero = Integer.parseInt(numero);
                if (intNumero % 2 == 0){
                    JOptionPane.showMessageDialog(null,"O número que você digitou é PAR!");
                } else {
                    JOptionPane.showMessageDialog(null, "O número que você digitou é IMPAR!");
                }
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Valor inválido! " + e.getMessage());
            }
        }
    }
}
