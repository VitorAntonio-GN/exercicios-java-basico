package exercicios3.questao3;

public class MaquinaBanho {
    private double litrosAgua;
    private double litrosShampoo;
    private boolean isSuja;
    private boolean hasPet;
    private boolean isPetLimpo;

    MaquinaBanho() {
        litrosAgua = 0d;
        litrosShampoo = 0d;
        isSuja = false;
        hasPet = false;
        isPetLimpo = false;
    }

    public double getLitrosAgua() {
        return this.litrosAgua;
    }

    public void setLitrosAgua(double litrosAgua) {
        this.litrosAgua = litrosAgua;
    }

    public double getLitrosShampoo() {
        return this.litrosShampoo;
    }

    public void setLitrosShampoo(double litrosShampoo) {
        this.litrosShampoo = litrosShampoo;
    }

    public boolean getHasPet() {
        return this.hasPet;
    }

    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }

    public boolean getIsSuje() {
        return this.isSuja;
    }

    public void setIsSuja(boolean isSuja) {
        this.isSuja = isSuja;
    }

    public boolean getIsPetLimpo() {
        return this.isPetLimpo;
    }

    public void setISPetLimpo(boolean isPetLimpo) {
        this.isPetLimpo = isPetLimpo;
    }

    public void darBanho() {
        boolean hasErro = this.verificarErros(0) == -1;

        if(this.litrosAgua < 10d) {
            System.out.print("\nErro! Água abaixo de 10L\n");
            hasErro = true;
        } if(this.litrosShampoo < 2d) {
            System.out.print("\nErro! Shampoo abaixo de 2L\n");
            hasErro = true;
        } if(this.isPetLimpo) {
            System.out.print("\nErro! O pet já está limpo\n");
            hasErro = true;
        } if(this.isSuja) {
            System.out.print("\nErro! A máquina está suja\n");
            hasErro = true;
        }

        if(hasErro) {
            return;
        }

        this.litrosAgua -= 10d;
        this.litrosShampoo -= 2d;
        this.isPetLimpo = true;

        System.out.print("\nPet limpo com sucesso\n");
        return;
    }

    public void abastecerAgua() {
        boolean hasErro = this.verificarErros(2) == -1;
        double novaAgua = this.litrosAgua + 2d;

        if(novaAgua >= 32d) {
            System.out.print("\nErro! Capacidade máxima de água já alcançada\n");
            return;
        } else if(novaAgua > 30d) {
            System.out.printf("\nForam abastecidos %.2fL de água\n", 30d - this.litrosAgua);
            this.litrosAgua = 30d;
            return;
        }

        this.litrosAgua = novaAgua;
        System.out.print("\nForam abastecidos 2.00L de água\n");
        return;
    }

    public void abastecerShampoo() {
        boolean hasErro = this.verificarErros(2) == -1;
        double novoShampoo = this.litrosShampoo + 2d;

        if(novoShampoo >= 12d) {
            System.out.print("\nErro! Capacidade máxima de shampoo já alcançada\n");
            return;
        } else if(novoShampoo > 10d) {
            System.out.printf("\nForam abastecidos %.2fL de shampoo\n", 10d - this.litrosShampoo);
            this.litrosShampoo = 10d;
            return;
        }

        this.litrosShampoo = novoShampoo;
        System.out.print("\nForam abastecidos 2.00L de shampoo\n");
        return;
    }

    public void verificarAgua() {
        if(this.verificarErros(2) == -1) {
            return;
        }

        System.out.printf("\nÁgua: %.2fL\n", this.litrosAgua);
        return;
    }

    public void verificarShampoo() {
        if(this.verificarErros(2) == -1) {
            return;
        }

        System.out.printf("\nShampoo: %.2fL\n", this.litrosShampoo);
        return;
    }

    public void verificarPet() {
        if(this.verificarErros(2) == -1) {
            return;
        }

        String resposta = hasPet ? "Sim" : "Não";
        System.out.printf("\nTêm pet no banho: %s\n", resposta);
        return;
    }

    public void colocarPet() {
        if(this.verificarErros(1) == -1) {
            return;
        }

        this.hasPet = true;
        this.isPetLimpo = false;
        System.out.print("\nPet colocado com sucesso\n");
        return;
    }

    public void retirarPet() {
        if(this.verificarErros(0) == -1) {
            return;
        } if(!this.isPetLimpo) {
            this.isSuja = true;
            System.out.print("\nAviso! O pet não foi limpo. É necessário limpar a máquina\n");
        }

        this.hasPet = false;
        this.isPetLimpo = false;
        System.out.print("\nPet retirado com sucesso\n");
        return;
    }

    public void limparMaquina() {
        boolean hasErro = this.verificarErros(1) == -1;

        if(!this.isSuja) {
            System.out.print("\nErro! A máquina não está suja\n");
            hasErro = true;
            return;
        } if(this.litrosAgua < 3d) {
            System.out.print("\nErro! Água abaixo de 3L");
            hasErro = true;
            return;
        } if(this.litrosShampoo < 1d) {
            System.out.print("\nErro! Shampoo abaixo de 1L\n");
            hasErro = true;
            return;
        }

        if(hasErro) {
            return;
        }

        this.isSuja = false;
        this.litrosAgua -= 3d;
        this.litrosShampoo -= 1d;
        System.out.print("\nA máquina foi limpa com sucesso\n");
        return;
    }

    public int verificarErros(int modo) {
        /*
        2 - Padrão
        1 - Pet na máquina
        0 - Sem pet na máquina
        */

        if(this.hasPet && modo == 1) {
            System.out.print("\nErro! Já tem um pet na máquina\n");
            return -1;
        } else if(!this.hasPet && modo == 0) {
            System.out.print("\nErro! Não tem nenhum pet na máquina\n");
            return -1;
        }

        if(this.litrosShampoo < 0d) {
            System.out.print("\nErro! Shampoo negativo\n");
            return -1;
        } else if(this.litrosShampoo > 10d) {
            System.out.print("\nErro! Shampoo acima de 10L\n");
            return -1;
        }

        if(this.litrosAgua < 0d) {
            System.out.print("\nErro! Água negativa\n");
            return -1;
        } else if(this.litrosAgua > 30d) {
            System.out.print("\nErro! Água acima de 30L\n");
            return -1;
        }

        return 0;
    }
}
