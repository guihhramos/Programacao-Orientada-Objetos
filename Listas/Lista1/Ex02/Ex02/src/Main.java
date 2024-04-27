import java.util.*;

public class Main{
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int TAMANHO_MATRIZ = 4;
    private static boolean[][] mapa = new boolean[TAMANHO_MATRIZ][TAMANHO_MATRIZ];
    public static void main(String[] args){
        preencherVetor();

        int linhaB = Integer.parseInt(SCAN.nextLine());
        int colunaA = Integer.parseInt(SCAN.nextLine());

        marcarTrue(linhaB, colunaA);
        imprimirMapa();
    }

    public static void preencherVetor(){
        for(int i = 0; i < TAMANHO_MATRIZ; i++){
            for(int j = 0; j < TAMANHO_MATRIZ; j++){
                mapa[i][j] = false;
            }
        }
    }

    public static void marcarTrue(int linha, int coluna){
        mapa[linha][coluna] = true;
    }

    public static void imprimirMapa(){
        for(int i = 0; i < TAMANHO_MATRIZ; i++){
            System.out.print("|");
            for(int j = 0; j < TAMANHO_MATRIZ; j++){
                if(mapa[i][j]){
                    System.out.print("X|");
                } else{
                    System.out.print("O|");
                }
            }
            System.out.println();
        }
    }
}