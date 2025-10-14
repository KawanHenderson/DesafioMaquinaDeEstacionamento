package UdemyJava.EstruturasDeControle.desafiosEDC;

import java.util.Scanner;

public class desafioIf {
    public static void main(String[] args) {
         // Domingo - 1
         // Segunda-feira - 2
         // Terça-feira - 3
         // Quarta-feira - 4
         // Quinta-feira - 5
         // Sexta-feira - 6
         // Sábado - 7

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");

        String dia_completo = input.next();
        String[] principal = dia_completo.split("[-\\s]+");
        String dia = principal[0];

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println("1");
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println("2");
        } else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
            System.out.println("3");
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("4");
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("5");
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("6");
        } else if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado")) {
            System.out.println("7");
        }

        input.close();
    }
}
