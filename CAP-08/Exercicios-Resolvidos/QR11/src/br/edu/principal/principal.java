package br.edu.principal;

import java.util.Scanner;

public class principal {
    static final int NUM_HABITANTES = 5;

    public static void lerDados(char[] sexo, char[] corOlhos, char[] corCabelos, int[] idade) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < NUM_HABITANTES; i++) {
            System.out.println("Habitante " + (i + 1) + ":");
            System.out.print("Sexo (M/F): ");
            sexo[i] = sc.next().charAt(0);
            System.out.print("Cor dos olhos (A/C): ");
            corOlhos[i] = sc.next().charAt(0);
            System.out.print("Cor dos cabelos (L/P/C): ");
            corCabelos[i] = sc.next().charAt(0);
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }
        sc.close();
    }

    public static double calcularMediaIdadeOlhosCastanhosCabelosPretos(char[] corOlhos, char[] corCabelos, int[] idade) {
        int totalIdade = 0;
        int count = 0;
        for (int i = 0; i < NUM_HABITANTES; i++) {
            if (corOlhos[i] == 'C' && corCabelos[i] == 'P') {
                totalIdade += idade[i];
                count++;
            }
        }
        return count > 0 ? (double) totalIdade / count : 0;
    }

    // Sub-rotina para encontrar a maior idade entre os habitantes
    public static int encontrarMaiorIdade(int[] idade) {
        int maiorIdade = idade[0];
        for (int i = 1; i < NUM_HABITANTES; i++) {
            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
            }
        }
        return maiorIdade;
    }

    public static int contarMulheresIdadeOlhosAzuisCabelosLouros(char[] sexo, char[] corOlhos, char[] corCabelos, int[] idade) {
        int count = 0;
        for (int i = 0; i < NUM_HABITANTES; i++) {
            if (sexo[i] == 'F' && idade[i] >= 18 && idade[i] <= 35 && corOlhos[i] == 'A' && corCabelos[i] == 'L') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[] sexo = new char[NUM_HABITANTES];
        char[] corOlhos = new char[NUM_HABITANTES];
        char[] corCabelos = new char[NUM_HABITANTES];
        int[] idade = new int[NUM_HABITANTES];

        lerDados(sexo, corOlhos, corCabelos, idade);

        double mediaIdadeOlhosCastanhosCabelosPretos = calcularMediaIdadeOlhosCastanhosCabelosPretos(corOlhos, corCabelos, idade);
        System.out.println("Média de idade das pessoas com olhos castanhos e cabelos pretos: " + mediaIdadeOlhosCastanhosCabelosPretos);

        int maiorIdade = encontrarMaiorIdade(idade);
        System.out.println("Maior idade entre os habitantes: " + maiorIdade);

        int mulheresIdadeOlhosAzuisCabelosLouros = contarMulheresIdadeOlhosAzuisCabelosLouros(sexo, corOlhos, corCabelos, idade);
        System.out.println("Quantidade de mulheres entre 18 e 35 anos, com olhos azuis e cabelos louros: " + mulheresIdadeOlhosAzuisCabelosLouros);
    }
}
