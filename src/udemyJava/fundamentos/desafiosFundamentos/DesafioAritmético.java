package UdemyJava.Fundamentos.desafiosFundamentos;

import static java.lang.Math.*;

public class DesafioAritmético {
    public static void main(String[] args) {
        // Numerador
        int x = (int) (pow((6*(3+2)), 2)) / (3*2);
        System.out.println(x);

        int y = (int) pow((((1-5)*(2-7))/2), 2);
        System.out.println(y);

        int numerador = (int) pow((x-y), 3);

        // Denominador
        int denominador = (int) pow(10, 3);

        // Resultado final
        System.out.println(numerador/denominador);
    }
}
