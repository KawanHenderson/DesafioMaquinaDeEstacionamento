package UdemyJava.EstruturasDeControle.desafiosEDC;

import java.util.Scanner;

public class desafioWhile {
    public static void main(String[] args) {
        // Média de alunos
        // para sair do programa digite -1

        Scanner input = new Scanner(System.in);
        int i = 1;
        double total = 0;
        double nota = 0;

        do {
            System.out.println("Aviso! Para encerrar o programa digite \"-1\".");
            System.out.printf("--Digite a nota do aluno %d--", i);
            System.out.print("\nNota: ");
            nota = input.nextDouble();
            if (nota>=0 && nota<=10) {
                total += nota;
                i++;
            } else if (nota == -1) {
                i--;
                System.out.println("Encerrando o programa.");
            } else {
                System.out.println("Valor inválido. digite novamente");
            }
        }while(!(nota == -1));

        double media = (total/i);

        System.out.printf("Média dos alunos = %.2f", media);

        input.close();
    }
}
