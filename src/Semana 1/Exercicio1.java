import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número :");

        int n = teclado.nextInt();
        System.out.println("Digite " + n + " numeros:");
        int rep = 0;

        for (int i = 0 ; i < n ; i++ ){
            int numero = teclado.nextInt();
            if(numero < 0)
                rep++;
        }
        System.out.println("Apareceu "+ rep +" números negativos!");
    }
}
