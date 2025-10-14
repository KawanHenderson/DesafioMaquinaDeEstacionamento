package UdemyJava.JOptionPane.desafiosJO;

import javax.swing.*;


public class CelsiusFarenheit {
    public static void main(String[] args) {
        /*
        Solicitar ao usuário uma temperatura em graus Celsius e exibir
         a conversão para Fahrenheit utilizando JOptionPane
         */
        double farenheit;
        double doubleCelsius;

        while (true) {
            String celsius = JOptionPane.showInputDialog("Digite o valor da temperatura em Celsius:");
            try {
                if (celsius == null || celsius.isEmpty()){
                    break;
                }
                doubleCelsius = Double.parseDouble(celsius);
                farenheit = (doubleCelsius * 1.8) + 32;
                JOptionPane.showMessageDialog(null, doubleCelsius + "ºC" + " = " + farenheit + "ºF");
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Valor inválido! " + e.getMessage());
            }
        }
    }
}
