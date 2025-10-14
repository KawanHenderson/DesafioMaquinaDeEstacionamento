package UdemyJava;

public class AreaCircuferencia {
    public static void main(String[] args) {
        int raio = 10;
        final double PI = 3.14;
        double area = PI * raio * raio;

        System.out.println("Area = " + area + "m2");
        System.out.printf("Area = %.2fm2", area);
    }
}
