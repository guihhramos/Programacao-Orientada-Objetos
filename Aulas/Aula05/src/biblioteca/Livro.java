public class Livro {
    private String autor;
    private String nome;
    private int anoLancamento;

    public void setAutor(String autor){
        if (autor.isBlank()) {
            this.autor = "DESCONHECIDO";
        }else{
            this.autor = autor;
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }
}