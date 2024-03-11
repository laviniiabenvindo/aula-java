package aulas;

public class recursao {
    // AULA
    public static int fibo(int n){
        if( n <= 1){
            return n;
        } else {
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static int fatorial(int n){
        if(n == 1){
            return n;
        } else {
            return n * fatorial(n-1);
        }
    }
    // ATIVIDADES
    public static void regressao(int n){
        if(n == 0){
            System.out.println(0);
        } else {
            System.out.println(n + ",");
            regressao(n - 1);
        }
    }
    public static int potencia(int base, int expoente){
        if (expoente == 0){
            return 1;
        } else {
            return base * potencia(base, expoente - 1);
        }
    }
    public static int fiboAtiv(int n){
        if( n <= 1){
            return n;
        } else {
            return fiboAtiv(n-1)+fiboAtiv(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fibo(10));
        // System.out.println(fibo(80));
        System.out.println(fatorial(5));
        regressao(6);
        System.out.println(potencia(2, 3));
    }
}
