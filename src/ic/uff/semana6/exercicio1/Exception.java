package ic.uff.semana6.exercicio1;

import java.util.Scanner;

public class Exception {

    /*IllegalArgumentException == > Acontece quando é passado um argumento errado, exemplo ,pede um String e voce passa um int
    * NumberFormatException == > Quando voce digita um número fora do intervalo pedido ,exemplo ,digite um número de 1 a 10 ,e digita -1 */
    public static void main(String[] args){
        System.out.println("O programa realiza o tratamento de duas exeções");
        System.out.println("Digite (1) se deseja testar a exeção IllegalArgumentException");
        System.out.println("Digite (2) se deseja testar a exeção NumberFormatException");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        if (n == 1){
            int numero;
            try {
                System.out.println("Digite um número de 0 a 10");
                numero = teclado.nextInt();
                if(numero > 10 || numero < 0 ){
                    throw new IllegalArgumentException();
                }
            }catch(IllegalArgumentException e){
                System.out.println("Erro por ser fora do intervalo");
                System.out.println("Digite novamente de forma correta agora: ");
                numero = teclado.nextInt();
            }
            System.out.println("O programa corrigiu o problema mesmo voce mandando fora do intervalo pedido");
        }

        if (n == 2){
            try{
                System.out.println("Digite uma palavra :");
                String numero = teclado.next();
                int numeroConvertido = Integer.parseInt(numero);

                System.out.println("Se voce digitou um número no lugar da palavra ,vai passar aqui tranquilo : " + numeroConvertido);

            }catch(NumberFormatException e){
                System.out.println("Tentou passar a palavra para número ,resultando em um erro ,porém sendo tratado aqui");
            }
            System.out.println("Se está aparecendo isto ,mesmo com a palavra ,é devido ao try & catch ,que tratou o erro");
        }
    }
}

