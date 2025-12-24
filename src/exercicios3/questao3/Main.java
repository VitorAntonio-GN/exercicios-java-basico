/*
3. Escreva um código onde temos o controle de banho de um petshop, a maquina de banhos dos pets deve ter as seguintes operações:
   - Dar banho no pet;
   - Abastecer com água;
   - Abastecer com shampoo;
   - verificar nivel de água;
   - verificar nivel de shampoo;
   - verificar se tem pet no banho;
   - colocar pet na maquina;
   - retirar pet da máquina;
   - limpar maquina.

Siga as seguintes regras para implementação

   - A maquina de banho deve permitir somente 1 pet por vez;
   - Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
   - A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
   - Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina para permitir a entrada de outro pet;
   - A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
   - O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;
*/

package exercicios3.questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaBanho maquinaBanho = new MaquinaBanho();
        int opcao = -1;

        do {
            System.out.print("\nMenu:\n");
            System.out.print("1 - Dar banho\n");
            System.out.print("2 - Abastecer com água\n");
            System.out.print("3 - Abastecer com shampoo\n");
            System.out.print("4 - Verificar nível de água\n");
            System.out.print("5 - Verificar nível de shampoo\n");
            System.out.print("6 - Verificar se tem pet\n");
            System.out.print("7 - Colocar pet na máquina\n");
            System.out.print("8 - Retirar pet na máquina\n");
            System.out.print("9 - Limpar máquina\n");
            System.out.print("0 - Sair do menu\n");

            System.out.print("\nDigite a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1 -> maquinaBanho.darBanho();
                case 2 -> maquinaBanho.abastecerAgua();
                case 3 -> maquinaBanho.abastecerShampoo();
                case 4 -> maquinaBanho.verificarAgua();
                case 5 -> maquinaBanho.verificarShampoo();
                case 6 -> maquinaBanho.verificarPet();
                case 7 -> maquinaBanho.colocarPet();
                case 8 -> maquinaBanho.retirarPet();
                case 9 -> maquinaBanho.limparMaquina();
            }
        } while(opcao != 0);
    }
}
