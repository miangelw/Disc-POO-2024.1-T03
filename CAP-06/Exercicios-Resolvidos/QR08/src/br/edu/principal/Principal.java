package br.edu.principal;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[5];
		int y[] = new int[5];
		int r[] = new int[10];
		
		int i, j, aux;
		
		for(i=0;i<5;i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor x. ");
			x[i] = sc.nextInt();
			
		}
		
		Arrays.sort(x);
		
		
		for(i=0;i<5;i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor y. ");
			y[i] = sc.nextInt();
		}
		
		Arrays.sort(y);
		
		for (i=0;i<5;i++) {
			r[i] = x[i];
			r[i+5] = y[i];
		}
		
		Arrays.sort(r);
		
		System.out.print("O vetor x em ordem crescente é: ");
		for(i=0;i<5;i++) {
			System.out.print(x[i]+" ");
		}
		
		System.out.println("");
		
		System.out.print("O vetor y em ordem crescente é: ");
		for(i=0;i<5;i++) {
			System.out.print(y[i]+" ");
		}
		
		System.out.println("");
		
		System.out.print("O vetor resultante em ordem crescente é: ");
		for(i=0;i<10;i++) {
			System.out.print(r[i]+" ");
		}
	}
}