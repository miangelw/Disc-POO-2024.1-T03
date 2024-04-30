package br.edu.principal;

public class principal {
    public static double calcularS(int N) {
        double S = 1.0;

        double fatorial = 1.0; 
        for (int i = 1; i <= N; i++) {
            fatorial *= i;
            S += 1.0 / fatorial;
        }

        return S;
    }

    public static void main(String[] args) {
        int N = 5; 
        double resultado = calcularS(N);
        System.out.println("O valor de S é: " + resultado);
    }
}

