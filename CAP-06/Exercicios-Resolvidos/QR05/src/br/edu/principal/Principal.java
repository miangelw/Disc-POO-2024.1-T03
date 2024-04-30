package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[] x = new int[10];
		int[] y = new int[10];
		int[] u = new int[20];
		int[] d = new int[10];
		int[] s = new int[10];
		int[] p = new int[10];
		int[] it = new int[10];
		int i,j,k,cont_u =0,cont_d =0,cont_i =1;
		Scanner sc = new Scanner(System.in);
		
		for (i =0; i<10;i++) {
			System.out.println("Digite valor para o vetor X: ");
			x[i] = sc.nextInt();
			System.out.println("Digite valor para o vetor Y: ");
			y[i] = sc.nextInt();
		}
		
		for (i = 0; i < 10; i++) {
		    j = 0;
		    while (j < cont_u && x[i] != u[j]) {
		        j++;
		    }
		    
		    if (j >= cont_u) {
		        u[cont_u] = x[i];
		        cont_u++;
		    }
		}

		for (i = 0; i < 10; i++) {
		    j = 0;
		    while (j < cont_u && y[i] != u[j]) {
		        j++;
		    }
		    
		    if (j >= cont_u) {
		        u[cont_u] = y[i];
		        cont_u++;
		    }
		}
		System.out.println("Vetor união:");
		for (i = 1; i <= (cont_u -1); i++) {
			System.out.println("Na posição " + (i-1) + " o número é: " + u[i-1]);
		}
		
		for (i = 0; i < 10; i++) {
		    j = 0;
		    while (x[i] != y[j] && j < 9) {
		        j++;
		    }
		    
		    if (j >= 10) {
		        k = 0;
		        while (k < cont_d && x[i] != d[k]) {
		            k++;
		        }
				
				if (k>=cont_d) {
					d[cont_d] = x[i];
					cont_d++;
				}
			}
		}
		System.out.println("Vetor diferença:");
		for (i = 1; i <= (cont_d -1); i++) {
			System.out.println("Na posição " + (i-1) + " o número é: " + d[i-1]);
		}
		
		for (i = 0; i < 10; i++) {
			s[i] = x[i] + y[i];
			p[i] = x[i] * y[i];
		}
		System.out.println("Vetor soma:");
		for (i = 0; i < 10; i++) {
			System.out.println("Na posição " + (i) + " o número é: " + s[i]);
		}
		System.out.println("Vetor produto:");
		for (i = 0; i < 10; i++) {
			System.out.println("Na posição " + (i) + " o número é: " + p[i]);
		}
		
		for (i = 1; i <= 10; i++) {
			j =1;
			
			while (j <= 10 && x[i-1] != y[j-1]) {
				j++;
			}
			
			if (j <= 10) {
				k =1;
				while( k < cont_i && it[k-1] != x[i-1]) {
					k++;
				}
				
				if (k >= cont_i) {
					it[cont_i-1] = x[i-1];
					cont_i++;
				}
			}
		}
		
		System.out.println("Vetor interseção:");
		for (i = 1; i <= (cont_i -1); i++) {
			System.out.println("Na posição " + (i-1) + " o número é: " + it[i-1]);
		}
	}
}