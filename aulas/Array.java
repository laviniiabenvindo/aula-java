package aulas;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double soma = 0;
        System.out.println("Digit as notas do teu ano letivo");
        try (Scanner input = new Scanner(System.in)) {
            for(int i = 0; i< notas.length; i++){
                System.out.println("Notas do bimestre " + ( i + 1) + " : \n");
                notas[i] = input.nextDouble();
            }
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        for (int i = 0; i < notas.length; i++) {
           soma = (soma += notas[1]);
        }

        double media = soma / notas.length;
        System.out.println("Media: "+media);

        // notas[0] = 7.75;
        // notas[1] = 9.5;
        // notas[2] = 6.0;
        // notas[3] = 3.25;
        // notas[4] = 3.25;
        
        // for(int i=0; i<notas.length; i++){
        //     System.out.println(notas[i]);
        // }

        // System.out.println("Array "+notas.length);

    }
}
