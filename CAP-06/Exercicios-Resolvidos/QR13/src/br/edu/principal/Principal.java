package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		boolean achou=false;
		
		for(int i =0; i<10;i++) {
			System.out.println("Digite um número inteiro: ");
			numeros[i] = sc.nextInt();
		}
		for(int i =0; i<10;i++) {
			if(numeros[i]>50) {
				achou=true;
				System.out.println("Achou! Número " + numeros[i] + " na posição " + i);
			}
		}
		if(achou == false) {
			System.out.println("Não existem números superiores a 50 no vetor.");
		}
	}
}
