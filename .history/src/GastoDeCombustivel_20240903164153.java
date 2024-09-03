
import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int tempo = scanner.nextInt();
        int velocidade = scanner.nextInt();

        int distancia = velocidade * tempo;

        double combustivel = distancia / 12;

        System.out.println(combustivel);
    }
}