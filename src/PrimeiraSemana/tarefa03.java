package PrimeiraSemana;

public class tarefa03 {
    public static void main(String[] args){

        int n = 3;          // número que você quer o fatorial
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial de " + n + " = " + fatorial);

    }
}
