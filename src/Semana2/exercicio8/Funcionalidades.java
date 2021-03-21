package exercicio8;

import java.util.Scanner;

public class Funcionalidades {
    Scanner teclado = new Scanner(System.in);
    Celular celular = new Celular();

    public void ligacaoBateria(){
        System.out.println("Com quem voce deseja direcionar esta ligação: ");
        String nomeLiga;
        nomeLiga = teclado.next();

        System.out.println("De quanto tempo (segundos) será essa ligação para " + nomeLiga + " ?");
        int temp;
        temp = teclado.nextInt();
        clearBuffer(teclado);
        temp = temp / 5;
        celular.nivelCarga = celular.nivelCarga - temp;
        System.out.println("------------------------------");
    }

    private void clearBuffer(Scanner teclado) {
        if(teclado.hasNextLine()){
            teclado.nextLine();
        }
    }

    public void mensagemBateria(){
        System.out.println("Com quem voce deseja direcionar esta mensagem:");
        String nome;
        nome = teclado.next();

        System.out.println("Por favor ,digite sua mensagem para: "+ nome);
        String mensagem ;
        mensagem = teclado.next();
        clearBuffer(teclado);

        System.out.println("Mensagem enviada");
        System.out.println("------------------------------");
        celular.nivelCarga = celular.nivelCarga - 1;;
    }

    void verificarBateria(){
        System.out.println("Voce tem "+ celular.nivelCarga +"% de um total de "+ celular.capaciBateria + "% de carga");
        System.out.println("------------------------------");
    }
}

