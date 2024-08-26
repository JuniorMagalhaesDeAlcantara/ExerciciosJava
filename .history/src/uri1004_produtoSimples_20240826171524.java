/*Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.    */

import java.util.Scanner;

public class uri1004_produtoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler os dados

        int a = scanner.nextInt(); // Lê o primeiro número inteiro
        int b = scanner.nextInt(); // Lê o segundo número inteiro

        int soma = a + b; // Soma os dois números e armazena o resultado

        System.out.println("SOMA = " + soma); // Imprime o resultado da soma
    }
}
