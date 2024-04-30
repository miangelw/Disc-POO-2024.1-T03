package br.edu.principal;

public class principal {
    
    public static double[] ordenarVetor(double[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    double temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
        return vetor;
    }
    
    public static void main(String[] args) {
        double[] vetorA = {5.6, 2.3, 8.1, 1.0, 4.7};
        
        double[] vetorOrdenado = ordenarVetor(vetorA);
        
        System.out.println("Vetor Ordenado em Ordem Crescente:");
        for (int i = 0; i < vetorOrdenado.length; i++) {
            System.out.println("Elemento " + (i+1) + ": " + vetorOrdenado[i]);
        }
    }
}
