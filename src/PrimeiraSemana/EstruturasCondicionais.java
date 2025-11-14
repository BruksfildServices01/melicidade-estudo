package PrimeiraSemana;

public class EstruturasCondicionais {

    public static void main(String[] args){

        // ============================================================
        //                     IF / ELSE BÁSICO
        // ============================================================
        // A estrutura IF permite executar um bloco somente se a condição for verdadeira.
        // Comparações como >=, <=, >, <, == e != são usadas para tomar decisões.

        int n1 = 5;
        int n2 = 3;

        // Exemplo 1: condição simples
        if (n1 >= n2){
            System.out.println("n1 é maior ou igual a n2");
        }

        // Exemplo 2: if + else (apenas um dos blocos será executado)
        if (n2 >= n1){
            System.out.println("n2 é maior ou igual a n1");
        } else {
            System.out.println("n1 é maior que n2");
        }



        // ============================================================
        //                    IF / ELSE IF / ELSE
        // ============================================================
        // Usado quando há mais de duas possibilidades.

        int nota = 7;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            // Esse bloco só é executado se o primeiro IF for falso
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }



        // ============================================================
        //         EXEMPLO – verificando número positivo, negativo ou zero
        // ============================================================

        int n = 0;

        if (n > 0) {
            System.out.println("Positivo");
        } else if (n < 0) {
            System.out.println("Negativo");
        } else {
            // Quando n não é maior nem menor => só pode ser zero
            System.out.println("Zero");
        }



        // ============================================================
        //                             SWITCH
        // ============================================================
        // O switch é ideal quando há várias opções fixas (como menu, dias da semana).
        // Cada "case" representa uma opção.
        // O "break" impede que o código continue executando os próximos cases.
        // O "default" funciona como o "else" do switch.

        int dia = 3;  // 1 = Domingo, 2 = Segunda, etc.

        switch (dia) {

            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                // Esse bloco roda caso o valor não seja nenhum dos above
                System.out.println("Dia inválido");
        }

    }
}
