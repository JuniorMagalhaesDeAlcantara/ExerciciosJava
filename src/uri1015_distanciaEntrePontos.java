/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula:

Distancia =

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.
 */

import java.util.Locale;
import java.util.Scanner;

public class uri1015_distanciaEntrePontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Leitura dos valores
        Double x1 = scanner.nextDouble();
        Double y1 = scanner.nextDouble();
        Double x2 = scanner.nextDouble();
        Double y2 = scanner.nextDouble();

        // Cálculo da distância entre os pontos
        Double distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        // Impressão do resultado com 4 casas decimais
        System.out.println(String.format(Locale.US, "%.4f", distancia));

        scanner.close();
    }
}
