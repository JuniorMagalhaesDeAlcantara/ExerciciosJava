/*
 * Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), assumem que o resultado da divisão entre dois inteiros é outro inteiro.

Entrada
O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.

Saída
A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espaço antes e um espaço depois da igualdade. O valor deverá ser apresentado com 3 casas após o ponto.
 */

import java.util.Locale;
import java.util.Scanner;

public class uri1011_esfera {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados do teclado, configurado para o
        // formato numérico dos EUA (ponto como separador decimal)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Lê o valor do raio da esfera
        double raio = scanner.nextDouble();

        // Define o valor de pi
        double pi = 3.14159;

        // Calcula o volume da esfera usando a fórmula V = 4/3 * pi * r^3
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);

        // Exibe o volume da esfera formatado com três casas decimais
        // O uso de Locale.US garante que o ponto seja utilizado como separador decimal
        System.out.println(String.format(Locale.US, "VOLUME = %.3f", volume));
    }
}
