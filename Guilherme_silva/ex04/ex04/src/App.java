import java.util.Scanner;

public class App {
    private static Scanner SCAN = new Scanner(System.in);
    private static final int NUMERO_CONVIDADOS = 10;
    private static String[] nomeConvidados = new String[NUMERO_CONVIDADOS];

    public static void main(String[] args) throws Exception {
       preencherVetor();
    }

    public static void preencherVetor(){
        for (int i = 0; i < NUMERO_CONVIDADOS; i++) {
           return  SCAN.nextLine();
        }
    } 

    public static void nomeRequisitante(String Rosa){
        if(preencherVetor(NUMERO_CONVIDADOS). equals(Rosa)){
            System.out.println("Requisitante esta na lista. Seja bem vindo!");
        }
        else{
            System.out.println("Requisitante nao esta na lista!");
        }
    }
}
