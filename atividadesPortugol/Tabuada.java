package atividadesPortugol;
import java.util.Scanner;

public class Tabuada {
 public static void main(String[] args) {
  int tabuada;

  try (Scanner sc = new Scanner(System.in)) {
   System.out.println("Qual número você quer saber a tabuada?");
   tabuada = sc.nextInt();
  }

  for (int i = 1; i <= 10; i++) {
   System.out.println(tabuada+" x " + i +" = " +tabuada*i);
  }
 }
}
