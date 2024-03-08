package atividadeArray;

import java.util.Scanner;

public class ArrayNota {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double soma = 0;
        System.out.println("Digit as notas do bimestre: ");

        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Notas do bimestre " + (i + 1) + " : \n");
                notas[i] = input.nextDouble();
            }
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas: "+notas[i]);
        }
        for (int i = 0; i < notas.length; i++) {
            soma = (soma += notas[1]);
        }

        double media = soma / notas.length;
        System.out.println("Media: " + media);
    }
}
