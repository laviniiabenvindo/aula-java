package atividadesPortugol;
import java.util.Scanner;

public class Genero {
 public static void main(String[] args) {
  String genero;

  try (Scanner sc = new Scanner(System.in)) {
   System.out.println("Digite seu genero com M ou F:");
   genero = sc.nextLine();
  }

  if (genero == "M") {
   System.out.println("Gênero masculino");
  } else if (genero == "F"){
   System.out.println("Gênero feminino");
  } else {
   System.out.println("Escreva somente M ou F");
  }
 }
}
