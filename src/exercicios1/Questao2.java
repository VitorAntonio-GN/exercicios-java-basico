package exercicios1;
import java.util.Scanner;

/*
2. Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
   - fórmula: área=lado X lado
*/

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.printf("A área é: %f unidades ao quadrado", area);
    }
}
