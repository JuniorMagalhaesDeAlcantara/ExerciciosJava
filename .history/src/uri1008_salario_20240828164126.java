/*
 * Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
 */

import java.util.Locale;
import java.util.Scanner;

public class uri1008_salario {
    public static void main(String[] args) {
        // Configura o Scanner para usar o Locale US, onde o ponto é o separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Entradas
        int numeroFuncionario = scanner.nextInt();
        int horasTrabalhada = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        // Calculo
        double salario = horasTrabalhada * valorHora;

        // Saída
        System.out.println("NUMBER = " + numeroFuncionario);
        System.err.println("SALARY = U$ " + salario);

        scanner.close(); // Fecha o Scanner

    }
}
