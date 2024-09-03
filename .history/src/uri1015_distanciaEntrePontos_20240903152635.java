
import java.util.Locale;
import java.util.Scanner;

public class uri1015_distanciaEntrePontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Double x1 = scanner.nextDouble();
        Double x2 = scanner.nextDouble();
        Double y1 = scanner.nextDouble();
        Double y2 = scanner.nextDouble();

        Double distancia = ((x2 - x1) * 2 + (y2 - y1) * 2);

        System.out.println(distancia);
    }
}
