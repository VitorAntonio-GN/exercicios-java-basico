/*
3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar,
com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados,
incluindo os números informados e em ordem decrescente;
*/

package Exercicios2;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor do intervalo: ");
        int ponto1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o segundo valor do intervalo: ");
        int ponto2 = scanner.nextInt();
        scanner.nextLine();

        while(ponto2 <= ponto1) {
            System.out.print("Erro! o segundo valor do intervalo é menor que o primeiro valor\n");
            System.out.print("Digite um segundo valor válido: ");
            ponto2 = scanner.nextInt();
            scanner.next();
        }

        boolean isPonto1Par = ponto1 % 2 == 0;
        int primeiroPar = isPonto1Par ? ponto1 : ponto1 + 1;
        int primeiroImpar = !isPonto1Par ? ponto1 : ponto1 + 1;

        boolean isPonto2Par = ponto2 % 2 == 0;
        int ultimoPar = isPonto2Par ? ponto2 : ponto2 - 1;
        int ultimoImpar = !isPonto2Par ? ponto2 : ponto2 - 1;

        System.out.print("\nValores pares - Crescente:\n");
        for(int i = primeiroPar; i <= ponto2; i += 2) {
            System.out.printf("%d\n", i);
        }

        System.out.print("\nValores pares - Decrescente:\n");
        for(int i = ultimoPar; i >= ponto1; i -= 2) {
            System.out.printf("%d\n", i);
        }

        System.out.print("\nValores ímpares - Crescente:\n");
        for(int i = primeiroImpar; i <= ponto2; i += 2) {
            System.out.printf("%d\n", i);
        }

        System.out.printf("\nValores ímpares - Decrescente:\n");
        for(int i = ultimoImpar; i >= ponto1; i -= 2) {
            System.out.printf("%d\n", i);
        }

        return;
    }
}
