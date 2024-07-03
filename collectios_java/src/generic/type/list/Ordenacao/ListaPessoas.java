package generic.type.list.Ordenacao;

import java.util.*;

public class ListaPessoas {
    private List<Pessoa> pessoaList;

    public ListaPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoIdade(){
        List<Pessoa> pessoasIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}

