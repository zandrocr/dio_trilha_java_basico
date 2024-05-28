package estabelecimento.equipamento;

import estabelecimento.equipamento.copiadora.Copiadora;
import estabelecimento.equipamento.digitalizadora.Digitalizadora;
import estabelecimento.equipamento.impressora.Impressora;

public class Equipamento implements Copiadora, Digitalizadora, Impressora {
	@Override
	public void imprimindo() {
		System.out.println("Copiando via multifuncional");		
	}

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando multifuncional");
	}

	@Override
	public void copiando() {
		System.out.println("Copiando multifuncional");		
	}
}
