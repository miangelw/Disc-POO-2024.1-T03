package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String carros [] = new String[5];
		double consumo [] = new double[5];
		String menorvei = "";
		double menorconsumo = 0;
		double valor = 0;
		
		for(int i = 0; i<5; i++) {
			System.out.println("Digite o modelo do carro " + (i+1) + ":");
			carros[i] = sc.next();
			System.out.println("Digite o consumo do carro " + (i+1) + ":");
			consumo[i] = sc.nextDouble();
		}
		
		
		menorconsumo = consumo[0];
		
		for(int i = 1; i<5; i++) {
			if(consumo[i] > menorconsumo) {
				menorconsumo = consumo[i];
				menorvei = carros[i];
			}else {
				continue;
			}
		}
		System.out.println("O carro mais econômico é o "+menorvei);
		for(int i = 0; i<5; i++) {
			valor = 1000/consumo[i];
			System.out.println("O carro "+carros[i]+ 
			" consome "+valor+" litros de combustível para percorrer uma distância de 1000 km.");		
		}
	}
}


