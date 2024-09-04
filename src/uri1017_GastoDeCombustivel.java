/*
 * Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.

Entrada
O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h).
 */

import java.util.Locale;
import java.util.Scanner;

public class uri1017_GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Leitura dos valores de tempo e velocidade
        int tempo = scanner.nextInt();
        int velocidade = scanner.nextInt();

        // Cálculo da distância percorrida
        int distancia = velocidade * tempo;

        // Cálculo da quantidade de combustível necessária
        double combustivel = distancia / 12.0;

        // Impressão do resultado com três dígitos após o ponto decimal
        System.out.println(String.format(Locale.US, "%.3f", combustivel));

        scanner.close();
    }
}