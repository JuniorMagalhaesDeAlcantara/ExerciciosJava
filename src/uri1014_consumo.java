/*
 * Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
 */

import java.util.Locale;
import java.util.Scanner;

public class uri1014_consumo {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        // Define o locale para o padrão dos Estados Unidos, onde o ponto (.) é usado
        // como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Lê um valor inteiro da entrada, representando a distância percorrida
        int distancia = scanner.nextInt();

        // Lê um valor de ponto flutuante da entrada, representando o combustível
        // consumido
        double combustivel = scanner.nextDouble();

        // Calcula o consumo médio de combustível (distância / combustível)
        double consumo = distancia / combustivel;

        // Imprime o consumo médio formatado com três casas decimais
        // Locale.US é usado para garantir que o ponto seja usado como separador decimal
        System.out.println(String.format(Locale.US, "%.3f km/l", consumo));

        // Fecha o scanner para liberar os recursos utilizados
        scanner.close();
    }
}
