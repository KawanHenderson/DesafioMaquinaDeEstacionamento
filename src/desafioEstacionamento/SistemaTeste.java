package desafioEstacionamento;

import java.util.Scanner;

public class SistemaTeste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Instanciando uma máquina
        Maquina maquina1 = new Maquina();

        // Gerando tickets para teste
        for (int i = 0; i < 4; i++) {
            maquina1.gerarTicket();
        }

        // Consultando tickets gerados
        maquina1.consultarOperacoes();

        // Teste de interação com o ticket
        System.out.println("Digite o código do Ticket para pagar: ");
        int codigoDoTicketParaPagar = input.nextInt();

        // Pagando ticket
        maquina1.pagarTicket(codigoDoTicketParaPagar);

        // Mostrando o funcionamento correto do pagamento
        maquina1.consultarOperacoes();
    }
}
