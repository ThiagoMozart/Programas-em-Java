package exercicio5;
import java.util.Scanner;
import java.util.Random;

public class Televisao {
    Scanner teclado2 = new Scanner(System.in);
    Canal tv = new Canal();

    void LigarDesligar(){
        tv.estado = !tv.estado;

        if(tv.estado){
            System.out.println("Agora a sua televisão está ligada.");
        }
        else{
            System.out.println("Agora a sua televisão está desligada.");
        }
    }

    void MudarVolume(){

        if(tv.estado) {
            if (!tv.modo) {
                System.out.println("Seu volume atual é " + tv.volume);
                System.out.println("Digite o novo volume para a sua televisão de 0 a 10: ");
                tv.volume = teclado2.nextInt();
            } else {
                System.out.println("Voce está no modo silencioso.");
            }
        }else{
            System.out.println("A televisão está desligada");
        }
    }

    void MudarCanal() {
        Random gerador = new Random();

        if(tv.estado) {
            System.out.println("Digite 1 se quiser ir para o canal anterior: ");
            System.out.println("Digite 2 se quiser ir para um canal específico: ");
            System.out.println("Digite 3 se quiser ir para o próximo canal: ");

            int n = teclado2.nextInt();

            if (n == 1) {
                tv.canal = tv.canal - 1;

                if (tv.canal < 0) {
                    tv.canal = 99;
                }

            } else if (n == 3) {
                tv.canal = tv.canal + 1;

                if (tv.canal > 99) {
                    tv.canal = 0;
                }

            } else {
                System.out.println("Digite o número do canal de 0 a 99");
                tv.canal = teclado2.nextInt();
            }

            if (tv.canal > 7) {
                tv.canal = gerador.nextInt(8);
            }
            mostrarCanais(tv.canal);

        }else{
            System.out.println("A televisão está desligada");
        }
    }

    void ModoSilence() {
        if (tv.estado) {
            tv.modo = !tv.modo;

            if (tv.modo) {
                System.out.println("A sua TV agora está no modo silencioso.");
            } else {
                System.out.println("A sua TV não está mais no modo silencioso.");
                System.out.println("E tem volume de " + tv.volume);
            }
        }else{
            System.out.println("A televisão está desligado");
        }
    }

    void printar(){
        if(tv.estado && !tv.modo) {
            System.out.print("Está no canal : ");
            mostrarCanais(tv.canal);
            System.out.println("Tem volume de : " + tv.volume);

        }else if(tv.estado){
            System.out.println("Está no canal : " );
            mostrarCanais(tv.canal);
            System.out.println("Está no modo silêncioso");
        }else {
            System.out.println("A televisão está desligada");
        }
    }

    void mostrarCanais(int canal){

        if (canal == 0) {
            System.out.println("As aventuras de BIBI , a pestinha do pedaço");
        } else if (canal == 1) {
            System.out.println("Ntv : Os melhores clipes da semana");
        } else if (canal == 2) {
            System.out.println("O programa do Roedoriznho");
        } else if (canal == 3) {
            System.out.println("Todo mundo odeia o Pedro");
        } else if (canal == 4) {
            System.out.println("Eu ,o Patrão e o bebê ");
        } else if (canal == 5) {
            System.out.println("Patrick Estrela ,calça triangular");
        } else if (canal == 6) {
            System.out.println("4 é muita coisa");
        } else if (canal == 7) {
            System.out.println("History Channel: Tudo culpa dos aliens");
        }
    }
}