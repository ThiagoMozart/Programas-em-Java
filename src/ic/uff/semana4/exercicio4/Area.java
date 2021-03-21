package ic.uff.semana4.exercicio4;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor de uma base ,uma altura e um raio:");
        float baseUsuario = teclado.nextFloat();
        float alturaUsuario = teclado.nextFloat();
        float raioUsuario = teclado.nextFloat();

        if (baseUsuario == alturaUsuario) {
            Quadrado quadrado = new Quadrado(baseUsuario, alturaUsuario);
            System.out.println("A área do quadrado é : " + quadrado.getArea());

            Triangulo triangulo = new Triangulo(baseUsuario , alturaUsuario);
            System.out.println("E a área do triângulo é : " + (triangulo.getArea() / 2));

            Circulo circulo = new Circulo(raioUsuario);
            System.out.println("E finalmente a área do seu círculo é : " + circulo.getArea());

        }
        else{
            Retangulo retangulo = new Retangulo(baseUsuario, alturaUsuario);
            System.out.println("A área do retângulo é : " + retangulo.getArea());

            Triangulo triangulo = new Triangulo(baseUsuario , alturaUsuario);
            System.out.println("E a área do triângulo é : " + (triangulo.getArea() / 2));

            Circulo circulo = new Circulo(raioUsuario);
            System.out.println("E finalmente a área do seu círculo é : " + circulo.getArea());

        }
    }
}
