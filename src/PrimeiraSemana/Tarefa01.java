package PrimeiraSemana;

public class Tarefa01 {
    public static void main(String[] args){
        tipo("+", 20, 20);
    }

    public static double multiplicar ( double n1, double n2){
        double total = n1 * n2;
        return  total;
    }
    public static double somar ( double n1, double n2){
        double total = n1 + n2;
        return  total;
    }
    public static double dividir ( double n1, double n2){
        double total = n1 / n2;
        return  total;
    }
    public static double subtrair ( double n1, double n2){
        double total = n1 - n2;
        return  total;
    }

    public static void tipo ( String typo, double n1, double n2){
        if (typo.equals("+")){
            System.out.println("o valor total da soma e: " + somar(n1,n2));
        } else if (typo.equals("*")) {
            System.out.println("o valor total da multiplicao e: " + multiplicar(n1,n2));
        } else if (typo.equals("/")) {
            System.out.println("o valor total da divisao e: " + dividir(n1,n2));
        } else if (typo.equals("-")) {
            System.out.println("o valor total da subtracao e: " + subtrair(n1,n2));
        } else {
            System.out.println("algo deu errado");
        }

    }


}
