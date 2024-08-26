/*Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. */

import java.util.Scanner;

public class basico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores de A e B
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Soma dos valores e atribuição ao X
        int X = A + B;

        // Impressão do resultado
        System.out.println("X = " + X);

        scanner.close();
    }

}
