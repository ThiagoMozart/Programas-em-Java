package ic.uff.semana4.exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agenda contato = new Agenda();

        System.out.println("Bem vindo a sua agenda pessoal!\n");
        System.out.println("Temos 3 funcionalidades principais ,sendo elas");
        System.out.println("1) Adicionar contatos");
        System.out.println("2) Procurar por um contato específico");
        System.out.println("3) SAIR");
        System.out.println("Digite o seu número para acessar uma dessas funcionalidades");

        int n = teclado.nextInt();
        while(n != 3){

            if(n == 1){
                System.out.println("Seu contato é pessoa física ou jurídica?");
                System.out.println("1) Pessoa física");
                System.out.println("2) Pessoa jurídica");
                int qualPessoa = teclado.nextInt();
                if(qualPessoa == 1){
                    contato.addPessoaFisica();
                }
                if(qualPessoa == 2){
                    contato.addPessoaJuridica();
                }
            }

            if(n == 2){
                System.out.println("O contato que voce deseja procurar é pessoa física ou jurídica?");
                System.out.println("1) Pessoa física");
                System.out.println("2) Pessoa jurídica");
                int qualPessoa2 = teclado.nextInt();
                if(qualPessoa2 == 1){
                    contato.procurarPessoaFisica();
                }
                if(qualPessoa2 == 2){
                    contato.procurarPessoaJuridica();
                }
            }
            System.out.println("1) Adicionar contatos");
            System.out.println("2) Procurar por um contato específico");
            System.out.println("3) SAIR");
            System.out.println("Digite o seu número para acessar uma dessas funcionalidades\n");
            n = teclado.nextInt();
        }
    }
}


