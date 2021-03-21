package ic.uff.semana4.exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha seu tipo de pokemon");
        System.out.println("Digite (1) para o do tipo fogo");
        System.out.println("Digite (2) para o do tipo de água");
        System.out.println("Digite (3) para o do tipo elétrico");
        System.out.println("Digite (4) para o do tipo planta");

        int escolha = teclado.nextInt();

        if(escolha == 1){
            Fogo fogo = new Fogo();

            System.out.println("Escolha o que seu pokemon irá fazer");
            System.out.println("Digite (1) se quiser atacar");
            System.out.println("Digite (2) se quiser ver os estatos do seu pokemon");

            int n = teclado.nextInt();

            if(n == 1){
                fogo.usarAtaque();

            }

            if(n == 2){
                fogo.mostrarStats();
            }
        }

        if(escolha == 2){
            Agua agua = new Agua();
            System.out.println("Escolha o que seu pokemon irá fazer");
            System.out.println("Digite (1) se quiser atacar");
            System.out.println("Digite (2) se quiser ver os estatos do seu pokemon");

            int n = teclado.nextInt();

            if(n == 1){
                agua.usarAtaque();

            }

            if(n == 2){
                agua.mostrarStats();

            }
        }

        if(escolha == 3){
            Eletrico eletrico = new Eletrico();
            System.out.println("Escolha o que seu pokemon irá fazer");
            System.out.println("Digite (1) se quiser atacar");
            System.out.println("Digite (2) se quiser ver os estatos do seu pokemon");

            int n = teclado.nextInt();

            if(n == 1){
                eletrico.usarAtaque();

            }
            if(n == 2){
                eletrico.mostrarStats();
            }
        }

        if(escolha == 4){
            Planta planta = new Planta();
            System.out.println("Escolha o que seu pokemon irá fazer");
            System.out.println("Digite (1) se quiser atacar");
            System.out.println("Digite (2) se quiser ver os estatos do seu pokemon");

            int n = teclado.nextInt();

            if(n == 1){
                planta.usarAtaque();

            }
            if(n == 2){
                planta.mostrarStats();
            }
        }
    }
}
