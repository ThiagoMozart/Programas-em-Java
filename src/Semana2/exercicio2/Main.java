package exercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Pessoa info = new Pessoa();

        System.out.println("Digite o nome da pessoa :");
        info.nome = teclado.next();
        System.out.println("Digite a sua idade :");
        info.idade = teclado.nextInt();

        printar(info);

        System.out.println(info.nome + " fez quantos aniversários ?");
        int n = teclado.nextInt();

        info.aniversario(n);

        System.out.println(info.nome + " agora tem: ");
        System.out.println("Idade: " + info.idade);
    }

    static void printar(Pessoa info){

        System.out.println("Nome: " + info.nome);
        System.out.println("Idade: " + info.idade);
        System.out.println();
    }
}