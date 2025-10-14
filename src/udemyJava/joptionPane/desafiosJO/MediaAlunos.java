package UdemyJava.JOptionPane.desafiosJO;

import javax.swing.*;

public class MediaAlunos {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário três notas e calcular a média, exibindo
        o resultado com uma mensagem utilizando JOptionPane.showMessageDialog.
        */
        double doubleNota;
        double total = 0;
        String nota;

        for (int i = 1; i <= 3; i++) {
            while(true) {
            nota = JOptionPane.showInputDialog("Digite a nota do aluno " + i + ":");
                try {
                    doubleNota = Double.parseDouble(nota);
                    total += doubleNota;
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor inválido! " + e.getMessage());
                }
            }
            if (nota == null || nota.isEmpty()) {
                break;
            }
        }
        double media;
        media = total/3;

        JOptionPane.showMessageDialog(null,"Média das notas: " + media);
    }
}
