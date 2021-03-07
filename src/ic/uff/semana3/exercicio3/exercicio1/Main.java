package ic.uff.semana3.exercicio3.exercicio1;

import ic.uff.semana3.exercicio3.exercicio1.Contato;

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
            pessoa.setNome(teclado.next());

            System.out.println("Digite o telefone: ");
            pessoa.setTelefone(teclado.nextInt());

            System.out.println("Digite o email: ");
            pessoa.setEmail(teclado.next());

            System.out.println("Digite o endereço: ");
            pessoa.setEndereco(teclado.next());

            printar(pessoa);
        }
    }
    static void printar(Contato pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("Enderço: " + pessoa.getEndereco());
        System.out.println();
    }
}
