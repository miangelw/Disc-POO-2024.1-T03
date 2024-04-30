package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor antigo do produto: ");
		double valorantigo = sc.nextDouble();
		System.out.println("Digite o valor antigo do produto: ");
		double valornovo = sc.nextDouble();
		System.out.println(percAumento(valorantigo, valornovo) + "%");

	}
	public static double percAumento(double valorantigo, double valornovo) {
		double aumento = ((100*valornovo) - (100*valorantigo))/valorantigo;
		return aumento;
	}
}
