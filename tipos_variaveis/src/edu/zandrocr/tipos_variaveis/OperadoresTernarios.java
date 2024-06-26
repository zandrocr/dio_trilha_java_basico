package edu.zandrocr.tipos_variaveis;

public class OperadoresTernarios {
	public static void main(String[] args) {
		double sum = 10.5 + 23.3;
		int sub = 32 - 123;
		int mult = 3 * 2;
		int div = 452 / 23;
		int mod = 29 % 2;
		double result = (10 * 4) + (42 / 2);

		print(sum, sub, mult, div, mod, result);
		clas(args);
		concatenacao(args);
	}

	public static void print(double sum, int sub, int mult, int div, int mod, double result) {
		System.out.printf("Soma %s, Subtração %s, Multiplicação %s, Divisão %s, Modulo %s, resultado %s\n", sum, sub,
				mult, div, mod, result);
	}
	
	public static void clas(String[] args) {
		String one = "Liguagem";
		String two = "Java";
		
		System.out.printf("%s %s\n", one, two);
	}
	
	public static void concatenacao(String[] args) {
		String conc = "?";
		
		conc = 1+1+1+"1";
		System.out.printf("%s\n",conc);
		
		conc = 1+"1"+1+1;
		System.out.printf("%s\n",conc);
		
		conc = 1+"1"+1+"1";
		System.out.printf("%s\n",conc);
		
		conc = "1"+1+1+1;
		System.out.printf("%s\n",conc);
		
		conc = "1"+(1+1+1);
		System.out.printf("%s\n",conc);
		
	}

}
