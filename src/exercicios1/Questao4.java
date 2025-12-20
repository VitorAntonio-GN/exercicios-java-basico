package exercicios1;
import java.util.Scanner;

/*
4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
*/

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nomePrimeira = scanner.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idadePrimeira = scanner.nextInt();
        scanner.nextLine(); //<- Erro de buffer

        System.out.print("Digite o nome da segunda pessoa: ");
        String nomeSegunda = scanner.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idadeSegunda = scanner.nextInt();
        scanner.nextLine(); //<- Erro de buffer

        int diferenca = (idadePrimeira - idadeSegunda >= 0) ? (idadePrimeira - idadeSegunda) : (idadeSegunda - idadePrimeira);

        System.out.printf("A diferença de idades entre %s e %s é de %d anos", nomePrimeira, nomeSegunda, diferenca);
    }
}
