package estabelecimento.lojas;

import estabelecimento.equipamento.Equipamento;
import estabelecimento.equipamento.copiadora.Copiadora;
import estabelecimento.equipamento.digitalizadora.Digitalizadora;
import estabelecimento.equipamento.impressora.Deskjet;
import estabelecimento.equipamento.impressora.Impressora;

public class Fabrica {
	public static void main(String[] args) {
		Equipamento equipamento = new Equipamento();
		Impressora impressora = equipamento;
		Digitalizadora digitalizadora = equipamento;
		Copiadora copiadora = equipamento;
		
		impressora.imprimindo();
		digitalizadora.digitalizar();
		copiadora.copiando();
	}
}
