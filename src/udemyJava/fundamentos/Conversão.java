package UdemyJava;

import javax.swing.JOptionPane;

public class Conversão {
    public static void main(String[] args) {
        // Numero -> String
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = 10000;
        System.out.println(Integer.toString(num2).length());

        // String -> Numero
        String valor1 = JOptionPane.showInputDialog(
                "Digite o primeiro número: ");
        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo número: ");

        System.out.println(valor1 + valor2);

        // Conversão
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.println("Soma é " + soma);
        System.out.println("Média é " + soma / 2);
    }
}
