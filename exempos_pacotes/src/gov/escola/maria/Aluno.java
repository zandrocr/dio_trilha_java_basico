package gov.escola.maria;


public class Aluno {
	private String nome;
	private int idade;
	private String sexo;
	private String cpf;
	private String endereco;	
		
	public Aluno(String nome, int idade, String sexo, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public String getCpf() {
		return cpf;
	}
		
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
