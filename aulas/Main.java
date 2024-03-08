package aulas;
import java.util.Scanner; // Importação do Scanner 

public class Main { // Class global = mesmo nome do arquivo
    public static void main(String[] args) { // Classe da Main
        String nome;  // Declaração de variavel
        int idade; // Declaração de variavel
        double nota; // Declaração de variavel

        // Entrada e Saida de dados 

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite seu nome:"); // Saidas de dados
            nome = sc.nextLine(); // Entrada de dados
            System.out.println("Digite sua idade:"); // Saidas de dados
            idade = sc.nextInt(); // Entrada de dados
            System.out.println("Olá "+nome); // Saidas de dados

            // SE e SENAO = IF e ELSE

            if ( idade >= 18) {
                System.out.println("Você é maior de idade"); // Saidas de dados
            } else {
                System.out.println("Você é menor de idade"); // Saidas de dados
            }

            // Estrutura WHILE = Estrutura Enquanto

            System.out.println("Digite um número entre 0 e 10:"); // Saida de dado
            nota = sc.nextDouble(); // Leitura no terminal = Entrada de dado

            while ( nota < 0 || nota > 10) { // A estrutura vai repetir até a condição fir verdadeira
                System.out.println("Nota tem que ser entre 0 e 10, por favor, digite um número entre 0 e 10:"); // Saida de dado
                nota = sc.nextDouble();
            }
        }
        System.out.println("Nota: "+nota);
    }
}