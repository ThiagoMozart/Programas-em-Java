import java.util.Scanner;

public class Exercicio8 {
    public static boolean ehQuadradoMagico(int [][] matriz){
        int soma = 0;
        int somaComparacao = 0;
        for(int i = 0 ; i < matriz.length ; i++){
            soma = soma + matriz[0][i];
        }

        for(int i = 1 ; i < matriz.length ; i ++){
            somaComparacao = 0;

            for(int j = 0 ; j < matriz[i].length ;j++){
                somaComparacao = somaComparacao + matriz[i][j];
            }
            if(somaComparacao != soma)
                return false;
        }

        for(int i = 0 ; i <matriz[0].length ; i++){
            somaComparacao = 0;
            for(int j = 0 ; j < matriz.length ; j++){
                somaComparacao = somaComparacao + matriz[j][i];
            }
            if(somaComparacao != soma)
                return false;
        }
        somaComparacao = 0;
        for(int i = 0 ; i < matriz.length ; i++){
            somaComparacao = somaComparacao + matriz[i][i];
        }
        if(somaComparacao != soma )
            return false;

        somaComparacao = 0;
        int linha = 0;
        for(int j = matriz.length - 1 ; j >= 0 ; j--){
            somaComparacao = somaComparacao + matriz[linha][j];
            linha++;
        }
        if(somaComparacao != soma ) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a ordem de sua matriz : ");
        int n = teclado.nextInt();

        int [][] matriz = new int[n][n];
        System.out.println("Digite os valores de sua matriz : ");

        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ;j < n ;j++){
                int valor = teclado.nextInt();
                matriz[i][j] = valor;
            }
        }

        if(ehQuadradoMagico(matriz)){
            System.out.println("É um quadrado mágico!");
        }
        else{
            System.out.println("Não é um quadrado mágico!");
        }
    }
}