package UdemyJava.Fundamentos.desafiosFundamentos;

import java.util.Scanner;

public class DesafioConversão {
    public static void main(String[] args) {
        //Locale.setDefault(new Locale("en", "US"));

        // Criando input
        Scanner input = new Scanner(System.in);

        // Leitura dos salários
        System.out.println("Digite seus ultimos 3 salários:");
        String salario1 = input.nextLine().replaceAll("[,]",".");
        String salario2 = input.nextLine().replaceAll("[,]",".");
        String salario3 = input.nextLine().replaceAll("[,]",".");

        // Convertendo para Double
        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        // Verificando os valores
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);

        // Tirando a média salarial
        double media = (valor1 + valor2 + valor3) / 3;

        System.out.printf("Média salarial: %.2f", media);

        input.close();
    }
}
