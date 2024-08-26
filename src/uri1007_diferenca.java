
/*
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
import java.util.Scanner;

public class uri1007_diferenca {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        // Lê as entradas (espera entrada com ponto)
        int a = entradas.nextInt();
        int b = entradas.nextInt();
        int c = entradas.nextInt();
        int d = entradas.nextInt();

        // Calcula a diferença
        int diferenca = (a * b) - (c * d);

        // Imprime a diferença
        System.out.println("DIFERENCA = " + diferenca);
        entradas.close(); // Fecha o Scanner
    }

}
