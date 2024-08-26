import java.util.Locale;
import java.util.Scanner;

public class uri1005_media {
    public static void main(String[] args) {

        // Configura o scanner para usar o Locale padrão do sistema
        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());

        double a = scanner.nextDouble(); // Lê a primeira nota
        double b = scanner.nextDouble(); // Lê a segunda nota

        // Calcula a média ponderada
        double media = ((a * 3.5) + (b * 7.5)) / (3.5 + 7.5);

        // Imprime a média formatada com 5 casas decimais
        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close(); // Fecha o scanner para evitar vazamentos de recurso
    }
}
