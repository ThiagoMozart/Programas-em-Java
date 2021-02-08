import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite três números : ");

        float r = teclado.nextFloat();
        float s = teclado.nextFloat();
        float t = teclado.nextFloat();

        if((r > s) && (r > t))
            System.out.println("O maior número é o R(" + r +")" );

        else if((s > r) && (s > t))
            System.out.println("O maior número é o S(" + s +")" );

        else if((t > r) && (t > s))
            System.out.println("O maior número é o T(" + t +")" );

        else if((r == s) && (r == t))
            System.out.println("Todos os números são iguais e valem (" + r +")" );

        else if((r == s) && (r > t))
            System.out.println("R e S são os maiores números e valem (" + r +")" );

        else if((r == t) && (r > s))
            System.out.println("R e T são os maiores números e valem (" + r +")" );

        else if((s == t) && (s > r))
            System.out.println("R e T são os maiores números e valem (" + s +")" );

        }
    }

