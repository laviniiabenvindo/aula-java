package atividadesPortugol;
public class Populacao {
 public static void main(String[] args) {
  int paisA = 80000;
  int paisB = 200000;
  int ano = 0;

  while (paisA < paisB) {
   System.out.println("País A: "+(paisA = (int) (paisA * 1.03)));
   System.out.println("País B: "+(paisB = (int) (paisB * 1.015)));
   System.out.println("Ano: "+ano++);
  }
 }
}
