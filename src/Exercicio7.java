import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de funcionarios : ");

        int total=0;
        int pessimas=0;
        int ruins=0;
        int boas=0;
        int otimas=0;
        int n = teclado.nextInt();

        System.out.println("Digite um valor de 0 - 100 para avaliar a qualidade das refeições : ");
        int valor = teclado.nextInt();

        while(true) {

           if ((valor >= 0) && (valor <= 25)) {
               pessimas = pessimas + 1;
               total = total +1;
           }

           else if ((valor > 25) && (valor <= 50)) {
               ruins = ruins + 1;
               total = total +1;
           }

           else if ((valor > 50) && (valor <= 75)) {
               boas = boas + 1;
               total = total +1;
           }

           else if ((valor > 75) && (valor <= 100)) {
               otimas = otimas +1;
               total = total +1;
           }

            else{
                break;
           }

            valor = teclado.nextInt();
        }
        pessimas = (pessimas/total )* 100;
        ruins = (ruins/total )* 100;
        boas = (boas/total )* 100;
        otimas = (otimas/total )* 100;

        System.out.println("A porcentagem de funcionarios que votou na faixa de Pessimas é : " + pessimas + "%");
        System.out.println("A porcentagem de funcionarios que votou na faixa de Ruins é : " + ruins + "%");
        System.out.println("A porcentagem de funcionarios que votou na faixa de Boas é : " + boas + "%");
        System.out.println("A porcentagem de funcionarios que votou na faixa de Ótimas é : " + otimas + "%");
    }
}
