package ic.uff.semana5.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaDasAreas {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        List<FormaGeometrica<Float>> soma = new ArrayList<>();

        System.out.println("Olá , voce deseja adicionar quais formas geométricas a sua lista?\n");
        System.out.println("Digite (1) para adicionar um quadrado");
        System.out.println("Digite (2) para adicionar um retângulo");
        System.out.println("Digite (3) para adicionar um triângulo");
        System.out.println("Digite (4) para adicionar um círculo");
        System.out.println("Digite (0) para parar de adicionar");

        int n = teclado.nextInt();

        while(n!=0) {

            if (n == 1) {
                Quadrado quadrado = new Quadrado();
                System.out.println("Digite a medida do seu quadrado(Lado):\n");
                float medida = teclado.nextFloat();

                quadrado.calcularArea(medida);
                quadrado.calcularPerimetro(medida);
                soma.add(quadrado);
            }
            if (n == 2) {
                Retangulo retangulo = new Retangulo();
                System.out.println("Digite a medida do seu retângulo(lado 1, lado 2)\n");
                float medida1 = teclado.nextFloat();
                float medida2 = teclado.nextFloat();

                retangulo.calcularArea(medida1, medida2);
                retangulo.calcularPerimetro(medida1, medida2);
                soma.add(retangulo);
            }
            if (n == 3) {
                Triangulo triangulo = new Triangulo();
                System.out.println("Digite a medida do seu triângulo(base ,lado 2, lado 3 e altura)\n");
                float base = teclado.nextFloat();
                float lado2 = teclado.nextFloat();
                float lado3 = teclado.nextFloat();
                float altura = teclado.nextFloat();

                triangulo.calcularArea(base, altura);
                triangulo.calcularPerimetro(base, lado2 ,lado3);
                soma.add(triangulo);
            }
            if (n == 4) {
                Circulo circulo = new Circulo();
                System.out.println("Digite a medida do seu círculo(raio)\n");
                float raio = teclado.nextFloat();

                circulo.calcularArea(raio);
                circulo.calcularPerimetro(raio);
                soma.add(circulo);
            }

            System.out.println("Digite (1) para adicionar um quadrado");
            System.out.println("Digite (2) para adicionar um retângulo");
            System.out.println("Digite (3) para adicionar um triângulo");
            System.out.println("Digite (4) para adicionar um círculo");
            System.out.println("Digite (0) para parar de adicionar");
            n = teclado.nextInt();
        }

        System.out.println("Agora:\n");
        System.out.println("Digite (1) para calcular a soma das áreas adicionadas na lista");
        System.out.println("Digite (2) para calcular a soma dos perímetros adicionados na lista\n");
        int m = teclado.nextInt();

        if(m == 1){
            float somaA = 0;

            for(FormaGeometrica<Float> i : soma){
                somaA += i.getArea();
            }
            System.out.println("A soma das áreas é :");
            System.out.println(somaA);
        }
        if(m == 2){
            float somaP = 0;

            for(FormaGeometrica<Float> j : soma){
                somaP += j.getPerimetro();
            }
            System.out.println("A soma das perimetros é :");
            System.out.println(somaP);
        }
    }
}