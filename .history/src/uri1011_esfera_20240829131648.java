import java.util.Locale;
import java.util.Scanner;

public class uri1011_esfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double raio = scanner.nextDouble();
        double pi = 3.14159;

        double volume = (4.0 / 3.0) * pi * raio * raio * raio;

        System.out.println("VOLUME = %.3f%n");

    }
}
