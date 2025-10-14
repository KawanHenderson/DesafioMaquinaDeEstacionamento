package UdemyJava.Fundamentos.desafiosFundamentos;

import java.util.Scanner;

public class desafioCalculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // num1
        // num2
        // + - * / %

        System.out.print("Digite o número 1: ");
        double num1 = input.nextDouble();
        System.out.print("Digite o número 2: ");
        double num2 = input.nextDouble();

        System.out.println("---Digite a operação desejada---");
        System.out.println("| + | - | * | / | % |");

        String operacao = input.next();

        System.out.println(operacao);

        double calculo =
                (operacao.equals("+"))? num1+num2:
                (operacao.equals("-"))? num1-num2:
                (operacao.equals("*"))? num1*num2:
                (operacao.equals("/"))? num1/num2:
                (operacao.equals("%"))? num1%num2: 0;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, calculo);

        input.close();
    }
}
