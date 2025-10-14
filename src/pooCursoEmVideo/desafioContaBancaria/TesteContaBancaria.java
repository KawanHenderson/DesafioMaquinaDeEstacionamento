package pooCursoEmVideo.desafioContaBancaria;

public class TesteContaBancaria {

    public static void main(String[] args) {

        ContaBancaria pessoa1 = new ContaBancaria("João");
        ContaBancaria pessoa2 = new ContaBancaria("Maria");

        pessoa1.abrirContaCorrente();
        pessoa1.depositar(500);

        pessoa2.abrirContaPoupanca();
        pessoa2.depositar(300);

        System.out.println("Verificando DONO de P1 e P2:");
        System.out.println(pessoa1.getDono());
        System.out.println(pessoa2.getDono());

        System.out.println("Verificando SALDO de P1 e P2:");
        System.out.println(pessoa1.getSaldo());
        System.out.println(pessoa2.getSaldo());

        System.out.println("Verificando TIPO de P1 e P2:");
        System.out.println(pessoa1.getTipo());
        System.out.println(pessoa2.getTipo());

        System.out.println("Verificando MENSALIDADE de P1 e P2:");
        System.out.println(pessoa1.getMensalidade());
        System.out.println(pessoa2.getMensalidade());

        System.out.println("Verificando se P1 é CONTA CORRENTE:");
        System.out.println(pessoa1.isStatusContaCorrente());
        System.out.println("Verificando se P1 é CONTA POUPANÇA:");
        System.out.println(pessoa1.isStatusContaPoupanca());

        System.out.println("Verificando se P2 é CONTA CORRENTE:");
        System.out.println(pessoa2.isStatusContaCorrente());
        System.out.println("Verificando se P2 é CONTA POUPANÇA:");
        System.out.println(pessoa2.isStatusContaPoupanca());

        // Definindo Número de Conta aleatório para teste
        pessoa1.setNumConta(1);
        pessoa2.setNumConta(2);

        System.out.println("Verificando NumConta de P1 e P2:");
        System.out.println(pessoa1.getNumConta());
        System.out.println(pessoa2.getNumConta());

        // Teste de Saque
        System.out.println(pessoa1.sacar(100));
        System.out.println(pessoa2.sacar(100));

        System.out.println("SALDO de P1 e P2 após Saque:");
        System.out.println(pessoa1.getSaldo());
        System.out.println(pessoa2.getSaldo());

        // Teste de Pagamento de Mensalidade
        System.out.println(pessoa1.pagarMensalidade());
        System.out.println(pessoa2.pagarMensalidade());

        System.out.println("SALDO de P1 e P2 após Pagamento de Mensalidade:");
        System.out.println(pessoa1.getSaldo());
        System.out.println(pessoa2.getSaldo());

        // Teste de Fechar Conta P1 (Erro esperado)
        System.out.println(pessoa1.fecharContaCorrente());
        System.out.println(pessoa1.fecharContaPoupanca());

        // Sacando valor restante para Fechar Conta P1
        System.out.println(pessoa1.sacar(438));

        // Fechando Conta P1
        System.out.println(pessoa1.fecharContaCorrente());

    }
}
