package br.edu.principal;

import java.util.ArrayList;

public class principal {
    public static boolean ehPerfeito(int num) {
        int somaDivisores = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == num;
    }

    public static int[] tresPrimeirosNumerosPerfeitos() {
        ArrayList<Integer> numerosPerfeitos = new ArrayList<>();
        int num = 2; 
        while (numerosPerfeitos.size() < 3) {
            if (ehPerfeito(num)) {
                numerosPerfeitos.add(num);
            }
            num++;
        }
        int[] resultado = new int[numerosPerfeitos.size()];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = numerosPerfeitos.get(i);
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] numerosPerfeitos = tresPrimeirosNumerosPerfeitos();
        System.out.println("Os três primeiros números perfeitos são:");
        for (int numero : numerosPerfeitos) {
            System.out.println(numero);
        }
    }
}
