package gov.escola.maria;


public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno("Felipe",8,"masculino","425.545-56");
		felipe.setEndereco("Rua rua");
		Aluno maria = new Aluno("Maria",10,"feminino","755.553-56");
		maria.setEndereco("Rua nova");
				
		System.out.printf("O aluno %s do sexo %s, tem %s anos e mora na %s.\n", felipe.getNome(), felipe.getSexo(), felipe.getIdade(), felipe.getEndereco());	
		System.out.printf("A aluno %s do sexo %s, tem %s anos e mora na %s.\n", maria.getNome(), maria.getSexo(), maria.getIdade(), maria.getEndereco());	
	}}
