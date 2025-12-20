/*
4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números,
a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão,
números menores que o primeiro número devem ser ignorados
*/

package Exercicios2;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número -> O que será dividido: ");
        int dividendo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o segundo número -> O que dividirá: ");
        int divisor = scanner.nextInt();
        scanner.nextLine();

        boolean isMod0 = dividendo % divisor == 0;
        boolean isPrimDivMaior = false;
        int primeiroDiv = divisor;

        while(isMod0 || isPrimDivMaior) {
            if(isMod0)
                System.out.print("\nErro! O dividendo mod divisor é 0\n");
            if(isPrimDivMaior)
                System.out.print("\nErro! o divisor é menor que o primeiro divisor\n");

            System.out.print("\nDigite um novo valor para o divisor, tal que:\n");
            System.out.print("- O novo divisor seja maior que o primeiro divisor\n");
            System.out.print("- O dividendo mod divisor seja diferente de 0\n");

            System.out.print("\nInsira o valor do novo divisor: ");
            divisor = scanner.nextInt();
            scanner.nextLine();

            isMod0 = dividendo % divisor == 0;
            isPrimDivMaior = divisor < primeiroDiv;
        }

        return;
    }
}
