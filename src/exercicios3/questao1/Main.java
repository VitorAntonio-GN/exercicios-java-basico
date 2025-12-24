/*
## todos os execicios devem ter um menu de interativo para chamar as funções e ter uma opção de sair para finalizar a execução

Siga as seguintes regras para implementar
   - A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
   - O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
   - Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
   - Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
   - Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.
*/

package exercicios3.questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();
        int opcao = -1;
        double valor = 0;

        do {
            System.out.print("\n---Menu---\n");
            System.out.print("1. Depositar\n");
            System.out.print("2. Sacar\n");
            System.out.print("3. Pagar boleto\n");
            System.out.print("4. Verificar limite cheque especial\n");
            System.out.print("5. Pegar cheque especial\n");
            System.out.print("0. Sair\n");

            System.out.print("\nDigite a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1 -> {
                    valor = pedirValor();

                    contaBancaria.depositar(valor);
                }
                case 2, 3 ->  {
                    valor = pedirValor();

                    contaBancaria.sacar(valor);
                }
                case 4 -> {
                    System.out.printf("\nO limite do cheque especial é de: R$%.2f\n", contaBancaria.getLimiteChequeEspecial());
                }
                case 5 -> {
                    valor = pedirValor();

                    contaBancaria.pegarChequeEspecial(valor);
                }
            }
        } while(opcao != 0);
    }

    private static double pedirValor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        while(valor <= 0) {
            ContaBancaria.verificarValor(valor);

            System.out.print("\nDigite o valor: ");
            valor = scanner.nextDouble();
            scanner.nextLine();
        }

        return valor;
    }
}
