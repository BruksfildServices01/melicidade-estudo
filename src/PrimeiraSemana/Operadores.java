package PrimeiraSemana;

public class Operadores {

    public static void main(String[] args){

        // ============================
        //       OPERADORES ARITMÉTICOS
        // ============================

        int n1 = 10;
        int n2 = 15;

        // Adição
        int adicao = n1 + n2;
        System.out.println(adicao);

        // Subtração
        int subtracao = n1 - n2;
        System.out.println(subtracao);

        // Multiplicação
        int multiplicacao = n1 * n2;
        System.out.println(multiplicacao);

        // Divisão (cuidado: int/int gera inteiro!)
        double divisao = n1 / n2;
        System.out.println(divisao);

        // Usando % para saber se é par ou ímpar
        int numero = 10;
        if (numero % 2 == 0){
            System.out.println("par");
        } else {
            System.out.println("impar");
        }



        // ============================
        //      OPERADORES RELACIONAIS
        // ============================
        // Retornam true ou false ao comparar valores.

        int a = 10;
        int b = 10;

        boolean igualdade = a == b;     // igual
        System.out.println(igualdade);

        boolean diferente = a != b;     // diferente
        System.out.println(diferente);

        boolean maiorQue = a > b;       // maior que
        System.out.println(maiorQue);

        boolean maiorIgual = a >= b;    // maior ou igual
        System.out.println(maiorIgual);

        boolean menorIgual = a <= b;    // menor ou igual
        System.out.println(menorIgual);


        // Exemplos práticos:
        if (b > 5) {
            System.out.println(b + " é maior que 5");
        }

        if (b != 20) {
            System.out.println(b + " não é 20");
        }

        // Relacionais dentro de um loop
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }



        // ============================
        //       OPERADORES LÓGICOS
        // ============================
        // && (E), || (OU), ! (NÃO)

        int idade = 20;
        boolean carteira = true;

        // AND → ambos precisam ser verdadeiros
        if (idade >= 18 && carteira) {
            System.out.println("Pode dirigir");
        }

        int nota = 5;

        // OR → basta uma condição ser verdadeira
        if (nota >= 7 || nota == 6) {
            System.out.println("Passou!");
        } else {
            System.out.println("Reprovado");
        }

        // NOT → inverte o valor
        boolean chuva = false;
        if (!chuva) {
            System.out.println("Pode sair!");
        }

        // Exemplo combinando todos
        int idade2 = 20;
        boolean carteira2 = true;
        boolean bebeu = false;

        if (idade2 >= 18 && carteira2 && !bebeu) {
            System.out.println("Pode dirigir");
        }

    }
}
