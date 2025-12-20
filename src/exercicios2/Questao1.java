/*
1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
*/

package exercicios2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }

        return;
    }
}
