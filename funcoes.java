package aulas;

public class funcoes {
    public static int somaTresNum(int a, int b, int c) {
        return a + b;
    }

    public static String negativoPositivo(int a) {
        if (a < 0) {
            return "N";
        } else {
            return "P";
        }
    }
   
    public static double somaImposto(double taxaImposto, double custo) {
        return (custo * taxaImposto);
    }

    public static int converter(int horas, int minutos) {
        if (horas > 12){
            return horas - 12;
        } else {
            return horas;
        }
    }
    public static void main(String[] args) {
        System.out.println(somaTresNum(10, 60, 50));
        System.out.println(negativoPositivo(10));
        System.out.println(somaImposto(1.018, 100));
        System.out.println(converter(20, 30));
    }
}