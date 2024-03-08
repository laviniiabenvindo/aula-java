package atividadesPortugol;
import java.util.Scanner;

public class Login {
 public static void main(String[] args) {
  String senha, login;

  try (Scanner sc = new Scanner(System.in)) {
   System.out.println("Digite seu login e senha, não pode ser iguais:");
   login = sc.nextLine();
   senha = sc.nextLine();

   while (login.equals(senha)) {
    System.out.println("Login e senha iguais, por favor, digite novamente:");
    login = sc.nextLine();
    senha = sc.nextLine();
   }
  }
  System.out.println("Logado com sucesso!!");
 }
}
