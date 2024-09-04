/*
 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */

import java.util.Scanner;

public class uri1018_cedulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor inteiro
        int valor = scanner.nextInt();
        int valorOriginal = valor;

        // Notas disponíveis
        int[] notas = { 100, 50, 20, 10, 5, 2, 1 };

        // Armazenar a quantidade de cada nota
        int[] quantidadeNotas = new int[notas.length];

        // Calcular o número de notas para cada tipo
        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = valor / notas[i];
            valor = valor % notas[i];
        }

        // Exibir o valor original
        System.out.println("Valor: " + valorOriginal);

        // Exibir a quantidade de cada nota necessária
        for (int i = 0; i < notas.length; i++) {
            System.out.println(quantidadeNotas[i] + " nota(s) de R$ " + notas[i] + ",00");
        }

        scanner.close();
    }
}