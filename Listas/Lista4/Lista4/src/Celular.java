public class Celular {
    String cor;
    String tamanho;
    boolean estaLigado;
    boolean estaDesbloqueado;

    public void ligadoOuDesligadoCelular() {
        if (estaLigado){
            System.out.println(" |:)| (Celular ligado)");
            estaDesbloqueado = true;
        }else{
            System.out.println("|:(| (Celular esta descarregado)");
            estaDesbloqueado = false;
        }
    }

    public void iniciar() {
        if(!estaLigado) {
            System.out.println("(Esta 0%)");
        } else if (estaDesbloqueado) {
            System.out.println("(Esta ligado)");
        }
    }

    public void colocarParaCarregar() {
        if(!estaLigado) {
            System.out.println("Coloquei pra carregar (Carregando) ");
        }
    }
    public void imprimirAtributosCelular() {
        System.out.println("cor: " + cor);
        System.out.println("tamanho: " + tamanho);
        System.out.println("esta ligado?: " + estaLigado);
        System.out.println("esta desbloqueado?: " + estaDesbloqueado);
    }
}
