package desafioEstacionamento;

public class Ticket {
    private int numero;
    private double valor;
    private boolean pago;

    public Ticket() {
        // Atributos
        setNumero(SistemaUtils.gerarNumeroDeTicket());
        setValor(15.0);
        setPago(false);
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
