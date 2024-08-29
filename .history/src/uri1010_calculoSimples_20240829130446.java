/*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto. */

import java.util.Locale;
import java.util.Scanner;

public class uri1010_calculoSimples {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados do teclado, configurado para o
        // formato numérico dos EUA (ponto como separador decimal).
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Lê o código da peça 1 (um número inteiro).
        int codigoPeca1 = scanner.nextInt();
        // Lê o número de peças 1 (um número inteiro).
        int numeroPecas1 = scanner.nextInt();
        // Lê o valor unitário da peça 1 (um número decimal com duas casas após o
        // ponto).
        double valorPeca1 = scanner.nextDouble();

        // Lê o código da peça 2 (um número inteiro).
        int codigoPeca2 = scanner.nextInt();
        // Lê o número de peças 2 (um número inteiro).
        int numeroPecas2 = scanner.nextInt();
        // Lê o valor unitário da peça 2 (um número decimal com duas casas após o
        // ponto).
        double valorPeca2 = scanner.nextDouble();

        // Calcula o valor total a pagar, multiplicando a quantidade pelo valor unitário
        // para cada peça e somando os resultados.
        double total = numeroPecas1 * valorPeca1 + numeroPecas2 * valorPeca2;

        // Imprime o valor total a pagar no formato solicitado, com 2 casas decimais.
        // Nota: há um erro na formatação da String; o "+" deveria estar dentro da
        // String para concatenar com o total.
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
}
