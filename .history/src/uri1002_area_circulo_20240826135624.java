import java.util.Locale;
import java.util.Scanner;

public class uri1002_area_circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Configura o Scanner para usar o Locale dos EUA
        scanner.useLocale(Locale.US);

        // Leitura do valor do raio

        double raio = scanner.nextDouble();

        // Valor de PI
        double pi = 3.14159;

        // Cálculo da área do círculo
        double area = pi * raio * raio;

        // Formata a área como uma string com 4 casas decimais
        String areaFormatada = String.format("%.4f", area);

        // Substitui a vírgula por ponto na string formatada
        areaFormatada = areaFormatada.replace(',', '.');

        // Impressão da área
        System.out.println("A=" + areaFormatada);

    }

}