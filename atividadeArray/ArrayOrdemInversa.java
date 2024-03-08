package atividadeArray;

import java.util.Scanner;

public class ArrayOrdemInversa {
    public static void main(String[] args) {
        double[] num = new double[10];

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite 10 números reais: ");

            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextDouble();
            }
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println("Valores no Array: "+num[i]);
        }
        // for(int count=10 ; count >= 1; count--){
        //     System.out.println(count);
        // }
    }
}
