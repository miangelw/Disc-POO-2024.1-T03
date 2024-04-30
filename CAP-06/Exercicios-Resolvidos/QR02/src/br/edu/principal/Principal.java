package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd[] = new int[10];
		double preco[] = new double[10];
		
		int i, ind;
		double tot_geral, tot_vend, comissao, maior;
		tot_geral = 0;
		
		for(i=0;i<10;i++) {
			System.out.println("Digite a quantidade de vendas do produto ");
			qtd[i] = sc.nextInt();
			System.out.println("Digite o preço que o produto foi vendido ");
			preco[i] = sc.nextDouble();
		}
		
		for(i=0;i<10;i++) {
			tot_vend = qtd[i] * preco[i];
			System.out.println("O produto "+(i+1)+" foi vendido "+qtd[i]+" vezes por R$"+preco[i]+", totalizando R$"+tot_vend);
			tot_geral = tot_geral + tot_vend;
		}
		
		comissao = (tot_geral/100)*5;
		
		System.out.println("O total de vendas foi de R$"+tot_geral+" e a comissão do vendedor foi de R$"+comissao);
	
		maior = qtd[1];
		ind = 1;
		
		for(i=1;i<10;i++) {
			if (qtd[i] > maior) {
				maior = qtd[i];
				ind = i;
			}
		}
		
		System.out.println("O preço do produto mais vendido é de R$"+preco[ind]+" e sua posição no vetor é: "+ind);
		
	}

}
