import java.util.Scanner;

public class  {
    private static int NUMERO_PERGUNTAS = 1;
    private static String[] RESPOSTAS = new String[NUMERO_PERGUNTAS]
    private static String[] GABARITO = new String[NUMERO_PERGUNTAS]
    private static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String nomeParticipante = receberNomeParticipante();
        comecarQuiz(nomeParticipante);
        fazerPrimeiraPergunta(nomeParticipante);
        fazerSegundaPergunta(nomeParticipante);
        fazerTerceiraPergunta(nomeParticipante);
        apresentarResultado(nomeParticipante);
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

    public static void fazerPrimeiraPergunta(String nome) {
        String resposta = "";

        do{
            System.out.println(
                """
                    Qual desses jogadores foi ídolo no time neerlandês Ajax Amsterdam?
                    
                    A - Lewandowski
                    B - Antonny
                    C - Cristiano Ronaldo
                    D - Mbappé
                """
            );
            
            resposta = SCAN.nextLine();

        }while(!ehUmaRespostaValida(resposta));

        GABARITO[0]  = "B";
        RESPOSTAS[0]  = resposta;
    }

    public static void fazerSegundaPergunta(String nome) {
        String resposta = "";

        do{
            System.out.println(
                """
                    Qual o salário atual do jogador francês Kylian Mbappé?
                    
                    A - 25 MILHÕES DE EUROS
                    B - 32 MILHÕES DE EUROS
                    C - 100 MILHÕES DE EUROS
                    D - 73 MILHÕES DE EUROS
                """
            );
            
            resposta = SCAN.nextLine();

        }while(!ehUmaRespostaValida(resposta));

        GABARITO[0]  = "D";
        RESPOSTAS[0]  = resposta;
    }

    public static void fazerTerceiraPergunta(String nome) {
        String resposta = "";

        do{
            System.out.println(
                """
                Enquanto Atuava monstruosamente pelo Barça qual era o número da Camisa do Neymar?

                A - Camisa 10
                B - Camisa 7
                C - Camisa 30
                D - Camisa 11
                """
            );
            
            resposta = SCAN.nextLine();

        }while(!ehUmaRespostaValida(resposta));

        GABARITO[0]  = "11";
        RESPOSTAS[0]  = resposta;
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
                RESPOSTAS[i].equals(GABARITO[i]) ? "ACETOU" : "ERROU"
            ));
        }
    }
}
