package aula03;

import java.util.Scanner;

public class Exerc01 {
	
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		

		int n, rest;
		
		for(int i = 0; i <= 10; i ++) {
		System.out.println("\nDigite um inteiro numero:");
		n = read.nextInt();
		rest = (n % 2);
		
		if(rest == 0) {
		System.out.println("\nO numero " + n + " é par");
		
		}else {
			System.out.println("O numero " + n + " é impar");
			}
		
		}
	}
}
