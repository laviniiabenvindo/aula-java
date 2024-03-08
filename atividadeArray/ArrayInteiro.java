package atividadeArray;

import java.util.Scanner;

public class ArrayInteiro {
    public static void main(String[] args) {
        int[] num = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite 5 números inteiros: ");

            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println("Número no Array: "+num[i]);
        }
    }
}
