package UdemyJava;

public class SintaxeBasica {
    public static void main(String[] args) {
        // Tipos primitivos

        // Tipo inteiro:
        int idade = 19;
        int ano_nascimento = 2006;

        // Tipo double:
        double altura = 1.79;

        System.out.println("Me chamo Kawan. Nasci no ano de " + ano_nascimento + " e tenho " + idade + " anos de idade.");
        System.out.println("Tenho " + altura + "m de altura");

        // Tipo String
        String nome = "Kawan";

        System.out.println("Meu nome é " + nome);

        // Boolean => true ou false
        boolean estaLogado = true;
        boolean temAcesso = false;

        System.out.println("Está logado? " + estaLogado);
        System.out.println("Acesso: " + temAcesso);

        // A atribuição precisa ser do mesmo tipo declarado

        // Declarar em sequência
        int x = 10, y = 20, z = 30;

        // Operações básicas
        // aritméticas
        int a = 10;
        int b = 20;

        System.out.println("A + B = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A / B = " + (a / b));
        System.out.println("A * B = " + (a * b));

        // Forma decimal com tipo Double
        double c = 10;
        double d = 20;
        
        System.out.println("C / D = " + (c / d));

        // Contador com incremento e decremento

        int contador = 0;

        System.out.println("Contador = " + contador);

        // Incremento

        contador++;
        contador++;
        contador++;

        System.out.println("Contador = " + contador);

        // Decremento

        contador--;
        contador--;

        System.out.println("Contador = " + contador);

        // Op. Composto
        // a = 10
        // a = a + 5
        // a += 5

        System.out.println("OP COMPOSTO SOMA: " + (a += 5));
        System.out.println("OP COMPOSTO SUB: " + (a -= 5));
        System.out.println("OP COMPOSTO DIV: " + (a /= 5));
        System.out.println("OP COMPOSTO MULT: " + (a *= 5));

       









    }
    
}
