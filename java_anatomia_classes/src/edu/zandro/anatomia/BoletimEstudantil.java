package edu.zandro.anatomia;

public class BoletimEstudantil {
	public static void main(String[] args) {
		int mediaFinal = 6;
		
		if(mediaFinal < 6) {
			System.out.println("REPROVADO");
		}else if (mediaFinal == 6) {
			System.out.println("MÉDIA");
		}else {
			System.out.println("APROVADO");
		}
	}
}