
import java.util.Locale;
import java.util.Scanner;

public class uri1006_media2 {
    public static void main(String[] args) {
        // Configura o Scanner para usar o Locale US, onde o ponto é o separador decimal
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        // Lê a primeira nota (espera entrada com ponto)
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        // Calcula a média ponderada
        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        // Imprime a média formatada com 5 casas decimais
        System.out.printf("MEDIA = %.1f%n", media);

        entrada.close(); // Fecha o Scanner
    }
}
