public class Ventilador {
    String marca;
    String tipo;
    boolean estaLigado;
    boolean estaNatomada;

    public void ligadoOuDesligadoVentilador() {
        if (estaLigado){
            System.out.println("Desligado...");
            estaNatomada = true;
        }else{
            System.out.println("Ligado...");
            estaNatomada = false;
        }
    }

    public void iniciar() {
        if(!estaLigado) {
            System.out.println("(Tomando um refresco...)");
        } else if (estaNatomada) {
            System.out.println("Que frio, nao vou ligar o ventilador");
        }
    }

    public void imprimirAtributosTv() {
        System.out.println("marca do ventilador: " + marca);
        System.out.println("tipo do ventilador: " + tipo);
        System.out.println("esta ligado?: " + estaLigado);
        System.out.println("esta na tomada?: " + estaNatomada) ;
    }
}
