package atividadesPortugol;
import java.util.Scanner;

public class MediaDuas {
    public static void main(String[] args) {
        double n1, n2, media;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite tuas notas:");
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
        }
        media = ((n1 + n2) / 2);
        System.out.println("Sua média é: " + media);

        if (media == 10) {
            System.out.println("Aprovado com Distinção!");
        } else if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
