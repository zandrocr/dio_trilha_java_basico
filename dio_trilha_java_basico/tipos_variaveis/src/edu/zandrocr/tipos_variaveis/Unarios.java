package edu.zandrocr.tipos_variaveis;

public class Unarios {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		int num3 = -8;
		int num4 = 10;

		logic(num1);
		logic(num2);
		logic(num3*-1);
		logic(num4);
		logic(+num4);
		logic(-num4);
	}

	public static void logic(int num) {		
		if (num < 5) {
			System.out.println(++num);
		} else if(num > 5) {
			System.out.println(--num);
		}else if(num == 5) {
			System.out.printf("Ele é %s\n", num);			
		}else if(num != 5) {
			System.out.printf("Ele não é %s\n", num);					
		}
		
	}
}
