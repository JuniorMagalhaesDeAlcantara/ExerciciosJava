/*
 * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
 */

import java.util.Locale;
import java.util.Scanner;

public class uri1012_area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();

        Double triangulo = a * b * 0.5;
        Double circulo = c * c * 3.14159;
        Double trapezio = 0.5 * (a + b) * c;
        Double quadrado = b * b;
        Double retangulo = a * b;

        System.out.println(String.format(Locale.US, "TRIANGULO: %.3f", triangulo));
        System.out.println(String.format(Locale.US, "CIRCULO: %.3f", circulo));
        System.out.println(String.format(Locale.US, "TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format(Locale.US, "QUADRADO: = %.3f", quadrado));
        System.out.println(String.format(Locale.US, "RETANGULO: = %.3f", retangulo));

    }
}
