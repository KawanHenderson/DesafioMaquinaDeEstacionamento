package UdemyJava.EstruturasDeControle.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = input.nextInt();

        if (ano % 4 == 0) {
            System.out.println("Este é um ano bissexto!");
        }

        input.close();
    }
}
