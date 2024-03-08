package atividadesPortugol;
import java.util.Scanner;

public class Conceito {
 public static void main(String[] args) {
  double n1, n2, media;
  try (Scanner sc = new Scanner(System.in)) {
   System.out.println("Digite tuas notas:");
   n1 = sc.nextDouble();
   n2 = sc.nextDouble();
  }
  media = ((n1 + n2) / 2);
  System.out.println("Sua média é: " + media);

  if (media >= 9 && media == 10) {
   System.out.println("Conceito A");
  } else if (media >=  7.5 && media < 9) {
   System.out.println("Conceito B");
  } else if (media >= 6 && media < 7.5) {
   System.out.println("Conceito C");
  } else if (media >=  4 && media < 6){
   System.out.println("Conceito D");
  } else if (media >= 0 && media < 4){
   System.out.println("Conceito E");
  }
 }
}
