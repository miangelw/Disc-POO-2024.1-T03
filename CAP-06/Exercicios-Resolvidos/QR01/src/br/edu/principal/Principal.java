package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[9];
		int i,j,cont;
		
		for(i=0;i<9;i++) {
			System.out.println("Digite o número: ");
			num[i] = sc.nextInt();
		}
		for(i=0;i<9;i++) {
			cont = 0;
			for(j=1;j<=num[i];j++) {
				if(num[i]%j==0) {
					cont = cont+=1;
				}
			}
			if(cont <=2) {
				System.out.println("O numero é: "+num[i]);
				System.out.println("E a posição é: "+i);
			}
		}
		
	}

}
