package atividadesPortugol;

import java.util.Scanner;

public class Carros {
 public static void main(String[] args) {
  int carro;

  try (Scanner sc = new Scanner(System.in)) {
   System.out.println("Quanto carros você possui?");
   carro = sc.nextInt();
  }

  if (carro >= 2) {
   System.out.println("Você pagará " + ((carro - 1) * 12.50) + " ao mês!");
  } else {
   System.out.println("Você não pagará nada!");
  }

 }
}
