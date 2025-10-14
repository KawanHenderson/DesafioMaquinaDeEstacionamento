package UdemyJava;

public class Wrappers {
    public static void main(String[] args){
        // Permite que usemos "tipos primitivos" como classes tornando possível a utilização de métodos.
        // Iniciais maiúsculas

        Byte b = 100;
        System.out.println(b.byteValue());

        Short s = 1000;
        System.out.println(s.toString());

        // Integer.parseInt(entrada.next())
        // Passa valores para o tipo inteiro
        Integer i = 10000; // int
        System.out.println(i * 3);

        Long l = 100000L;
        System.out.println(l / 3);

        Float f = 123.10F;
        System.out.println(f);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; // char
        System.out.println(c + "...");
        







    }
}
