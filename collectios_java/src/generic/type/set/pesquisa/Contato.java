package generic.type.set.pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contatos)) return false;
        return Objects.equals(nome, contatos.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
