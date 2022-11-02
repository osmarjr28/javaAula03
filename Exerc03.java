package aula03;

import java.util.Scanner;

public class Exerc03 {
	
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		
		int v[] = new int[10];
		int couple = 0, unequaled = 0;
		
		for(int i = 0; i < v.length; i++) {
			System.out.println("Digite o " + (i + 1) + " valor: ");
			v[i] = read.nextInt();
			
			if(v[i] % 2 == 0) {
				couple ++;
				
			}else {
				unequaled ++;
		}
		
		}
		System.out.println("Total de par (pares) = " + couple);
		System.out.println("Total de impar (impares) = " + unequaled);
	}

}
