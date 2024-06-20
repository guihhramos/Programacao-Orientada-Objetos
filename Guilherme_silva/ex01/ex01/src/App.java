import java.util.Scanner;

public class App {
    private static Scanner SCAN = new Scanner(System.in);
    public static final int VALOR_MULTIPLICADO = 11;

    public static void main(String[] args) {
      int numero = Integer.parseInt(SCAN.nextLine());
        for (int i = 0; i < VALOR_MULTIPLICADO; i++) {
            
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
