package aula03;

import java.util.Scanner;

public class Exerc02 {

	public static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n1 = 0, smaller = 0, bigger = 0;
		
		while(n1 >= 0) {
			System.out.println("\nDigite sua idade:");
			n1 = read.nextInt();
			
			if(n1 > 0 && n1 < 21) {
				smaller ++;
			}
			
			if(n1 > 50) {
				bigger ++;
			}
		}
		System.out.println("Pessoas menores de 21 anos, total:");
		System.out.println("Pessoas maiores de 50 anos, total:");
	}
}



