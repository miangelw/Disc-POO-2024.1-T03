package br.edu.principal;
import java.util.Scanner;

public class principal {
    public static void encontrarMaiorEMenor(int[] valores) {
        int maior = valores[0];
        int menor = valores[0];

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[5];
        System.out.println("Digite cinco valores inteiros:");

        for (int i = 0; i < 5; i++) {
            valores[i] = scanner.nextInt();
        }

        encontrarMaiorEMenor(valores);

        scanner.close();
    }
}
