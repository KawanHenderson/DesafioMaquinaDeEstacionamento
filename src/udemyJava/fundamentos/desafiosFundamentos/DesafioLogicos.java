package UdemyJava.Fundamentos.desafiosFundamentos;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;

        System.out.printf("Vou trabalhar terça-feira? %b", trabalhoTerca);
        System.out.printf("\nVou trabalhar quinta-feira? %b", trabalhoQuinta);

        System.out.printf("\nVamos comprar uma tv de 50 polegadas? %b", (trabalhoTerca && trabalhoQuinta));
        System.out.printf("\nVamos comprar uma tv de 32 polegadas? %b", (trabalhoTerca ^ trabalhoQuinta));
        System.out.printf("\nVamos ficar em casa? %b", (!trabalhoTerca && !trabalhoQuinta));
        System.out.printf("\nVamos tomar sorverte? %b", (trabalhoTerca || trabalhoQuinta));
    }
}
