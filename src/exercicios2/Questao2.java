/*
2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
   - Se for menor ou igual a 18,5 "Abaixo do peso";
   - se for entre 18,6 e 24,9 "Peso ideal";
   - Se for entre 25,0 e 29,9 "Levemente acima do peso";
   - Se for entre 30,0 e 34,9 "Obesidade Grau I";
   - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
   - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
*/

package exercicios2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua altura(m): ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite o seu peso(kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        double IMC = peso / (altura * altura);
        System.out.printf("IMC: %.2f\n", IMC);

        if(IMC <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if(IMC <= 24.9) {
            System.out.println("Peso ideal");
        } else if(IMC <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if(IMC <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if(IMC <= 39.9) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III");
        }

        return;
    }
}
