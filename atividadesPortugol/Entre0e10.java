package atividadesPortugol;
import java.util.Scanner;

public class Entre0e10 {
 public static void main(String[] args) {
  int nota;

  try (Scanner sc = new Scanner(System.in)) {
   System.out.println("Digite uma nota entre 0 e 10:");
   nota = sc.nextInt();

   while (nota < 0 || nota > 10) {
    System.out.println("Nota tem que ser entre 0 e 10, por favor, digite novamente:");
    nota = sc.nextInt();
   }
  }

  System.out.println(nota);
 }
}
