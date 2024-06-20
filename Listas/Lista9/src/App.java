import java.util.Arrays;

import eventos.Show;
import eventos.StandUp;

public class App {
    public static void main(String[] args) throws Exception {
        Show show = new Show("Marcha pra Jesus", "São Paulo", "30/05/2024",
                Arrays.asList("Renascer Praise", "Isadora Pompeo", "Brunna Karla"));
        StandUp standUp = new StandUp("Stand-up Comedy", "São Paulo", "20/06/2024", "Guilherme SIlva");

        System.out.println("--- Informações do Show ---");
        show.exibirInformacoes();
        System.out.println();
        show.comecarEvento();
        show.comecarEvento(true);
        System.out.println();

        System.out.println("--- Informações do Stand-Up ---");
        standUp.exibirInformacoes();
        System.out.println();
        standUp.comecarEvento();
        standUp.comecarEvento("O único cabeleireiro da Bíblia foi? Ab(re)salão! HAHAHAHA");
        System.out.println();
    }
}
