
import java.util.Scanner;

public class uri1005_media {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double media = ((a * 3.5) + (b * 7.5)) / (3.5 + 7.5);

        System.out.println("MEDIA = " + media);

    }

}
