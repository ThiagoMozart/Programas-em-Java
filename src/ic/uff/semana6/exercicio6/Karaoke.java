package ic.uff.semana6.exercicio6;
import java.util.Scanner;

public class Karaoke {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListaMusicas lista = new ListaMusicas();
        System.out.println("Bem vindo a sua maquina de karaoke");
        System.out.println("Aqui voce pode ouvir suas melhores músicas");

        boolean sair = true;
        lista.adicionarMusicas();

        while (sair) {

            System.out.println("\nDigite (1) para ver a lista de músicas do seu Karaoke");
            System.out.println("Digite (2) para consultar a lista de músicas ordenada pelo nome das músicas");
            System.out.println("Digite (3) para consultar a lista de músicas ordenada pelo nome dos artistas");
            System.out.println("Digite (4) para adicionar uma música em sua playlist");
            System.out.println("Digite (5) para tocar a sua playlist");
            System.out.println("Digite (0) para sair do Karaoke\n");

            int n = teclado.nextInt();
            if (n == 1) {
                lista.verMusica();
            }

            if (n == 2) {
                lista.mostrasListaMusica();
            }

            if (n == 3) {
                lista.mostrarListaArtista();
            }

            if(n == 4){
                lista.adicionarMusicaFila();
            }

            if(n == 5){
                lista.tocarMusica();
            }

            if (n == 0) {
                sair = false;
            }
        }
    }
}

