package exercicio6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean[] usadas = new boolean[52];
        Scanner teclado = new Scanner(System.in);
        boolean aux = true;
        int n;
        int tamanho = 0;
        Baralho jogo21 = new Baralho();

        for (int k = 0; k < 52; k++) {
            Carta carta = new Carta();
            jogo21.addCartas(carta, tamanho);
            tamanho++;
        }

        jogo21.valorCarta();
        while (aux) {
            System.out.println("Digite 1 se quiser jogar 'BlackJack': ");
            System.out.println("Digite 0 se quiser  parar de jogar : ");
            n = teclado.nextInt();

            if (n == 0) {
                System.out.println("Até a próxima!");
                break;
            }
            if (n == 1) {

                System.out.println("REGRAS:");
                System.out.println("'BlackJack' é um jogo em que voce vai receber uma carta por rodada de forma aleatória\n" +
                        "e tem um máximo de 5 rodadas.");

                System.out.println("Cada rodada a carta que voce recebe vale um valor e é somado a sua mão.");
                System.out.println("Ganha quem estiver mais próximo de 21 ou fizer 21.");
                System.out.println("E perde caso passar de 21.\n");
                System.out.println("---Valores das cartas---");
                System.out.println("(Ás) vale 1 ou 11 , escolha do jogador.");
                System.out.println("Valete(J) , Dama (Q) e Rei(K) valem 10.");
                System.out.println("E as demais cartas valem seu número respectivamente.");
                jogo(jogo21, usadas);
            }
        }
    }

    static void jogo(Baralho baralho, boolean[] usadas) {

        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        int jogador;
        int cpu;

        int pontJog = 0;
        int pontCpu = 0;
        int jogadas = 0;

        while(true) {
            int pular = 0;

            while (true) {
                jogador = gerador.nextInt(52);
                cpu = gerador.nextInt(52);

                if (usadas[jogador] || usadas[cpu] || (jogador == cpu)) {
                    continue;
                }
                usadas[jogador] = true;
                usadas[cpu] = true;
                break;
            }

            Carta carta = baralho.baralho[jogador];
            Carta cartaCpu = baralho.baralho[cpu];
            System.out.println("\n RODADA : "+ (jogadas + 1));
            System.out.println("Sua carta é " + baralho.baralho[jogador].valor + " de " + baralho.baralho[jogador].naipe+".");
            System.out.println("A carta da mesa é " + baralho.baralho[cpu].valor + " de " + baralho.baralho[cpu].naipe+".\n");

            System.out.println("Digite (1) se deseja jogar essa carta ou digite (2) para pular sua rodada.");
            pular = teclado.nextInt();

            if (pular == 1) {
                jogadas++;
                switch (baralho.baralho[jogador].valor) {
                    case "Ás" -> {
                        int escolha = 0;
                        System.out.println("Digite (1) para escolher 1 ponto ou (2) para escolher 11 pontos.");
                        escolha = teclado.nextInt();

                        if (escolha == 1) {
                            pontJog = pontJog + 1;
                        } else {
                            pontJog = pontJog + 11;
                        }
                    }
                    case "K", "Q", "J", "10" -> pontJog = pontJog + 10;
                    case "9" -> pontJog = pontJog + 9;
                    case "8" -> pontJog = pontJog + 8;
                    case "7" -> pontJog = pontJog + 7;
                    case "6" -> pontJog = pontJog + 6;
                    case "5" -> pontJog = pontJog + 5;
                    case "4" -> pontJog = pontJog + 4;
                    case "3" -> pontJog = pontJog + 3;
                    case "2" -> pontJog = pontJog + 2;
                }
            }
            else{
                jogadas++;
            }
            int valorCpu = 0;
                switch (baralho.baralho[cpu].valor) {
                    case "Ás" -> {
                        if (pontCpu > 10) {
                            valorCpu = 1;
                            pontCpu = pontCpu + 1;
                        } else {
                            valorCpu = 11;
                            pontCpu = pontCpu + 11;
                        }
                    }
                    case "K", "Q", "J", "10" -> {
                        pontCpu = pontCpu + 10;
                        valorCpu = 10;
                    }
                    case "9" -> {
                        pontCpu = pontCpu + 9;
                        valorCpu = 9;
                    }
                    case "8" -> {
                        pontCpu = pontCpu + 8;
                        valorCpu = 8;
                    }
                    case "7" -> {
                        pontCpu = pontCpu + 7;
                        valorCpu = 7;
                    }
                    case "6" -> {
                        pontCpu = pontCpu + 6;
                        valorCpu = 6;
                    }
                    case "5" -> {
                        pontCpu = pontCpu + 5;
                        valorCpu = 5;
                    }
                    case "4" -> {
                        pontCpu = pontCpu + 4;
                        valorCpu = 4;
                    }
                    case "3" -> {
                        pontCpu = pontCpu + 3;
                        valorCpu = 3;
                    }
                    case "2" -> {
                        pontCpu = pontCpu + 2;
                        valorCpu = 2;
                    }
                }

                if(pontCpu > 21){
                    pontCpu = pontCpu - valorCpu;
                }

            System.out.println("Voce tem "+ pontJog +" pontos.");
            System.out.println("A mesa tem "+ pontCpu +" pontos.");

            if((pontJog == 21) || (pontCpu > 21)){
                System.out.println("Parabéns voce ganhou!");
                break;
            }
            else if(jogadas == 5){
                if((21 - pontJog) < (21 - pontCpu)){
                    System.out.println("Parabéns voce ganhou!");
                    break;
                }
                else{
                    System.out.println("Voce perdeu!");
                    break;
                }
            }
            else if((pontCpu == 21) || (pontJog > 21)){
                System.out.println("Voce perdeu!");
                break;
            }
        }
    }
}