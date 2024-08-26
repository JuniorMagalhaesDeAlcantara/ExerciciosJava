
import java.util.Scanner;

public class uri1002_area_circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double n = 3.14159;

        double area = n * raio * raio;

        System.out.println("A=" + area);

    }
}
