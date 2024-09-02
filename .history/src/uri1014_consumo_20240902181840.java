
import java.util.Locale;
import java.util.Scanner;

public class uri1014_consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int distancia = scanner.nextInt();
        double combustivel = scanner.nextDouble();

        double consumo = distancia / combustivel;

        System.out.println(consumo + "km/l");

    }
}