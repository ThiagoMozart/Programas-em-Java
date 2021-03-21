package exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Funcionalidades funcoes = new Funcionalidades();

        System.out.println("Bem vindo a sua rede de operações em seu novo aparelho telefônico.");
        System.out.println("Me chamo Larry ,e estou aqui para te auxiliar.");
        System.out.println("Voce tem atualmente " +funcoes.celular.capaciBateria  + "% de bateria.");
        System.out.println("------------------------------");

        while (true) {
            System.out.println("Se voce deseja realizar uma ligação ,aperte (1) ");
            System.out.println("Se voce deseja digitar uma mensagem ,aperte (2) ");
            System.out.println("Se voce deseja saber quanto de bateria seu telefone tem , digite (3) ");
            System.out.println("Se deseja encerrar seu uso , digite (0) ");

            int n = teclado.nextInt();

            if (n == 1) {
                funcoes.ligacaoBateria();
            }
            else if (n == 2) {
                funcoes.mensagemBateria();
            }
            else if (n == 3) {
                funcoes.verificarBateria();
            }
            else{
                break;
            }

            if(funcoes.celular.nivelCarga <= 0){
               System.out.println("Funções desabilitadas por falta de bateria , por favor conecte seu dispositivo" +
                       " em um carregador!");
               break;
            }
        }
    }
}