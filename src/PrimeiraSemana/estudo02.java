package PrimeiraSemana;

public class estudo02 {

    public static void main(String[] args) {

        // --------------------------
        // ARRAYS DE NOMES
        // --------------------------
        String[] nomes = {"lucas", "lary", "gabriel"};

        // imprime o primeiro nome
        System.out.println(nomes[0]);

        // imprime o terceiro nome
        System.out.println(nomes[2]);


        // --------------------------
        // ARRAYS DE NÚMEROS
        // --------------------------
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};   // array com 10 números
        int[] numeros2 = new int[5];              // array vazio com 5 posições


        // --------------------------
        // TABUADA (FOR + WHILE)
        // --------------------------
        int contador = 1;

        // IMPORTANTE: quando usamos índices em arrays, usamos < e não <=
        // MAS aqui você está usando i apenas como número, então tudo bem
        for (int i = 1; i <= numeros.length; i++) {

            contador = 1;  // reinicia o contador toda vez que mudar o "i"

            // imprime a tabuada do número i
            while (contador <= 10) {
                System.out.println(i * contador);
                contador++;
            }
            System.out.println("numero de vezes que o for repetiu: " + i);
        }


        // --------------------------
        // DO WHILE COM ARRAY
        // --------------------------
        int contador2 = 0; // CORREÇÃO: começa sempre do índice 0

        do {
            System.out.println(numeros2[contador2]);
            contador2++;
        } while (contador2 < numeros2.length);
        // porque o maior índice válido é length - 1 (aqui 4)
    }
}
