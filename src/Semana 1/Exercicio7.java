import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int total=0;
        double pessimas=0;
        double ruins=0;
        double boas=0;
        double otimas=0;

        System.out.println("Digite um valor de 0 - 100 para avaliar a qualidade das refeições : ");
        int valor = teclado.nextInt();

        System.out.println("Se quiser parar ,digite um valor fora de 0 - 100 : ");

        while((valor >= 0) && (valor <=100)) {

           if ((valor <= 25)) {
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
            valor = teclado.nextInt();
        }
        pessimas = ((pessimas/total)* 100);
        ruins = ((ruins/total)* 100);
        boas = ((boas/total)* 100);
        otimas = ((otimas/total)* 100);

        System.out.printf("A porcentagem de funcionarios que votou na faixa de Pessimas é : %.2f",pessimas);
        System.out.println("%");
        System.out.printf("A porcentagem de funcionarios que votou na faixa de Ruins é : %.2f",ruins);
        System.out.println("%");
        System.out.printf("A porcentagem de funcionarios que votou na faixa de Boas é : %.2f",boas);
        System.out.println("%");
        System.out.printf("A porcentagem de funcionarios que votou na faixa de Ótimas é : %.2f",otimas);
        System.out.println("%");
    }
}
