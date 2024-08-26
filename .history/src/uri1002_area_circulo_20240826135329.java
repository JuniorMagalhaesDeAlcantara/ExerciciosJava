import java.util.Scanner;

public class uri1002_area_circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor do raio
        double raio = scanner.nextDouble();

        // Valor de PI
        double pi = 3.14159;

        // Cálculo da área do círculo
        double area = pi * raio * raio;

        // Impressão da área
        System.out.println("A=" + area);

        scanner.close();
    }
}
