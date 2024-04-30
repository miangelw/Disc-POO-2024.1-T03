package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor em segundos: ");
		int segundos = sc.nextInt();
		transf(segundos);

	}
	public static void transf(int segundos) {
		int h = segundos / 3600;
		int resto = segundos - (h * 3600);
		int min = resto/60;
		int secs= resto - (min*60);
		System.out.println(h+"h"+ min +"min"+ secs+"s");
	}

}
