public class App {
    public static void main(String[] args) throws Exception {

        Celular celular1 = new Celular();

        System.out.println("Celular");
        celular1.cor = "preto";
        celular1.tamanho = "medio";
        celular1.estaLigado = false;
        celular1.estaDesbloqueado = false;

        celular1.ligadoOuDesligadoCelular();
        celular1.iniciar();
        celular1.colocarParaCarregar();
        celular1.imprimirAtributosCelular();
        System.out.println();



        Tv tv1 = new Tv();
        System.out.println("Tv");
        tv1.cor = "preto";
        tv1.tamanho = "medio";
        tv1.marca = "Sansung";
        tv1.estaLigado = true;
        tv1.estaNatomada= true;

        tv1.ligadoOuDesligadoTv();
        tv1.iniciar();
        tv1.imprimirAtributosTv();
        System.out.println();



        Ventilador ventilador1 = new Ventilador();

        System.out.println("Ventilador");
        ventilador1.marca = "mundial";
        ventilador1.tipo = "Ventilador de Teto";
        ventilador1.estaLigado = true;
        ventilador1.estaNatomada= true;

        ventilador1.ligadoOuDesligadoVentilador();
        ventilador1.iniciar();
        ventilador1.imprimirAtributosTv();




    }
}
