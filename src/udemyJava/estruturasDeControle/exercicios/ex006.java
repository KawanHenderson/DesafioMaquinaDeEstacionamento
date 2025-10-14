package UdemyJava.EstruturasDeControle.exercicios;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ex006 {
    public static void main(String[] args) {
        /*
        Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
         Armazene um numero aleatório em uma variável. O Jogador tem 10
          tentativas para adivinhar o número gerado. Ao final de cada tentativa,
           imprima a quantidade de tentativas restantes, e imprima se o número
            inserido é maior ou menor do que o número armazenado
         */
        Scanner input = new Scanner(System.in);
        int numeroSorteado = ThreadLocalRandom.current().nextInt(0, 501);
        int num;

        System.out.println("---| DESCUBRA O NÚMERO SECRETO DE 0 A 100 |---");
        System.out.println("Obs: Você tem 10 tentativas.");
        System.out.println("Boa sorte!");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Tentativa %d:\n", i+1);
            num = input.nextInt();

            if (num < numeroSorteado){
                System.out.println("O número que você procura é maior...");
            }
            else if (num > numeroSorteado){
                System.out.println("O número que você procura é menor...");
            }
            else {
                System.out.println("Parabéns! é esse mesmo.");
                break;
            }
        }
        System.out.printf("\nO número era %d ", numeroSorteado);
    }

}
