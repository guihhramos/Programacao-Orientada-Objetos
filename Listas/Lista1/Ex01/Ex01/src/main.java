import java.util.*;

public class main {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int TAMANHO_LISTA = 10;
  
    private static int[] vetor = new int[TAMANHO_LISTA];
  
    public static void main(String[] args) {
        preencherLista();
      
        int numero = Integer.parseInt(SCAN.nextLine());
      
        boolean encontrado = buscarNaLista(numero);
      
        if(encontrado){
            System.out.println("ACHEI");
        } else{
            System.out.printf("NAO ACHEI");
        }
    }
  
    public static void preencherLista(){
        for(int i = 0; i < TAMANHO_LISTA; i++){
            vetor[i] = Integer.parseInt(SCAN.nextLine());
        }
    }
    
    public static boolean buscarNaLista(int numero){
        for(int i = 0; i < TAMANHO_LISTA; i++){
            if(vetor[i] == numero){
            return true;
            }
        }
      return false;
    }
}