import loja.*;

public class App {
    public static void main(String[] args) {
        try {
            Produto produtoValido = new Produto("Notebook", 2500.00);
            System.out.println("Produto criado: " + produtoValido.getNome() + ", Preço: R$" + produtoValido.getPreco());

            Produto produtoNomeInvalido = new Produto("Celular", 3000.00);  
            System.out.println("Produto criado: " + produtoNomeInvalido.getNome() + ", Preço: R$" + produtoNomeInvalido.getPreco());

        } catch (NomeInvalidoException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        } catch (ValorInvalidoException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        }

        try {
            Produto produtoPrecoInvalido = new Produto("TV", -100.00);  
            System.out.println("Produto criado: " + produtoPrecoInvalido.getNome() + ", Preço: R$" + produtoPrecoInvalido.getPreco());

        } catch (NomeInvalidoException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        } catch (ValorInvalidoException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        }
    }
}