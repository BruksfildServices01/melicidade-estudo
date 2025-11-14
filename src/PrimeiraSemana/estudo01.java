package PrimeiraSemana;

public class estudo01 {
    public static void main(String[] args) {

        // Variáveis básicas
        int idade = 23;
        double altura = 1.76;
        String nome = "Lucas";
        boolean vivo = false;

        // Operações matemáticas
        int numero1 = 10;
        int numero2 = 10;
        int soma = numero1 + numero2;
        System.out.println("Resultado: " + soma);

        // Condições: verificar se pode dirigir
        if (idade >= 18 && vivo) {
            System.out.println("O " + nome + " pode dirigir");
        } else {
            System.out.println("O " + nome + " não pode dirigir");
        }

        // Controle simples de pagamentos
        int salario = 1200;
        int aluguel = 500;
        int gastos = 600;
        int comida = 500;
        int bonus = 2000;

        if (salario > aluguel) {
            salario -= aluguel;
            System.out.println("Salário após aluguel: " + salario);

            if (salario >= gastos) {
                salario -= gastos;
                System.out.println("Salário após gastos: " + salario);

                // Se sobrar dinheiro OU se o bônus for suficiente
                if (salario >= comida || bonus >= comida) {
                    salario += bonus;
                    System.out.println("Salário com bônus: " + salario);

                    salario -= comida;
                    System.out.println("Salário após comida: " + salario);
                }
            }
        }

        // Verificação de cartão aprovado
        String nomeCliente = "Lucas";
        boolean cpfLimpo = false;
        boolean cartaoAprovado;
        String mensagem;

        if (cpfLimpo) {
            cartaoAprovado = true;
            mensagem = "Cartão aprovado!!";
        } else {
            cartaoAprovado = false;
            mensagem = "Cartão recusado!!";
        }

        System.out.println(mensagem);
    }
}
