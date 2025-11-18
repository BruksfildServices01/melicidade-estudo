package PrimeiraSemana;

public class tarefa04 {
    public static void main(String[] args){

        for (int n1 = 1; n1 < 11; n1++){
            int n2 = 1;
            System.out.println("Tabuada do: " + n1);
            while (n2 <= 10){
                int total = n2 * n1;
                System.out.println(n2 + "X" + n1 + " = " + total );
                n2++;
            }
            System.out.println("------PROXIMO--------");
        }

    }
}
