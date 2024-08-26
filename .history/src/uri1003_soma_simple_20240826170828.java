/*
 * Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente à soma de A e B. Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */

public class uri1003_soma_simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        int a = scanner.nextInt(); // Lê o primeiro número inteiro da entrada e armazena na variável 'a'
        int b = scanner.nextInt(); // Lê o segundo número inteiro da entrada e armazena na variável 'b'

        int soma = a + b; // Calcula a soma dos valores de 'a' e 'b', armazenando o resultado na variável
                          // 'soma'

        System.out.println("SOMA = " + soma); // Imprime o resultado da soma no formato "SOMA = <resultado>"
    }
}
