package generic.type.map.pesquisa;

public class Produto {
    private long cod;
    private String nome;
    private int quantidede;
    private  double preco;

    public Produto(long cod, String nome, int quantidede) {
        this.cod = cod;
        this.nome = nome;
        this.quantidede = quantidede;
        this.preco = preco;
    }

    public long getCod() {
        return cod;
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
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", quantidede=" + quantidede +
                ", preco=" + preco +
                '}';
    }
}
