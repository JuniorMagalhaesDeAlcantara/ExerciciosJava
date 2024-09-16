/*
 * Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
 */

import java.util.Scanner;

public class uri1020_idade_dias {
    public static void main(String[] args) {
        // Criação de um Scanner para capturar a entrada
        Scanner sc = new Scanner(System.in);

        // Entrada: valor inteiro representando a idade em dias
        int idadeEmDias = sc.nextInt();

        // Cálculo do número de anos
        int anos = idadeEmDias / 365;
        int restoAnos = idadeEmDias % 365;

        // Cálculo do número de meses
        int meses = restoAnos / 30;
        int dias = restoAnos % 30;

        // Saída formatada
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        // Fechar o Scanner
        sc.close();
    }
}
