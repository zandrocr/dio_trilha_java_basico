package gov.escola.maria;

public class SistemaIbge {
public static void main(String[] args) {
	for(EstadosBrasileiros e: EstadosBrasileiros.values()) {
		System.out.printf("O estado %s tem a sigla: %s\n",e.getNome(),e.getSigla());
	}
	
	EstadosBrasileiros ufSelecionado = EstadosBrasileiros.PIAUI;
	
	System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
	
}
}
