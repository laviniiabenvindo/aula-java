package atividadeArray;

import java.util.Scanner;

public class ArrayCaracter {
    public static void main(String[] args) {
        String[] letras = new String[5];

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < letras.length; i++) {
                System.out.println("Digite uma letra: ");
                letras[i] = sc.nextLine();
            }
        }

        for (int i = 0; i < letras.length; i++) {
            if
            (letras[i].equals("a") || letras[i].equals("e") || letras[i].equals("i") || letras[i].equals("o") || letras[i].equals("u")){
                System.out.println(letras[i]+" É uma vogal");
            }
            System.out.println(letras[i]+" É uma consoantes");
        }
    }
}
