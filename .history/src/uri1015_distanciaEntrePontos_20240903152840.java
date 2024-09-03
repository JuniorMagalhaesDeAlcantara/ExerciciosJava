
import java.util.Locale;
import java.util.Scanner;

public class uri1015_distanciaEntrePontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Leitura dos valores
        Double x1 = scanner.nextDouble();
        Double y1 = scanner.nextDouble();
        Double x2 = scanner.nextDouble();
        Double y2 = scanner.nextDouble();

        // Cálculo da distância entre os pontos
        Double distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        // Impressão do resultado com 4 casas decimais
        System.out.println(String.format(Locale.US, "%.4f", distancia));

        scanner.close();
    }
}
