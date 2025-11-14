package PrimeiraSemana;

public class LacosDeRepeticao {

    public static void main(String[] args){

        // ============================================================
        //                           FOR
        // ============================================================
        // O for é usado quando sabemos exatamente quantas vezes queremos repetir algo.

        // Exemplo 1: contador simples de 0 a 4
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        // Exemplo 2: contagem regressiva de 10 a 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Exemplo 3: pulando de 2 em 2
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }



        // ============================================================
        //                           WHILE
        // ============================================================
        // While executa enquanto a condição for verdadeira.

        int contador = 0;

        // Exemplo 1: repetindo até contador chegar a 5
        while (contador < 5) {
            System.out.println(contador);
            contador++; // importante: incrementando para evitar loop infinito
        }

        // Exemplo 2: repetindo até o valor ser igual a 5
        int numero = 0;

        while (numero != 5) {
            numero++; // o loop roda enquanto numero não for 5
        }



        // ============================================================
        //                           DO-WHILE
        // ============================================================
        // O do-while roda pelo menos uma vez, mesmo que a condição seja falsa.

        int x = 10;

        do {
            System.out.println("Executou!"); // sempre será executado ao menos 1 vez
            x++;
        } while (x < 10); // condição falsa, mas só avaliada depois da 1ª execução



        // ============================================================
        //                      EXEMPLOS PRÁTICOS
        // ============================================================

        // ---------------- TABUADA ----------------
        int numero1 = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero1 + " x " + i + " = " + (numero1 * i));
        }



        // ---------------- SOMA DE 1 A 100 ----------------
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i; // soma acumulada
        }

        System.out.println("Soma total: " + soma);



        // ---------------- REPETIR ATÉ ENCONTRAR UM VALOR ----------------
        int valor = 1;

        while (valor != 10) {
            valor++; // repete até valor chegar em 10
        }

    }
}
