/*A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Exemplos de Entrada	Exemplos de Saída
2.00                A=12.5664

100.64              A=31819.3103

150.00              A=70685.7750

*/

import java.util.Locale;
import java.util.Scanner;

public class uri1002_area_circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Configura o Scanner para usar o Locale dos EUA
        scanner.useLocale(Locale.US);

        // Leitura do valor do raio

        double raio = scanner.nextDouble();

        // Valor de PI
        double pi = 3.14159;

        // Cálculo da área do círculo
        double area = pi * raio * raio;

        // Formata a área como uma string com 4 casas decimais
        String areaFormatada = String.format("%.4f", area);

        // Substitui a vírgula por ponto na string formatada
        areaFormatada = areaFormatada.replace(',', '.');

        // Impressão da área
        System.out.println("A=" + areaFormatada);

    }

}