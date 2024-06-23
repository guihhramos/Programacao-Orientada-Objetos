public class App {
    public static void main(String[] args) throws Exception {
        // Caixa<String> caixa = new Caixa<>("Sapatos");
        // Caixa<interger> caixa2 = new Caixa<>(40);
        
        // System.out.println(caixa.getConteudo());
       //  System.out.println(caixa2.getConteudo());
        //               ᐱ
        //               |   
        //               |
        // Exercicio ----|
        
        List<String> numeros = new ArrayList<>(List.of("10", "20", "30", "40", "50"));
        numeros.add("15");
        numeros.add("25");
        numeros.add("35");

        numeros.remove("15");

        numeros.set(0, "100");

        for (String numero : numeros) {
            System.out.println(numeros);
        }

        System.out.println(numeros.contains("100"));
        //                 ᐱ
        //                 |   
        //                 |
        // Exercicio 2 ----|
    }
}
