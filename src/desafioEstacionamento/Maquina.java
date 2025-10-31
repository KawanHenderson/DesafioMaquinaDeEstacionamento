package desafioEstacionamento;

import java.util.HashMap;
import java.util.Map;

public class Maquina {
    // Atributos
    private Map<Integer, Boolean> tickets;
    private double saldo;

    // Constructor
    public Maquina() {
        this.tickets = new HashMap<>();
    }

    // Gerador de Tickets
    public Ticket gerarTicket() {
        Ticket ticketGerado = new Ticket();
        tickets.put(ticketGerado.getNumero(), ticketGerado.isPago());
        return ticketGerado;
    }

    // Pagar Ticket
    public void pagarTicket(Integer numeroDoTicket) {
        tickets.replace(numeroDoTicket, true);
        setSaldo(getSaldo() + 15.0);

        System.out.println("TICKET " + numeroDoTicket + " PAGO COM SUCESSO!");
    }

    // Consultar Tickets e Status
    public void consultarOperacoes() {
        for (Map.Entry<Integer, Boolean> ticket : tickets.entrySet()) {
            System.out.println(ticket.getValue()? "Ticket " + ticket.getKey() + " pago. +R$ 15,00" :
                    "Ticket " + ticket.getKey() + " pendete! -R$ 15,00");
        }
    }

    // Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
