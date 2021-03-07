package ic.uff.semana3.exercicio3.exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Casa home = new Casa();

        Portas porta1 = new Portas();
        home.adicionar(porta1);

        Portas porta2 = new Portas();
        home.adicionar(porta2);

        Portas porta3 = new Portas();
        home.adicionar(porta3);

        boolean aux = true;
        int n;

        System.out.println("Qual cor deseja para a casa? ");
        home.setCor(teclado.next());

        while(aux){
            System.out.println();
            System.out.println("Digite 1 para mudar o estado da porta número 1: ");
            System.out.println("Digite 2 para mudar o estado da porta número 2: ");
            System.out.println("Digite 3 para mudar o estado da porta número 3: ");
            System.out.println("Digite 4 para mudar a cor da casa: ");
            System.out.println("Digite 0 se estiver satisfeito com as mudanças: ");

            n = teclado.nextInt();
            if((n == 1)||(n == 2)||(n == 3)){
                home.AbrirFechar(n);
            }
            if(n == 4){
                home.setCor(teclado.next());
            }
            if(n == 0){
                break;
            }
        }
        System.out.println("A casa está com a cor "+ home.getCor());
        home.QuantasPortasEstaoAbertas();
    }
}
