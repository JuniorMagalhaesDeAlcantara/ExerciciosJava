
import java.util.Scanner;

public class uri1016_distancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da distância
        int distancia = scanner.nextInt();

        // Cálculo do tempo necessário
        int tempo = distancia * 2;

        // Impressão do resultado
        System.out.println(tempo + " minutos");

        scanner.close();
    }
}
