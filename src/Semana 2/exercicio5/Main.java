package exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        boolean aux = true;
        Televisao central = new Televisao();

        while(aux) {
            System.out.println("Digite 1 para ligar ou desligar sua televisão: ");
            System.out.println("Digite 2 para mudar o volume de sua televisão: ");
            System.out.println("Digite 3 para mudar o canal: ");
            System.out.println("Digite 4 para entrar ou sair do modo silencioso: ");
            System.out.println("Digite 5 para ver como tá a sua televisão: ");
            System.out.println("Digite 0 se voce está sastisfeito: ");

            int n = teclado.nextInt();

            if(n == 1){
                central.LigarDesligar();
            }

            if(n == 2){
                central.MudarVolume();
            }

            if(n == 3){
                central.MudarCanal();
            }

            if( n == 4){
                central.ModoSilence();
            }

            if(n == 5){
                central.printar();
            }

            if(n == 0 ){
                break;
            }
        }
    }
}