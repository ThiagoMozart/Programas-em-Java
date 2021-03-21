package exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Mercado pedidos = new Mercado();
        Scanner teclado = new Scanner(System.in);
        boolean aux = true;

        for(int i = 0 ; i < 6 ; i++){
            Produtos item = new Produtos();
            pedidos.compras.addProdutos(item,pedidos.tamanho);
            pedidos.tamanho++;
        }

        pedidos.compras.listaDeCompras();
        System.out.println("Boa tarde ,bem vindo ao Mercadinho BIG BooM\n");

        System.out.println("Esse é o catálogo: \n");
        pedidos.compras.catalogo();

        while(aux){

            System.out.println("Digite (1) para comprar | Digite (0) para finalizar as compras ");
            int n = teclado.nextInt();
            if(n == 1){
                n = pedidos.itensPedidos();
                if(n == 0){
                    System.out.println("Obrigado por comprar no Mercadinho BIG BooM , volte sempre!");
                    aux = false;
                }
            }
            else{
                System.out.println("Obrigado por comprar no Mercadinho BIG BooM , volte sempre!");
                aux = false;
            }
        }
    }
}
