import java.util.Locale;
import java.util.Scanner;

public class uri1008_salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroFuncionario = scanner.nextInt();
        int horasTrabalhada = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        double salario = horasTrabalhada * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.err.println("SALARY = " + salario);

    }
}
