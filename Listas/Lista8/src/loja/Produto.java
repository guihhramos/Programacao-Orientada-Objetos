package loja;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) throws NomeInvalidoException, ValorInvalidoException {
        if (nome == null || nome.length() < 3) {
            throw new NomeInvalidoException("Nome do produto inválido");
        }
        if (preco <= 0) {
            throw new ValorInvalidoException("Preço do produto inválido");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
