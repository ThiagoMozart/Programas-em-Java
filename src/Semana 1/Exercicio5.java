import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número : ");
        int n = teclado.nextInt();
        long fatorial = 1;

        if (n < 0)
            System.out.println("-1");

        else if (n == 0)
            System.out.println("O fatorial do seu número é : " + fatorial);

        else {
            do {
                fatorial *= n--;
            } while (n > 0);

            System.out.println("O fatorial do seu número é : " + fatorial);

        }
    }
}
