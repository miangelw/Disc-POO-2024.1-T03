package br.edu.principal;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Entre com um inteiro de 1 a 9 (0 para sair): ");
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            } else if (n < 1 || n > 9) {
                System.out.println("Número inválido. Entre novamente.");
                continue;
            }

            mostrarTabelaMultiplicacao(n);
        }

        scanner.close();
    }

    static void mostrarTabelaMultiplicacao(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
