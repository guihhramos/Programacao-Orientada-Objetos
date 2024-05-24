package loja;

import java.util.ArrayList;
import java.util.List;

    public class Loja {
    private String nome;
    private ArrayList<Produto> produtos;

    public Loja(String nome, ArrayList<Produto> produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
  }
