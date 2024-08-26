
import java.util.Locale;
import java.util.Scanner;

public class uri1006_media2 {
    public static void main(String[] args) {
        Scanner entrada = new scanner(System.in).useLocale(Locale.US);
        Double a = entrada.nextDouble();
        Double b = entrada.nextDouble();
        Double c = entrada.nextDouble();

        Double media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        // Imprime a média formatada com 5 casas decimais
        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close(); // Fecha o Scanner
    }
}
