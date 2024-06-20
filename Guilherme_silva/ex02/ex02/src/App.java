import java.util.*;

public class App {
    static Scanner SCAN = new Scanner(System.in);
    
    public static void main(String[] args)  {
        ehpar();
    }

    public static void ehpar(){
        int numero = Integer.parseInt(SCAN.nextLine());
        
        if(numero % 2 == 0){
            System.out.println("eh par");
        }
        else{
            System.out.println("nao eh par");
        }
    }
}
