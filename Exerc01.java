package aula03;

import java.util.Scanner;

public class Exerc01 {
	
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		

		int n1, n2;
		
		System.out.println("\nDigite um numero inteiro:");
		n1 = read.nextInt();
		
		System.out.println("\nDigite segundo numero inteiro:");
		n2 = read.nextInt();
		
		if(n1 > n2) {
			for(; n1 > n2; n1 = 0) {
				System.out.println("Intervalo digitado é invalido! Por favor digite"
				+ "novamente. O primeiro numero deve ser menor que segundo numero digitado:");
				
			}
			for(int cont = n1; cont <= n2; cont ++) {
				if(cont % 3 == 0 && cont % 5 == 0)
					System.out.println(cont + "é multiplo de 5 e 3");
			}
		}
		
	}
}
