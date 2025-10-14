package UdemyJava.EstruturasDeControle.exercicios;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        if (num>=0 && num<=10) {
            System.out.println("Está entre 0 e 10!");
        }

        if (num % 2 == 0) {
            System.out.println("É par!");
        }

        input.close();
    }
}
