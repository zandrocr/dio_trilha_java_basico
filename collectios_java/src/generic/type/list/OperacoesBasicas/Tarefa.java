package generic.type.list.OperacoesBasicas;

public class Tarefa {
	//atributo
	private String Descricao;

	public Tarefa(String descricao) {
		super();
		Descricao = descricao;
	}

	public String getDescricao() {
		return Descricao;
	}

	@Override
	public String toString() {
		return "Tarefa [Descricao=" + Descricao + "]";
	}
	
	
}
