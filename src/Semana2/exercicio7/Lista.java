package exercicio7;

import java.util.Scanner;

public class Lista {
    Scanner teclado = new Scanner(System.in);
    Produtos produtos = new Produtos();
    Produtos [] lista = new Produtos[6];
    String [] listaCompras = {"feijão","arroz","café","leite","frutas","legumes"};
    int tamanho = 0;

    void addProdutos(Produtos produtos,int tamanho){
        lista[tamanho] = produtos;
    }

    void listaDeCompras(){
        int aux = 0;
        for(int i = 0 ; i < 6 ; i++){
                definirProdutos(aux++,i);
        }
    }

    void definirProdutos(int aux,int i){
        switch (i){
            case 0:
                lista[aux].estoque = 10;
                lista[aux].nome = listaCompras[i];
                lista[aux].preco = 5.60;
                break;
            case 1:
                lista[aux].estoque = 12;
                lista[aux].nome = listaCompras[i];
                lista[aux].preco = 10.45;
                break;
            case 2:
                lista[aux].estoque = 30;
                lista[aux].nome = listaCompras[i];
                lista[aux].preco = 4.10;
                break;
            case 3:
                lista[aux].estoque = 6;
                lista[aux].nome = listaCompras[i];
                lista[aux].preco = 12.99;
                break;
            case 4:
                lista[aux].estoque = 15;
                lista[aux].nome = listaCompras[i];
                lista[aux].preco = 2.99;
                break;
            default:
                lista[aux].estoque = 15;
                lista[aux].nome = listaCompras[i];
                lista[aux].preco = 6.35;
        }
    }
    void catalogo(){
        for(int g = 0 ;g < 6 ;g++){
            System.out.println("Produto: " + lista[g].nome);
            System.out.println("Preco: R$" + lista[g].preco);
            System.out.println("Está disponível: " + lista[g].estoque);
            System.out.println();
        }
    }
}