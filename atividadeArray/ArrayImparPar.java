package atividadeArray;

public class ArrayImparPar {
    public static void main(String[] args) {
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] impares = new int[5];
        int[] pares = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] %2 == 0){
                numeros[i] = pares[i];
            } else {
                numeros[i] = impares[i];
            }
            System.out.println("Pares: "+ pares[i]);
            System.out.println("Impares: "+ impares[i]);
        }
    }
}
