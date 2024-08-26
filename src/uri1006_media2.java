
/*Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal. */

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
