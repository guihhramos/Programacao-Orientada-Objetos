import java.util.Scanner;

public class Main {
    private static int NUMERO_PERGUNTAS = 3;
    private static String[] RESPOSTAS = new String[NUMERO_PERGUNTAS];
    private static String[] GABARITO = new String[NUMERO_PERGUNTAS];
    private static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        String nomeParticipante = receberNomeParticipante();
        comecarQuiz(nomeParticipante);
        pergunta01(nomeParticipante);
        pergunta02(nomeParticipante);
        pergunta03(nomeParticipante);
        apresentarResultado(nomeParticipante);
        encerrar();
    }

    public static String receberNomeParticipante(){
        System.out.println(
            """
            VAMOS COMEÇAR!
            Digite seu nome:
            """
        );

        return formatarNome(SCAN.nextLine());
    }

    public static String formatarNome(String nome){
        if (nome.isBlank()) {
            return "NPC";
        }

        nome = nome.trim();
        String[] nomeCompleto = nome.split(" ");
        String primeiroNome = nomeCompleto[0];
        String primeiraLetraDoNome = String.valueOf(primeiroNome.charAt(0));
        String primeiroNomeSemInicial = primeiroNome.substring(1);
        String nomeFormatado = primeiraLetraDoNome.toUpperCase() + primeiroNomeSemInicial.toLowerCase();
        return nomeFormatado;
    }

    public static void comecarQuiz(String nomeParticipante){
        System.out.println(String.format(
            """
            
            Vamos começar %s!!
            Mas antes, preciso te explicar uma coisa.
            Se a letra da alternativa enviada for diferente das disponiveis, também sera considerado errado.

            Aperte ENTER para começar.
            """,
            nomeParticipante
        ));

        SCAN.nextLine();
    }

    public static void pergunta01(String nome) {
        String resposta1 = "";

        do{
            System.out.println(
                """
                [1] - Qual desses jogadores foi ídolo no time neerlandês Ajax Amsterdam?
                    
                A - Lewandowski
                B - Antonny
                C - Cristiano Ronaldo
                D - Mbappé

                """
            );
            
            resposta1 = SCAN.nextLine();

        }while(!ehUmaRespostaValida(resposta1));

        GABARITO[0]  = "B";
        RESPOSTAS[0]  = resposta1;
    }
    public static void pergunta02(String nome) {
        String resposta2 = "";

        do{
            System.out.println(
                """
                [2] - Quando o monstro ney jogava pelo barça, qual era o numero da camisa dele?

                A - Camisa 13
                B - Camisa 9
                C - Camisa 10
                D - Camisa 11

                """
            );
            
            resposta2 = SCAN.nextLine();

        }while(!ehUmaRespostaValida(resposta2));

        GABARITO[1]  = "D";
        RESPOSTAS[1]  = resposta2;
    }

    public static void pergunta03(String nome) {
        String resposta3 = "";

        do{
            System.out.println(
                """
                [3] - Qual ano a seleção brasileira ganhou a primeira copa do mundo
                    
                A - 2022
                B - 1962
                C - 1994
                D - 1958

                """
            );
            
            resposta3 = SCAN.nextLine();

        }while(!ehUmaRespostaValida(resposta3));

        GABARITO[2]  = "D";
        RESPOSTAS[2]  = resposta3;
    }


    public static boolean ehUmaRespostaValida(String resposta){
        if (resposta.isBlank()) {
            System.out.println(
                """
                Sua resposta não pode ser vazia.
                Vamos enviar a pergunta nomente.

                """
            );
            return false;
        }

        return true; 
    }

    public static void apresentarResultado(String nomeParticipante){
        System.out.println(String.format(
            """

            %s, vamos ver se você é um GAMER mesmo.
            Veja quais perguntas você acertou:

            """,
            nomeParticipante
        ));

        for (int i = 0; i < NUMERO_PERGUNTAS; i++){
            System.out.println(String.format(
                "%s - %s",
                (i + 1),
                RESPOSTAS[i].equalsIgnoreCase(GABARITO[i]) ? "ACERTOU" : "ERROU"
            ));
        }
    }

    public static void encerrar(){
        System.out.println(String.format(
            """
            Obrigado por jogar!
            Agora aperte ENTER para encerrar o jogo..."""));
        SCAN.nextLine();
    }
}
