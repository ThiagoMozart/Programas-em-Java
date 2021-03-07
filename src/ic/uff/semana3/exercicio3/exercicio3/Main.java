package ic.uff.semana3.exercicio3.exercicio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean abertura;
        Scanner teclado = new Scanner(System.in);
        String resposta;
        Porta customizacao = new Porta();

        int n;
        boolean aux = true;

        System.out.println("Qual cor voce quer para a porta ?");
        customizacao.setCor(teclado.next());

        System.out.println("Medidas agora!");
        System.out.println("Qual largura da sua porta :");
        customizacao.setLargura(teclado.nextInt());

            System.out.println("E a altura :");
            customizacao.setAltura(teclado.nextInt());

            System.out.println("Voce quer abrir a porta? ");
            System.out.println("(Digite sim ou não) ");
            resposta = teclado.next();

            AbrirFechar(customizacao,resposta);
            printar(customizacao);

            while(aux){
                System.out.println();
                System.out.println("Digite 1 para mudar a cor:");
                System.out.println("Digite 2 para mudar a largura:");
                System.out.println("Digite 3 para mudar a altura:");
                System.out.println("Digite 4 para mudar o estado da porta(aberta ou fechada) :");
                System.out.println("Digite 0 se estiver satisfeito com as mudanças :");

                n = teclado.nextInt();

                if(n == 1){
                    customizacao.setCor(teclado.next());
                }
                if(n == 2){
                    customizacao.setLargura(teclado.nextInt());
                }
                if(n == 3){
                    customizacao.setAltura(teclado.nextInt());
                }
                if(n == 4){

                    if(customizacao.getAbertura()){
                        customizacao.setAbertura(false);
                    }
                    else{
                        customizacao.setAbertura(true);
                    }
                }
               if(n == 0){
                   break;
               }
            }
            printar(customizacao);

    }
    static void AbrirFechar(Porta porta,String resposta){

        if (resposta.equals("sim")){
            porta.setAbertura(true);
        }
        else{
            porta.setAbertura(false);
        }
    }

    static void estaAberta(Porta porta){
        if (porta.getAbertura()){
            System.out.println("A porta esta aberta.");
        }
        else{
            System.out.println("A porta esta fechada.");
        }
    }

    static void printar(Porta porta){
        System.out.println("A cor da sua porta é "+ porta.getCor() +" com largura de "+ porta.getLargura()
        + "cm e de altura " + porta.getAltura() + "cm.");
        estaAberta(porta);
    }
}