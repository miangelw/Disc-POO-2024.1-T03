package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomes[] = new String[5];
		double salario[] = new double[5];
		int tempo [] = new int[5];
		
		for(int i =0;i<5;i++) {
			System.out.println("Digite o nome do funcionário "+(i+1)+": ");
			nomes[i] = sc.next();
			System.out.println("Digite o salário do funcionário "+ nomes[i]+":");
			salario[i] = sc.nextDouble();
			System.out.println("Digite o tempo de serviço do funcionário "+ nomes[i]+":");
			tempo[i] = sc.nextInt();	
		}
		System.out.println("Relatório 1: \n");
		for(int i =0;i<5;i++) {
			if(tempo[i]<=5 && salario[i] >=800) {
				System.out.println(nomes[i]+"\nS");
			}
		}
		System.out.println("Relatório 2: \n");
		for(int i =0;i<5;i++) {
			if (tempo[i]>5 && salario[i] <800) {
				salario[i] = salario[i] * 135/100;
				System.out.println(nomes[i]);
				System.out.println(salario[i]+"\n");
			}else if(tempo[i]>5) {
				salario[i] = salario[i] * 125/100;
				System.out.println(nomes[i]);
				System.out.println(salario[i]+"\n");
			}else if(salario[i]<800) {
				salario[i] = salario[i] * 115/100;
				System.out.println(nomes[i]);
				System.out.println(salario[i]+"\n");
			}
	
		}
	}
}

