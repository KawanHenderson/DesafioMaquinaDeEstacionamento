package UdemyJava;

public class Casting {
    public static void main(String[] args) {
        // Conversões de tipos de forma implícita (Feita pela máquina)
        // e de forma explícita (Feita pelo programador.

        double a = 1; // implícita
        System.out.println(a);

        float b = (float) 1.1234567888888; // explícita (CAST)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // explícita (CAST)
        System.out.println(d);

        double e = 1.999999;
        int f = (int) e; // explícita (CAST)
        System.out.println(f);

    }
}
