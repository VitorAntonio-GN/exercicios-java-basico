package Exercicios1;
import java.time.OffsetDateTime;
import java.util.Scanner;

/*
1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
*/

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        int idade = OffsetDateTime.now().getYear() - anoNascimento;

        System.out.printf("Olá '%s' você tem '%d' anos", nome, idade);
    }
}
