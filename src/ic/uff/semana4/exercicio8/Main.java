package ic.uff.semana4.exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Voce tem dois pares de objetos genéricos");
        System.out.println("Defina o tipo deles\n");
        System.out.println("Digite:");
        System.out.println("(1) Para o primeiro ser inteiro e o segundo String");
        System.out.println("(2) Para o primeiro ser double e o segundo inteiro");
        System.out.println("(3) Para o primeiro ser float e o segundo ser livre");

        int escolha = teclado.nextInt();

        if(escolha == 1){
            System.out.println("Digite os valores dos seus pares :");
            System.out.println("Sendo eles inteiro e String respectivamente\n");
            Par<Integer , String> pares = new Par<Integer , String>(teclado.nextInt(), teclado.next());
            System.out.println("O valor do primeiro do par é: " + pares.getPrimeiro());
            System.out.println("O valor do segundo do par é: " + pares.getSegundo());

        }

        if(escolha == 2){
            System.out.println("Digite os valores dos seus pares :");
            System.out.println("Sendo eles double e inteiro respectivamente\n");
            Par<Double ,Integer> pares = new Par<Double ,Integer>(teclado.nextDouble(), teclado.nextInt());
            System.out.println("O valor do primeiro do par é: " + pares.getPrimeiro());
            System.out.println("O valor do segundo do par é: " + pares.getSegundo());

        }

        if(escolha == 3){
            System.out.println("Digite os valores dos seus pares :");
            System.out.println("Sendo eles float e livre respectivamente\n");
            Par<Float,Comparable> pares = new Par<Float ,Comparable>(teclado.nextFloat(), teclado.next());
            System.out.println("O valor do primeiro do par é: " + pares.getPrimeiro());
            System.out.println("O valor do segundo do par é: " + pares.getSegundo());

        }
    }
}
