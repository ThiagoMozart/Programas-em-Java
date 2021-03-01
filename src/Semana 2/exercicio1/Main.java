package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantos novos contatos quer adicionar: ");

        int n = teclado.nextInt();
        System.out.println("Digite as informações do seu novo contato: ");

        for(int i = 0 ; i < n ; i++){
            Contato pessoa = new Contato();
            System.out.println("Digite o nome: ");
            pessoa.nome = teclado.next();

            System.out.println("Digite o telefone: ");
            pessoa.telefone = teclado.nextInt();

            System.out.println("Digite o email: ");
            pessoa.email = teclado.next();

            System.out.println("Digite o endereço: ");
            pessoa.endereco = teclado.next();

            printar(pessoa);
        }
    }
    static void printar(Contato pessoa) {
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Telefone: " + pessoa.telefone);
        System.out.println("Email: " + pessoa.email);
        System.out.println("Enderço: " + pessoa.endereco);
        System.out.println();
    }
}
