import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Leitura dos valores de tempo e velocidade
        int tempo = scanner.nextInt();
        int velocidade = scanner.nextInt();

        // Cálculo da distância percorrida
        int distancia = velocidade * tempo;

        // Cálculo da quantidade de combustível necessária
        double combustivel = distancia / 12.0;

        // Impressão do resultado com três dígitos após o ponto decimal
        System.out.println(String.format(Locale.US, "%.3f", combustivel));

        scanner.close();
    }
}