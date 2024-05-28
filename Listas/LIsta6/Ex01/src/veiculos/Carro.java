package veiculos;

public class Carro implements Veiculo {
    private String modelo;
    private int velocidade;

    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public void acelerar() {
        System.out.println("(vruuum!) O " + this.modelo + " esta acelerando");
    }

    @Override
    public void frear() {
        System.out.println("(Screech!) O " + this.modelo + " esta freando");
    }
}
