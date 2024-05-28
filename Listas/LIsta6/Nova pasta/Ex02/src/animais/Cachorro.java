package animais;

public class Cachorro {
    String raca;
    String cor;

    public Cachorro(String raca, String cor) {
        this.raca = raca;
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void comer() {
        System.out.println("O " + this.raca + " está comendo ração.");
    }

    public void emitirSom() {
        System.out.println("Au! Au!");
    }

}
