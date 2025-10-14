package UdemyJava.JOptionPane.desafiosJO;

import javax.swing.JOptionPane;

public class calculadoraBolada {
    public static boolean isInteger(String texto) {
        if (texto == null || texto.isEmpty()){
            return false;
        }
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "BEM VINDO A CALCULADORA BOLADONA!");
        JOptionPane.showMessageDialog(null, "Vamos começar.");

        String num1;
        do {
            num1 = JOptionPane.showInputDialog(null, "Digite 1 número:");
        } while (!isInteger(num1));
        int valor1 = Integer.parseInt(num1);

        String num2;
        do {
            num2 = JOptionPane.showInputDialog(null, "Digite outro número:");
        } while (!isInteger(num2));
        int valor2 = Integer.parseInt(num2);

        JOptionPane.showMessageDialog(null,"Muito bem! Agora escolha a operação que deseja realizar.");

        int subtracao = JOptionPane.showConfirmDialog(null, "Você gostaria de subtrair?");
        if (subtracao == 0){
            if (valor1>=valor2) {
                JOptionPane.showMessageDialog(null, "Tudo bem! " + valor1 + " - " + valor2 + " = " + (valor1 - valor2));
            } else {
                JOptionPane.showMessageDialog(null, "Tudo bem! " + valor2 + " - " + valor1 + " = " + (valor2 - valor1));
            }
        }
        int soma = JOptionPane.showConfirmDialog(null, "Você gostaria de somar?");
        if (soma == 0){
            JOptionPane.showMessageDialog(null, "Tudo bem! " + valor1 + " + " + valor2 + " = " + (valor1+valor2));
        }
        int divisao = JOptionPane.showConfirmDialog(null, "Você gostaria de dividir?");
        if (divisao == 0){
            if (valor1>=valor2) {
                JOptionPane.showMessageDialog(null, "Tudo bem! " + valor1 + " / " + valor2 + " = " + (valor1 / valor2));
            } else {
                JOptionPane.showMessageDialog(null, "Tudo bem! " + valor1 + " / " + valor2 + " = " + (valor1 / valor2));
            }
        }
        int multi = JOptionPane.showConfirmDialog(null, "Você gostaria de multiplicar?");
        if (multi == 0){
            JOptionPane.showMessageDialog(null, "Tudo bem! " + valor1 + " * " + valor2 + " = " + (valor1*valor2));
        }
        JOptionPane.showMessageDialog(null,"Ok. Esse é o fim da calculadora boladona.");
    }
}
