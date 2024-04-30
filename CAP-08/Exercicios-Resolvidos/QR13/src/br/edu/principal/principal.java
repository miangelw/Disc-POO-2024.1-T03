package br.edu.principal;

public class principal {
    
    public static int calcularFatorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calcularFatorial(num - 1);
        }
    }
    
    public static int[] calcularFatorialVetor(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = calcularFatorial(A[i]);
        }
        return B;
    }
    
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int[] vetorB = calcularFatorialVetor(vetorA);
        
        System.out.println("Vetor B contendo os fatoriais de A:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Elemento " + (i+1) + ": " + vetorB[i]);
        }
    }
}
