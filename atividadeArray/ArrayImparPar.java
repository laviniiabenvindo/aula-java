package atividadeArray;

public class ArrayImparPar {
    public static void main(String[] args) {
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] impares = new int[5];
        int[] pares = new int[5];
        int indicePares = 0;
        int indiceImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[indicePares] = numeros[i];
                indicePares++;
            } else {
                impares[indiceImpares] = numeros[i];
                indiceImpares++;
            }
        }

        System.out.println("Pares:");
        for (int i = 0; i < indicePares; i++) {
            System.out.println(pares[i]);
        }

        System.out.println("Ímpares:");
        for (int i = 0; i < indiceImpares; i++) {
            System.out.println(impares[i]);
        }
    }
}
