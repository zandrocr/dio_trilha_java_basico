package generic.type.map.pesquisa;

public class Produto {
    private String nome;
    private int quantidede;
    private  double preco;

    public Produto(String nome, int quantidede, double preco) {
        this.nome = nome;
        this.quantidede = quantidede;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidede() {
        return quantidede;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "EstoqueProdutos{" +
                ", nome='" + nome + '\'' +
                ", quantidede=" + quantidede +
                ", preco=" + preco +
                '}';
    }
}
