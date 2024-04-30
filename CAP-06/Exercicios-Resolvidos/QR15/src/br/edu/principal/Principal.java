package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[10];
		int div[] = new int [5];
		boolean divisivel = false;
		
		for(int i=0;i<10;i++) {
			System.out.println("Digite o valor do número na posição "+ (i+1));
			numeros[i] = sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.println("Digite o valor do divisor na posição "+ (i+1));
			div[i] = sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			divisivel=false;
			System.out.println("\nNúmero "+numeros[i]+"\n");
			for(int j=0;j<5;j++) {
				if(numeros[i]%div[j]==0) {
					divisivel= true;
					System.out.println("Divisível por "+div[j]+" na posição "+(j+1));
				}
			}
			if(divisivel ==false) {
				System.out.println("Não possui divisores no segundo vetor");
			}
		}
	}
}
