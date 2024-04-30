package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println(somar(num1,num2));
		
	}
	
	public static int somar(int num1, int num2) {
		int soma = 0;
		for(int i = num1; i<=num2;i++) {
			soma = soma + i;
		}
		return soma;
	}
}
