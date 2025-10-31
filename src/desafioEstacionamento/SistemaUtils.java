package desafioEstacionamento;

import java.util.concurrent.ThreadLocalRandom;

public class SistemaUtils {

    public static int gerarNumeroDeTicket() {
        return ThreadLocalRandom.current().nextInt(1000, 10000);
    }
}
