package exercicios3.questao2;

import java.util.Scanner;

public class Carro {
    private boolean isLigado;
    private double velocidade;
    private short marcha;

    Carro() {
        isLigado = false;
        velocidade = 0d;
        marcha = 0;
    }

    public boolean getIsLigado() {
        return this.isLigado;
    }

    public void setIsLigado(boolean isLigado) {
        this.isLigado = isLigado;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public short getMarcha() {
        return this.marcha;
    }

    public void setMarcha(short marcha) {
        this.marcha = marcha;
    }

    public void ligarCarro() {
        if(verificarCarro(1) == -1)
            return;
        else if(this.marcha != 0) {
            System.out.print("\nErro! A marcha deve estar no ponto morto\n");
            return;
        }
        else if(this.velocidade != 0) {
            System.out.print("\nErro! O carro deve estar parado\n");
            return;
        }

        this.isLigado = true;
        this.marcha = 1;

        System.out.print("\nO carro foi ligado!\n");
        return;
    }

    public void desligarCarro() {
        if(verificarCarro(0) == -1)
            return;
        else if(this.marcha != 0) {
            System.out.print("\nErro! A marcha deve estar no ponto morto\n");
            return;
        }
        else if(this.velocidade != 0) {
            System.out.print("\nErro! O carro deve estar parado\n");
            return;
        }

        this.isLigado = false;

        System.out.print("\nO carro foi desligado!\n");
        return;
    }

    public void acelerar() {
        if(this.verificarCarro(0) == -1)
            return;

        if(this.marcha == 1 && this.velocidade >= 0 && this.velocidade < 20)
            this.velocidade += 1;
        else if(this.marcha == 2 && this.velocidade >= 21 && this.velocidade < 40)
            this.velocidade++;
        else if(this.marcha == 3 && this.velocidade >= 41 && this.velocidade < 60)
            this.velocidade++;
        else if(this.marcha == 4 && this.velocidade >= 61 && this.velocidade < 80)
            this.velocidade++;
        else if(this.marcha == 5 && this.velocidade >= 81 && this.velocidade < 100)
            this.velocidade++;
        else if(this.marcha == 6 && this.velocidade >= 101 && this.velocidade < 120)
            this.velocidade++;
        else {
            System.out.printf("\nErro! Velocidade máxima atingida para a %h marcha\n", this.marcha);
            return;
        }

        System.out.printf("\nA velocidade do carro agora é de %.2f Km/s\n", this.velocidade);
        return;
    }

    public void diminuirVelocidade() {
        if(this.verificarCarro(0) == -1)
            return;

        if(this.marcha == 1 && this.velocidade > 1 && this.velocidade <= 20)
            this.velocidade--;
        else if(this.marcha == 2 && this.velocidade > 21 && this.velocidade <= 40)
            this.velocidade--;
        else if(this.marcha == 3 && this.velocidade > 41 && this.velocidade <= 60)
            this.velocidade--;
        else if(this.marcha == 4 && this.velocidade > 61 && this.velocidade <= 80)
            this.velocidade--;
        else if(this.marcha == 5 && this.velocidade > 81 && this.velocidade <= 100)
            this.velocidade--;
        else if(this.marcha == 6 && this.velocidade > 101 && this.velocidade <= 120)
            this.velocidade--;
        else {
            System.out.printf("\nErro! Velocidade mínima atingida para a %h marcha\n", this.marcha);
            return;
        }

        System.out.printf("\nA velocidade do carro agora é de %.2f Km/s\n", this.velocidade);
        return;
    }

    public void virarEsquerdaDireita() {
        if(this.verificarCarro(0) == -1)
            return;
        else if(!(this.velocidade > 0 && this.velocidade <= 40)) {
            System.out.printf("\nErro! O caro não pode ser virado na velocidade de %.2f Km/h\n", this.velocidade);
            return;
        }

        System.out.print("\nO carro foi virado com sucesso\n");
        return;
    }

    public void verificarVelocidade() {
        System.out.printf("\nA velocidade atual é de %.2f Km/h\n", this.velocidade);
        return;
    }

    public void trocarMarcha() {
        if(this.verificarCarro(0) == -1)
            return;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite a marcha: ");
        short novaMarcha = scanner.nextShort();
        scanner.nextLine();

        short marchaPossivel = -1;
        double velocidadeMarcha = 0;
        if(this.velocidade == 1d) {
            marchaPossivel = 0;
            velocidadeMarcha = 0d;
        } else if (this.velocidade == 20d) {
            marchaPossivel = 2;
            velocidadeMarcha = 21d;
        } else if (this.velocidade == 21d) {
            marchaPossivel = 1;
            velocidadeMarcha = 20d;
        } else if (this.velocidade == 40d) {
            marchaPossivel = 3;
            velocidadeMarcha = 41d;
        } else if (this.velocidade == 41d) {
            marchaPossivel = 2;
            velocidadeMarcha = 40d;
        } else if(this.velocidade == 60d) {
            marchaPossivel = 4;
            velocidadeMarcha = 61d;
        } else if(this.velocidade == 61d) {
            marchaPossivel = 3;
            velocidadeMarcha = 60d;
        } else if(this.velocidade == 80d) {
            marchaPossivel = 5;
            velocidadeMarcha = 81d;
        } else if(this.velocidade == 81d) {
            marchaPossivel = 4;
            velocidadeMarcha = 80d;
        } else if(this.velocidade == 100d) {
            marchaPossivel = 6;
            velocidadeMarcha = 101d;
        } else if(this.velocidade == 101d) {
            marchaPossivel = 5;
            velocidadeMarcha = 100d;
        }

        if(marchaPossivel != novaMarcha) {
            System.out.print("\nErro! Não é possível trocar para essa marcha\n");
            return;
        }

        this.marcha = novaMarcha;
        this.velocidade = velocidadeMarcha;

        System.out.printf("\nA nova marcha é %d, e a velocidade do carro é de %.2f Km/h\n", novaMarcha, velocidadeMarcha);
        return;
    }

    public int verificarCarro(int modo) {
        /*
        * 0 - Carro desligado
        * 1 - Carro ligado
        * 2/outros - Padrão
        */

        boolean hasErro = false;

        if((this.marcha == 0 && this.velocidade == 0d && !this.isLigado) && modo == 0) { //Verifica se está desligado
            System.out.print("\nErro! Carro desligado\n");
            hasErro = true;
        } else if(this.isLigado && modo == 1) { //Verifica se está ligado
            System.out.print("\nErro! Carro ligado\n");
            hasErro = true;
        }

        if(this.velocidade < 0d) {
            System.out.print("\nErro! Velocidade negativa\n");
            hasErro = true;
        }
        else if(this.velocidade > 120d) {
            System.out.print("\nErro! Velocidade máxima ultrapassado\n");
            hasErro = true;
        }

        if(this.marcha < 0) {
            System.out.print("\nErro! Marcha negativa\n");
            hasErro = true;
        }
        else if(this.marcha > 6) {
            System.out.print("\nErro! Marcha inexistente\n");
            hasErro = true;
        }

        if(hasErro)
            return -1;

        return 1;
    }
}
