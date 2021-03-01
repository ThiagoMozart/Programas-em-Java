public class Exercicio6 {
    public static void main(String[] args){
        int fibonacci = 1;
        int ant = 1;
        int atual = 1;
        System.out.print("0 1 ");

        do{
            System.out.print(fibonacci + " ");
            fibonacci= ant + atual;
            ant = atual;
            atual = fibonacci;
        }while(fibonacci < 100);
    }
}
