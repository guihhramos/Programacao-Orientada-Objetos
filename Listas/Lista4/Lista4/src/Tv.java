public class Tv {
    String cor;
    String marca;
    String tamanho;
    boolean estaLigado;
    boolean estaNatomada;

    public void ligadoOuDesligadoTv() {
        if (estaLigado){
            System.out.println("Esta na tomada e esta ligada, vou assistir o jogo do SP");
            estaNatomada = true;
        }else{
            System.out.println("Nao esta na tomada, pois nao esta ligada");
            estaNatomada = false;
        }
    }

    public void iniciar() {
        if(!estaLigado) {
            System.out.println("(Ja esta 1 x 0 aaee!!!)");
        } else if (estaNatomada) {
            System.out.println("Como vou assistir o jogo...");
        }
    }

    public void imprimirAtributosTv() {
        System.out.println("cor: " + cor);
        System.out.println("tamanho: " + tamanho);
        System.out.println("marca da tv: " + marca);
        System.out.println("esta ligado?: " + estaLigado);
        System.out.println("esta na tomada?: " + estaNatomada) ;
    }
}
