/*
Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
Ligar o carro;
Desligar o carro;
Acelerar;
diminuir velocidade;
virar para esquerda/direita
verificar velocidade;
trocar a marcha
Siga as seguintes regras na implementação

Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
O carro desligado não pode realizar nenhuma função;
Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
A velocidade do carro deve respeitar os seguintes limites para cada velocidade
se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km;
*/

package exercicios3.questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        short opcao = -1;

        do {
            System.out.print("\nMenu:\n");
            System.out.print("1 - Ligar o carro\n");
            System.out.print("2 - Desligar o carro\n");
            System.out.print("3 - Acelerar\n");
            System.out.print("4 - Diminuir velocidade\n");
            System.out.print("5 - Virar para esquerda/direita\n");
            System.out.print("6 - Verificar velocidade\n");
            System.out.print("7 - Trocar a marcha\n");
            System.out.print("0 - Sair\n");

            System.out.print("\nDigite a opção: ");
            opcao = scanner.nextShort();
            scanner.nextLine();

            switch(opcao) {
                case 1 -> carro.ligarCarro();
                case 2 -> carro.desligarCarro();
                case 3 -> carro.acelerar();
                case 4 -> carro.diminuirVelocidade();
                case 5 -> carro.virarEsquerdaDireita();
                case 6 -> carro.verificarVelocidade();
                case 7 -> carro.trocarMarcha();
            }
        }while(opcao != 0);
    }
}
