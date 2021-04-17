package ic.uff.semana6.exercicio2;

import java.util.Scanner;

public class TesteContaCorrente {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao seu banco: ");
        System.out.println("Aqui voce pode sacar / depositar");
        System.out.println("Digite (1) para sacar /Digite (2) para depositar");
        System.out.println("Digite (0) para sair");

        Boolean sair = true;

        while (sair) {

            Scanner teclado = new Scanner(System.in);
            int n = teclado.nextInt();
            ContaCorrente conta = new ContaCorrente();

            if (n == 1) {
                System.out.println("Voce escolheu sacar: ");
                System.out.println("Digite quanto de dinheiro voce deseja sacar :");
                float saque = teclado.nextFloat();

                try {
                    conta.sacar(saque);

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("Seu saldo é de : R$" + conta.getSaldo());
            }

            if (n == 2) {
                System.out.println("Voce escolheu depositar: ");
                System.out.println("Digite quanto de dinheiro que voce deseja a depositar :");
                float quantia = teclado.nextFloat();

                try {
                    conta.depositar(quantia);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("Seu saldo é de : R$" + conta.getSaldo());
            }
            if(n == 0){
                sair = false;
            }
        }
    }
}
