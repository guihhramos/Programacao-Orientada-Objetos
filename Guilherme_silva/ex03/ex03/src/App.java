import java.util.Scanner;

public class App {
   private static Scanner SCAN = new Scanner(System.in);
   
    public static void main(String[] args) throws Exception {
        validarLogin();
    }

    public static void validarLogin(){
        System.out.println("Usuario");
        String usuario = SCAN.nextLine();

        System.out.println("Usuario");
        String senha = SCAN.nextLine();

        if(usuario.equals("admin") && senha.equals("123senha")) {
            System.out.println("Login realizado com sucesso!");
        }
        else{
            System.out.println("Falha no login");
        }
    }
}
