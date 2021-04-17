package ic.uff.semana6.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCliente {
    static List<Cliente> contatos = new ArrayList<>();

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo ,aqui é a central de clientes");
        boolean loop = true;

        while(loop) {
            System.out.println("\nSe voce deseja cadastrar um novo cliente digite (1)");
            System.out.println("Se voce deseja buscar por um cliente digite (2)");
            System.out.println("Se voce deseja ver a sua lista de clientes digite (3)");
            System.out.println("Se voce deseja terminar suas ações na central de clientes digite (0)");
            int n = teclado.nextInt();

            if(n == 1){
                inserir();
            }
            if(n == 2){
                buscar();
            }
            if( n == 3){
                imprimir();
            }
            if( n == 0){
                loop = false;
            }
        }
    }

    static void inserir(){
        Cliente cliente = new Cliente();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira aqui as informações do novo cliente: ");
        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();
        cliente.setNome(nome);

        String cpf = null;

        try {
            System.out.println("Digite o seu cpf: ");
            cpf = teclado.next();
            cliente.setCpf(cpf);

            System.out.println("Digite a sua idade: ");
            String idade = teclado.next();
            cliente.setIdade(idade);

        } catch(DadoInvalidoException e){
            System.out.println(e.getMessagePorFavor());
        }

        boolean temCpf;
        temCpf = procuraCpf(cpf);

        try {
            if(temCpf){
                throw new ClienteJaExisteException();
            }
        }catch(ClienteJaExisteException e){
                System.out.println(e.getMessage());
        }
        contatos.add(cliente);
        try{
            if (contatos.size() > 10) {
                throw new RepositorioException();
            }
        }catch (RepositorioException e){
            System.out.println(e.getMessage());
        }
    }

    static void buscar(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira aqui o cpf do cliente que deseja procurar em sua lista: ");
        String busca = teclado.next();
        boolean achou = false;

        for(Cliente percorre : contatos){
            if(percorre == null){
                break;
            }
            achou = procuraCpf(busca);

            if(achou){
                System.out.println("Achamos esse cliente: ");
                System.out.println("Nome: " + percorre.getNome());
                System.out.println("Cpf: " + percorre.getCpf());
                System.out.println("Idade: " + percorre.getIdade());
            }
        }
        try{
            if (!achou){
                throw new ClienteInexistenteException();
            }

        } catch (ClienteInexistenteException e) {
            System.out.println(e.getMessage());
        }
    }

    static void imprimir(){
        for(Cliente percorre : contatos){
            System.out.println("Nome : " + percorre.getNome());
            System.out.println("Cpf : " + percorre.getCpf());
            System.out.println("Idade : " + percorre.getIdade() +"\n");
        }
    }

    static boolean procuraCpf(String cpf){
        for(Cliente percorre : contatos){
            if(String.valueOf(percorre.getCpf()).equals(cpf)){
                return true;
            }
        }
        return false;
    }
}
