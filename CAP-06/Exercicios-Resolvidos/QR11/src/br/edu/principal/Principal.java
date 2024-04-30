package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MIN_VALUE;
		String maiormes = " ";
		String menormes = " ";
		int temp[] = new int[12];
		String mes[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		
		for(int i = 0; i < 12; i++) {
			System.out.println("Digite a temperatura média do mês de " + mes[i]+":");
			temp[i] = sc.nextInt();
			if (temp[i] > maior){
				maior = temp[i];
				maiormes = mes[i];
			}else {
				continue;
			}
		}
		menor = maior;
		for(int i = 0; i < 12; i++) {
			if(temp[i] < menor) {
				menor = temp[i];
				menormes = mes[i];
			}else {
				continue;
			}
				
				
		}
		
		System.out.println("A menor temperatura foi " + menor + " grau(s) no mês de " + menormes);
		System.out.println("A maior temperatura foi " + maior + " grau(s) no mês de " + maiormes);
	}

}
