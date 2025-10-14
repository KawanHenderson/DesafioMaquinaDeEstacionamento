package UdemyJava.JOptionPane;

import javax.swing.JOptionPane;

public class helloworldJO {

    public static void main(String[] args) {

    JOptionPane.showMessageDialog(null, "Hello World!");
    String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
    JOptionPane.showMessageDialog(null, "Olá, " + nome);

    // 0 - Usuário clicou em "Yes"
    // 1 - Usuário clicou em "No"
    // 2 - Usuário clicou em "Cancel"
    int resposta = JOptionPane.showConfirmDialog(null, "Você é maior de idade?");
    if (resposta == 0) {
        JOptionPane.showMessageDialog(null,"Você clicou em SIM!");
    } else if (resposta == 1) {
        JOptionPane.showMessageDialog(null,"Você clicou em NÃO!");
    } else {
        JOptionPane.showMessageDialog(null,"Você clicou em CANCELAR!");
        }
    }
}
