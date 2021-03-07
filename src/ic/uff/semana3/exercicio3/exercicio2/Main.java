package ic.uff.semana3.exercicio3.exercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Pessoa info = new Pessoa();

        System.out.println("Digite o nome da pessoa :");
        info.setNome(teclado.next());
        System.out.println("Digite a sua idade :");
        info.setIdade(teclado.nextInt());

        printar(info);

        System.out.println(info.getNome() + " fez quantos aniversários ?");
        int n = teclado.nextInt();

        info.aniversario(n);

        System.out.println(info.getNome() + " agora tem: ");
        System.out.println("Idade: " + info.getIdade() + " anos");
    }

    static void printar(Pessoa info){

        System.out.println("Nome: " + info.getNome());
        System.out.println("Idade: " + info.getIdade() + " anos");
        System.out.println();
    }
}