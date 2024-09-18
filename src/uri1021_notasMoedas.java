/*
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
 */

import java.util.Locale;
import java.util.Scanner;

public class uri1021_notasMoedas {
    public static void main(String[] args) {
        // Define o Locale para garantir que o ponto seja usado como separador decimal
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Lê o valor de ponto flutuante
        double valor = sc.nextDouble();
        int notas = (int) valor; // Parte inteira do valor
        int moedas = (int) Math.round((valor - notas) * 100); // Parte decimal do valor

        // Notas disponíveis
        int[] notasValores = { 100, 50, 20, 10, 5, 2 };
        // Moedas disponíveis
        int[] moedasValores = { 100, 50, 25, 10, 5, 1 };

        // Calculando as notas
        System.out.println("NOTAS:");
        for (int nota : notasValores) {
            int qtdNotas = notas / nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", qtdNotas, (double) nota);
            notas %= nota; // Atualiza o valor das notas restantes
        }

        // Calculando as moedas
        System.out.println("MOEDAS:");
        for (int moeda : moedasValores) {576.73
            int qtdMoedas = moedas / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", qtdMoedas, moeda / 100.0);
            moedas %= moeda; // Atualiza o valor das moedas restantes
        }

        sc.close();
    }
}
