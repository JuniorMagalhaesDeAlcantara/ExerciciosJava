import java.util.Locale; // Importa a classe Locale para definir o formato de localização
import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class uri1012_area {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        // Define o Locale como US para garantir que o ponto (.) seja usado como
        // separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Lê três valores com ponto flutuante de dupla precisão
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();

        // Calcula a área do triângulo retângulo com base 'a' e altura 'c'
        Double triangulo = 0.5 * a * c;

        // Calcula a área do círculo com raio 'c'
        // Pi é definido como 3.14159
        Double circulo = c * c * 3.14159;

        // Calcula a área do trapézio com bases 'a' e 'b' e altura 'c'
        Double trapezio = 0.5 * (a + b) * c;

        // Calcula a área do quadrado com lado 'b'
        Double quadrado = b * b;

        // Calcula a área do retângulo com lados 'a' e 'b'
        Double retangulo = a * b;

        // Imprime a área do triângulo com 3 casas decimais
        // Usa Locale.US para garantir a formatação correta dos números decimais
        System.out.println(String.format(Locale.US, "TRIANGULO: %.3f", triangulo));

        // Imprime a área do círculo com 3 casas decimais
        System.out.println(String.format(Locale.US, "CIRCULO: %.3f", circulo));

        // Imprime a área do trapézio com 3 casas decimais
        System.out.println(String.format(Locale.US, "TRAPEZIO: %.3f", trapezio));

        // Imprime a área do quadrado com 3 casas decimais
        // A mensagem de saída deve ser "QUADRADO:", e não "QUADRADO: ="
        System.out.println(String.format(Locale.US, "QUADRADO: %.3f", quadrado));

        // Imprime a área do retângulo com 3 casas decimais
        // A mensagem de saída deve ser "RETANGULO:", e não "RETANGULO: ="
        System.out.println(String.format(Locale.US, "RETANGULO: %.3f", retangulo));
    }
}
