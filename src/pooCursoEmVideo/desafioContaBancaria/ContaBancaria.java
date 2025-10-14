package pooCursoEmVideo.desafioContaBancaria;

public class ContaBancaria {

    public int numConta;
    private String dono;
    protected String tipo; // CC - Conta Corrente | CP - Conta Poupança
    private double saldo;
    private boolean statusContaCorrente;
    private boolean statusContaPoupanca;
    private double mensalidade;

    // Constructor
    public ContaBancaria(String nomeDoDono) {
        setDono(nomeDoDono);
        setSaldo(0.00);
        setStatusContaCorrente(false);
        setStatusContaPoupanca(false);
    }

    // Methods (Abrir/Fechar Conta)
    public String abrirContaCorrente() {
        if (statusContaPoupanca == true) {
            return "Não é possível abrir Conta Corrente. Feche sua conta poupança!";
        } else {
            setMensalidade(12.0);
            setTipo("CC");
            setStatusContaCorrente(true);
            this.saldo += 50.0;
            return "Conta Corrente aberta com sucesso!";
        }
    }

    public String fecharContaCorrente() {
        if (this.statusContaCorrente == true && this.saldo != 0.00) {
            return "Zere seu saldo para poder fechar sua conta. Pague o que deve ou Saque o que resta!";
        }
        else if (this.statusContaCorrente == false) {
            return "Você não possui Conta Corrente";
        } else {
            setStatusContaCorrente(false);
            return "Conta Corrente fechada com sucesso!";
        }
    }

    public String abrirContaPoupanca() {
        if (statusContaCorrente == true) {
            return "Não é possível abrir Conta Poupança. Feche sua conta Corrente!";
        } else {
            setMensalidade(20.0);
            setTipo("CP");
            setStatusContaPoupanca(true);
            this.saldo += 150.0;
            return "Conta Poupança aberta com sucesso!";
        }
    }

    public String fecharContaPoupanca() {
        if (this.statusContaPoupanca == true && this.saldo != 0.00) {
            return "Zere seu saldo para poder fechar sua conta. Pague o que deve ou Saque o que resta!";
        }
        else if (this.statusContaPoupanca == false) {
            return "Você não possui Conta Poupança.";
        } else {
            setStatusContaCorrente(false);
            return "Conta Poupança fechada com sucesso!";
        }
    }

    // Methods (Depositar/Sacar)

    public String depositar(double valorDeDeposito) {
        if (this.statusContaPoupanca == false && this.statusContaCorrente == false) {
            return "Você não possui uma Conta Aberta.";
        } else {
            this.saldo += valorDeDeposito;
            return "Depósito de R$ " + valorDeDeposito + "realizado com sucesso!";
        }
    }

    public String sacar(double valorDeSaque) {
        if (this.statusContaPoupanca == false && this.statusContaCorrente == false) {
            return "Você não possui uma Conta Aberta.";
        }
        else if (this.saldo <= 0.00 || this.saldo < valorDeSaque) {
            return "Saldo insuficiente. Não é possível realizar Saque.";
        } else {
            this.saldo -= valorDeSaque;
            return "Saque de R$ " + valorDeSaque + " realizado com sucesso!";
        }
    }

    // Method (Pagar mensalidade)

    public String pagarMensalidade() {
        if (this.statusContaPoupanca == false && this.statusContaCorrente == false) {
            return "Você não possui uma Conta Aberta.";
        } else if (this.saldo < this.mensalidade) {
            return "Saldo insuficiente.";
        } else {
            this.saldo -= this.mensalidade;
            return "Mensalidade paga com sucesso!";
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public String getDono() {
        return dono;
    }

    public String getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatusContaCorrente() {
        return statusContaCorrente;
    }

    public boolean isStatusContaPoupanca() {
        return statusContaPoupanca;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatusContaCorrente(boolean statusContaCorrente) {
        this.statusContaCorrente = statusContaCorrente;
    }

    public void setStatusContaPoupanca(boolean statusContaPoupanca) {
        this.statusContaPoupanca = statusContaPoupanca;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}


