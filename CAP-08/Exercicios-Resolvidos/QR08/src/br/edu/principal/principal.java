package br.edu.principal;

public class principal {
    public static int calcularDuracao(int horaInicio, int minutoInicio, int horaTermino, int minutoTermino) {
        int inicioEmMinutos = horaInicio * 60 + minutoInicio;
        int terminoEmMinutos = horaTermino * 60 + minutoTermino;
        if (terminoEmMinutos < inicioEmMinutos) {
            terminoEmMinutos += 24 * 60;
        }

        int duracao = terminoEmMinutos - inicioEmMinutos;
        return duracao;
    }

    public static void main(String[] args) {
        int horaInicio = 20;
        int minutoInicio = 30;
        int horaTermino = 2;
        int minutoTermino = 45;

        int duracaoEmMinutos = calcularDuracao(horaInicio, minutoInicio, horaTermino, minutoTermino);
        System.out.println("A duração do jogo é de " + duracaoEmMinutos + " minutos.");
    }
}