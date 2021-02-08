public class Exercicio6 {
    public static void main(String[] args){
        int fibonacci = 0;
        int ant = 1;
        int atual = 1;
        System.out.print("0 1 1 ");

        while(fibonacci < 89){
            fibonacci= ant + atual;
            System.out.print(fibonacci + " ");
            ant = atual;
            atual = fibonacci;
        }
    }
}
