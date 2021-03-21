package ic.uff.semana4.exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    Scanner teclado = new Scanner(System.in);
    private final List<Pessoa> agenda = new ArrayList<>();

    public void addPessoaFisica() {
        System.out.println("Voce deseja adicionar quantas pessoas em sua agenda?");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite as informações da pessoa física: ");
            System.out.println("Seguindo a ordem respectivamente");
            System.out.println("1) NOME | 2) CPF | 3) ENDEREÇO | 4) DATA DE ANIVERSÁRIO");
            PessoaFisica pessoaF = new PessoaFisica(teclado.next(), teclado.next(), teclado.next(), teclado.next());
            agenda.add(pessoaF);
        }
    }

    public void addPessoaJuridica() {
        System.out.println("Voce deseja adicionar quantas pessoas em sua agenda?");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite as informações da pessoa jurídica: ");
            System.out.println("Seguindo a ordem respectivamente");
            System.out.println("1) NOME | 2) CNPJ | 3) ENDEREÇO | 4) FATURAMENTO");
            PessoaJuridica pessoaJ = new PessoaJuridica(teclado.next(), teclado.next(), teclado.next(), teclado.nextDouble());
            agenda.add(pessoaJ);
        }
    }

     public void procurarPessoaFisica() {
        System.out.println("Para procurar o seu contato ,digite o cpf da pessoa");
        String cpf = teclado.next();
        PessoaFisica pessoaFisica = null;

        for(Pessoa temp : agenda){
            if(temp.ehFisica()){
                if(((PessoaFisica) temp).getCpf().equals(cpf)){
                    pessoaFisica = (PessoaFisica) temp;
                }
            }
        }
        if(pessoaFisica == null){
            System.out.println("Não tem esse contato em sua agenda.");
        }
        else{
            System.out.println("\nNOME: " + pessoaFisica.getNome());
            System.out.println("CPF: " + pessoaFisica.getCpf());
            System.out.println("ENDEREÇO : " + pessoaFisica.getEndereco());
            System.out.println("DATA DE ANIVERSÁRIO : " + pessoaFisica.getNiver());
        }
    }

    public void procurarPessoaJuridica() {
        System.out.println("Para procurar o seu contato ,digite o cnpj da pessoa");
        String cnpj = teclado.next();
        PessoaJuridica pessoaJuridica = null;

        for(Pessoa temp : agenda){
            if(!temp.ehFisica()){
                if(((PessoaJuridica) temp).getCnpj().equals(cnpj)){
                    pessoaJuridica = (PessoaJuridica) temp;
                }
            }
        }
        if(pessoaJuridica == null){
            System.out.println("Não tem esse contato em sua agenda.");
        }
        else{
            System.out.println("\nNOME: " + pessoaJuridica.getNome());
            System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
            System.out.println("ENDEREÇO : " + pessoaJuridica.getEndereco());
            System.out.println("FATURAMENTO : " + pessoaJuridica.getFaturamento());
        }
    }
}