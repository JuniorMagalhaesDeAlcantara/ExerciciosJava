/*
 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 */

import java.util.Locale;
import java.util.Scanner;

public class uri1009_salarioBonus {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        // Configura o Scanner para usar o formato de números com ponto como separador
        // decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Lê o nome do vendedor (não utilizado neste exemplo, mas incluído conforme
        // especificação)
        String nomeVendedor = scanner.next();

        // Lê o salário fixo do vendedor
        double salarioFixo = scanner.nextDouble();

        // Lê o total de vendas realizadas pelo vendedor
        double totalVendas = scanner.nextDouble();

        // Calcula o salário total do vendedor
        // O salário total é a soma do salário fixo com 15% do total de vendas
        double salarioTotal = totalVendas * 0.15 + salarioFixo;

        // Imprime o salário total formatado com duas casas decimais
        // O formato "%.2f" garante que o número seja exibido com duas casas decimais
        System.out.println(String.format("TOTAL = R$ %.2f", salarioTotal));
    }
}
