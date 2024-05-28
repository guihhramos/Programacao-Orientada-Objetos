import animais.Cachorro;
import animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        Gato gato = new Gato("Tom", 5);
        gato.comer();
        gato.emitirSom();

        Cachorro cachorro = new Cachorro("husky siberiano", "Branco e Preto");
        cachorro.comer();
        cachorro.emitirSom();
    }
}
