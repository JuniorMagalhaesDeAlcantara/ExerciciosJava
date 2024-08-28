
import java.util.Locale;
import java.util.Scanner;

public class uri1009_salarioBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nomeVendedor = scanner.next();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        double salarioTotal = totalVendas * 0.15 + salarioFixo;

        System.out.println("TOTAL = R$ " + salarioTotal);
    }
}
