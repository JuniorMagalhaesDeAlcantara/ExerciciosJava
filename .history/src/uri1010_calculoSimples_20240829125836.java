
import java.util.Locale;
import java.util.Scanner;

public class uri1010_calculoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int codigoPeca1 = scanner.nextInt();
        int numeroPecas1 = scanner.nextInt();
        double valorPeca1 = scanner.nextDouble();

        int codigoPeca2 = scanner.nextInt();
        int numeroPecas2 = scanner.nextInt();
        double valorPeca2 = scanner.nextDouble();

        double total = numeroPecas1 * valorPeca1 + numeroPecas2 * valorPeca2;

        System.out.println("VALOR A PAGAR: R$" + total);

    }
}
