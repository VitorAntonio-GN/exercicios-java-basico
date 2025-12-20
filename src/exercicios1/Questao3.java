package exercicios1;
import java.util.Scanner;

/*
3. Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
   - fórmula: área=base X altura
*/

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        double area = altura * base;
        System.out.printf("A área é de %f unidades ao quadrado", area);
    }
}
