import java.util.Locale;
import java.util.Scanner;

public class uri1011_esfera {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados do teclado, configurado para o
        // formato numérico dos EUA (ponto como separador decimal)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Lê o valor do raio da esfera
        double raio = scanner.nextDouble();

        // Define o valor de pi
        double pi = 3.14159;

        // Calcula o volume da esfera usando a fórmula V = 4/3 * pi * r^3
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);

        // Exibe o volume da esfera formatado com três casas decimais
        // O uso de Locale.US garante que o ponto seja utilizado como separador decimal
        System.out.println(String.format(Locale.US, "VOLUME = %.3f", volume));
    }
}
