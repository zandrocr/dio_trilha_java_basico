package com.carro;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("65691");
//		jeep.ligar();
		
		Moto fazer = new Moto();
		fazer.setChassi("22566");
//		fazer.ligar();
		
		Veiculo corringa = jeep;
		
		corringa.ligar();
	}
}