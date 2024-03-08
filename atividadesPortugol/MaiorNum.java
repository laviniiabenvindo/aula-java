package atividadesPortugol;
import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args) {
        double n1, n2, n3;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite três números:");
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();
        }
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " é o maior número");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " é o maior número");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " é o maior número");
        } else {
            System.out.println("Você colocou números iguais");
        }

    }
}
