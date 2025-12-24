/*
1. Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
    - Consultar saldo
    - consultar cheque especial
    - Depositar dinheiro;
    - Sacar dinheiro;
    - Pagar um boleto.
    - Verificar se a conta está usando cheque especial.
*/

package exercicios3.questao1;

public class ContaBancaria {
    private double saldo;
    private double dividaChequeEspecial;
    private double limiteChequeEspecial;
    private double taxaChequeEspecial;
    private boolean isCriouConta;

    ContaBancaria() {
        this.saldo = 0d;
        this.dividaChequeEspecial = 0d;
        this.taxaChequeEspecial = 0d;
        this.limiteChequeEspecial = 0d;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDividaChequeEspecial() {
        return this.dividaChequeEspecial;
    }

    public void setDividaChequeEspecial(double dividaChequeEspecial) {
        this.dividaChequeEspecial = dividaChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return this.limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getTaxaChequeEspecial() {
        return this.taxaChequeEspecial;
    }

    public void setTaxaChequeEspecial(double taxaChequeEspecial) {
        this.taxaChequeEspecial = taxaChequeEspecial;
    }

    public boolean getIsCriouConta() {
        return isCriouConta;
    }

    public void setIsCriouConta(boolean criouConta) {
        this.isCriouConta = criouConta;
    }

    public void depositar(double valor) {
        if(ContaBancaria.verificarValor(valor) == -1)
            return;
        else if(!this.isCriouConta) {
            this.criarConta(valor);
            return;
        }

        double saldoDeposito = this.saldo + valor;

        this.saldo = saldoDeposito;
        System.out.printf("\nSeu novo saldo agora é de: R$%.2f\n", saldoDeposito);

        if(this.taxaChequeEspecial != 0d && this.taxaChequeEspecial <= this.saldo) {
            System.out.printf("\nAviso! Descontando taxa do cheque especial (R$%.2f)\n", this.taxaChequeEspecial);
            this.saldo -= this.taxaChequeEspecial;
        }

        return;
    }

    public void sacar(double valor) {
        if(ContaBancaria.verificarValor(valor) == -1)
            return;

        double saldoSaque = this.saldo - valor;

        if(this.saldo < valor) {
            System.out.print("\nErro ao sacar! Saldo insuficiente\n");
            return;
        }

        this.saldo = saldoSaque;
        System.out.printf("\nSeu novo saldo agora é de: R$%.2f\n", saldoSaque);

        return;
    }

    public void pegarChequeEspecial(double valor) {
        if(ContaBancaria.verificarValor(valor) == -1)
            return;
        else if(valor > this.limiteChequeEspecial) {
            System.out.print("\nErro! Valor acima do limite do cheque especial\n");
            return;
        }

        this.dividaChequeEspecial = valor;
        this.taxaChequeEspecial = valor * 0.2d;

        if(this.taxaChequeEspecial <= this.saldo) {
            System.out.printf("\nAviso! Descontando taxa do cheque especial (R$%.2f)\n", this.taxaChequeEspecial);
            this.saldo -= this.taxaChequeEspecial;
        }

        return;
    }

    public void criarConta(double valor) {
        if(ContaBancaria.verificarValor(valor) == -1)
            return;
        else if(isCriouConta) {
            System.out.print("\nErro! Já criou uma conta\n");
            return;
        }

        this.saldo = valor;
        this.dividaChequeEspecial = 0d;
        this.taxaChequeEspecial = 0d;
        this.limiteChequeEspecial = valor <= 500d ? 50d : valor * 0.5;
        this.isCriouConta = true;
    }

    public static int verificarValor(double valor) {
        if(valor == 0) {
            System.out.print("\nErro! Valor nulo\n");
            return -1;
        } else if(valor < 0) {
            System.out.print("\nErro! Valor negativo\n");
            return -1;
        }
        return 1;
    }
}
