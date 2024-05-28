import veiculos.Carro;
import veiculos.Moto;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Fusca", 0);
        carro.acelerar();
        carro.frear();
        carro.getModelo();

        Moto moto = new Moto("Honda", 125);
        moto.acelerar();
        moto.frear();
        moto.getMarca();
       }
}
