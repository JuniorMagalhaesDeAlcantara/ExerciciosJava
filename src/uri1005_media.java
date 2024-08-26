/*Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal. */

import java.util.Locale;
import java.util.Scanner;

public class uri1005_media {
    public static void main(String[] args) {

        // Configura o Scanner para usar o Locale US, onde o ponto é o separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double a = scanner.nextDouble(); // Lê a primeira nota (espera entrada com ponto)
        double b = scanner.nextDouble(); // Lê a segunda nota (espera entrada com ponto)

        // Calcula a média ponderada
        double media = ((a * 3.5) + (b * 7.5)) / (3.5 + 7.5);

        // Imprime a média formatada com 5 casas decimais
        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close(); // Fecha o Scanner
    }
}
