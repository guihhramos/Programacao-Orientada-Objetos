package veiculos;

public class Moto {
    private String marca;
    private int cilindrada;

    public Moto(String marca, int cilindrada) {
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    
    public void acelerar() {
        System.out.println("(ruuum!) O " + this.marca + " esta acelerando ");
    }

    
    public void frear() {
        System.out.println("(Screech!) O " + this.marca + " esta freando ");
    }
}
