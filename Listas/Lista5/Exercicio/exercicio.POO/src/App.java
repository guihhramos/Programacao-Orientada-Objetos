import java.util.ArrayList;

import loja.Loja;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {
       Produto produto1 = new Produto("Nike Polo", 199.99, 001);
       Produto produto2 = new Produto("Adidas Polo", 159.99, 002);

       ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        Loja loja = new Loja("Minha Loja", listaProdutos);

        System.out.println("Nome da Loja: " + loja.getNome());
        System.out.println("Produtos disponíveis:");

        for (Produto produto : loja.getProdutos()) {
            System.out.println(" - " + produto.getNome() + " | Preço: R$" + produto.getPreco() + " | Código: " + produto.getCodigo());
        }
    }
}