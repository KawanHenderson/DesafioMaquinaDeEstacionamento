package UdemyJava.EstruturasDeControle.desafiosEDC;

public class desafioFor {
    public static void main(String[] args) {
        // fazer uma escadinha de 4 degraus usando # no for
        // Não pode usar valor númerico

        for (String valor = "#"; !valor.equals("######"); valor += "#"){
            System.out.println(valor);
        }
    }
}
