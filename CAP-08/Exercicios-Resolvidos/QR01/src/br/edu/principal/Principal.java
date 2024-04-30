package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();
		int resultado = verificar(num);
		System.out.println(resultado);

	}
	public static int verificar(int num) {
		if (num >=0) {
			return 1;
		}else {
			return 0;
		}
	}

}
