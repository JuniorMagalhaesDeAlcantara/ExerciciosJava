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
