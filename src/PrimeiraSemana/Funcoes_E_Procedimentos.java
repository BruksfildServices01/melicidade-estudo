package PrimeiraSemana;

public class Funcoes_E_Procedimentos {
    public static void main(String[] args){
        saudacao();
        mostrarIdade(23);
        double resultado = receber(100);
        System.out.println("valor é: " + resultado);
    }

    public static void saudacao() {
        System.out.println("Olá, bem-vindo!");
    }

    public static void mostrarIdade(int idade) {
        System.out.println("Sua idade é: " + idade);
    }

    public static double receber(double valor) {
        return valor;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }




}
