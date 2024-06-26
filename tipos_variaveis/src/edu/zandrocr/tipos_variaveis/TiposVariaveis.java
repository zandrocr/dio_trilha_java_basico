package edu.zandrocr.tipos_variaveis;

import java.util.Date;

public class TiposVariaveis {
	public static void main(String[] args) {
		byte age = 53;
		short year = 1984;
		int quantity = 2;
		long population = 52123655442L; // para o compilador não confundir com o tipo int
		final float PI = 3.13f; // para o compilador não confundir com o tipo double
		double salary = 2542.32;
		String name = "Rafa";
		Date date = new Date();

		name(name, age, year, quantity, population, salary, PI, date);
	}

	public static void name(String name, byte age, short year, int quantity, long population, double salary, float pi, Date date) {
		System.out.printf(
				"Ola %s, você tem %s anos nascida em %s, tem %s filhos, mora em um pais com %s de pessoas e ganha %s, %s das pessoas ganham esse valor hoje na data %s"
				, name, age, year, quantity, population, salary, pi, date);
	}
}