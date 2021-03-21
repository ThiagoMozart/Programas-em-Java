package exercicio7;

import java.util.Scanner;

public class Mercado {
    Scanner teclado = new Scanner(System.in);
    Lista compras = new Lista();
    Produtos[] carrinho = new Produtos[100];
    int tam = 0;
    int tamanho = 0;

    void adicionar(int indice,int quantidade){
        Produtos itens = new Produtos();
        itens.nome = compras.lista[indice].nome;
        itens.estoque = quantidade;
        addCarrinho(itens);
    }

    void addCarrinho(Produtos produtos){
        carrinho[tam] = produtos;
        tam ++;
    }

    int itensPedidos(){

        System.out.println("Digite (0) se deseja parar de adicionar itens\n");
        double custo = 0.0;
        boolean d = true;

        while(d){
            System.out.println("Digite o número do item que voce quer adicionar: ");
            System.out.println("Feijão (1) | Arroz (2) | Café (3) | Leite (4) | Frutas (5) | Legumes (6)\n");
            int a = teclado.nextInt();

            verProdutos((a-1));
            System.out.println("Deseja adicionar quantos itens no seu carrinho?");

            int quant = teclado.nextInt();
            if (quant <= compras.lista[a-1].estoque){
                compras.lista[a-1].estoque = compras.lista[a-1].estoque - quant;
                custo = compras.lista[a-1].preco * quant;
                adicionar((a-1),quant);

            }
            else {
                System.out.println("--Não temos esse número de itens no estoque--");
            }

            System.out.println("Deseja fazer mais alguma compra?");
            System.out.println("Seu carrinho tem: ");

            printarCarrinho(tam);
            System.out.println("Digite (1) se sim | Digite (0) se deseja parar de adicionar itens");
            int aux = teclado.nextInt();
            if(aux == 0){
                d = false;
            }
        }
        int para;
        para = pagamento(custo);
        return para;
    }
    void printarCarrinho(int tamanho){
        for(int k = 0 ; k < tamanho  ; k++){
            System.out.println(carrinho[k].nome);
            System.out.println(carrinho[k].estoque);
        }
    }

    void verProdutos(int catalagos){
            System.out.println("Produto: " + compras.lista[catalagos].nome);
            System.out.println("Preço: R$" + compras.lista[catalagos].preco);
            System.out.println("Quantidade no estoque: " + compras.lista[catalagos].estoque);
    }

    int pagamento(double total){
        System.out.println("Voce deseja efetuar o pagamento de que maneira ?");
        System.out.println("Digite (1) para dinheiro | Digite (2) para cartão | Digite (3) para cheque");
        int paguei = teclado.nextInt();

        if(paguei == 1){
            System.out.println("Voce pagou em dinheiro: R$"+ total);
        }

        else if (paguei == 2){
            System.out.println("Digite (1) para crédito | Digite (2) para débito");
            int aux2 = teclado.nextInt();
            String senha;
            System.out.println("Digite a sua senha: ");
            senha = teclado.next();
            System.out.println("Voce pagou pelo cartão: R$"+ total);
        }

        else{
            String assi;
            System.out.println("Assine o seu cheque por favor: ");
            assi = teclado.next();
            System.out.println("Voce pagou pelo cheque: R$"+ total);
        }
        return 0;
    }
}