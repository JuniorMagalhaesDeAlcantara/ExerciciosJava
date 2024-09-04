
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