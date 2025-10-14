package UdemyJava;
import java.util.Scanner;

public class Temperatura {
    // (F° - 32) x 5/9 = °C
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int X = 32;
        final double Y = 5.0 / 9.0;

        System.out.println("--Conversão de Farenheit -> Celsius--");
        System.out.println("Digite o valor em Farenheit: ");
        double farenheit = input.nextInt();

        double celsius = ((farenheit - X) * Y);

        System.out.printf("Valor em Celsius = %.2f°", celsius);

        input.close();
    }
}
