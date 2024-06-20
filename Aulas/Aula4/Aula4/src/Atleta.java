public class Atleta {
    String nome;
    Int idade;
    double peso;
    double altura;
    char genero;
    int velocidade;

    public void darSoco(){
        System.out.println("PORRADAOO");

    }

    public void correr(){
        if (velocidade > 5) {
            System.out.println("Correu de mais!");
        }else{
            System.out.println("Andou!");

        }
    }
    
    public void imprimirDetalhes(){
    System.out.println(nome);
    System.out.println(idade);
    System.out.println(posicao);
    }

}

