package br.edu.principal;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Insira a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Insira a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Insira a letra (A ou P): ");
        char letra = sc.next().toUpperCase().charAt(0);

        double media = calculaMedia(nota1, nota2, nota3, letra);

        System.out.printf("A média do aluno é: %.2f\n", media);
    }

    public static double calculaMedia(double nota1, double nota2, double nota3, char letra) {
        if (letra == 'A') {
            return (nota1 + nota2 + nota3) / 3;
        } else if (letra == 'P') {
            return (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;
        } else {
            System.out.println("Letra inválida. A média não será calculada.");
            return 0;
        }
    }
}

