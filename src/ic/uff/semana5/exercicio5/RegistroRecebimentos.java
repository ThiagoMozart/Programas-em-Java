package ic.uff.semana5.exercicio5;

import ic.uff.semana5.exercicio2.Bicicleta;
import ic.uff.semana5.exercicio2.Carro;
import ic.uff.semana5.exercicio2.Construcao;
import ic.uff.semana5.exercicio2.carbonFootPrint;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RegistroRecebimentos {
    public static void main(String[] args) {

        List<Recebivel> registro = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo a loja de manuntenção e venda de produtos de informática");
        System.out.println("Como posso ajudar?");
        System.out.println("Se procura o serviço de consertar seu equipamento digite (1):");
        System.out.println("Se deseja comprar algum produto digite (2): \n");

        int n = teclado.nextInt();
        while (n != 0) {
            if (n == 1) {
                System.out.println("Descreva a situação de seu produto");
                String descricao = teclado.next();
                Random gerador = new Random();
                int horas = gerador.nextInt(24);
                Servico servico = new Servico(descricao, horas, 32.20);
                registro.add(servico);

            } else if (n == 2) {
                System.out.println("Qual é o produto que voce deseja comprar?");
                System.out.println("computador / mouse / teclado / monitor / peças");
                ItemVenda itemVenda = new ItemVenda();
                itemVenda.setProduto(teclado.next());

                switch (itemVenda.getProduto()) {
                    case "computador" -> {
                        itemVenda.setPrecoUnitario(2549.99);
                        System.out.println("Quantidade?");
                        itemVenda.setQuantidade(teclado.nextInt());
                        itemVenda.totalizarReceita();
                        registro.add(itemVenda);
                    }
                    case "mouse" -> {
                        itemVenda.setPrecoUnitario(133.99);
                        System.out.println("Quantidade?");
                        itemVenda.setQuantidade(teclado.nextInt());
                        itemVenda.totalizarReceita();
                        registro.add(itemVenda);
                    }
                    case "teclado" -> {
                        itemVenda.setPrecoUnitario(204.28);
                        System.out.println("Quantidade?");
                        itemVenda.setQuantidade(teclado.nextInt());
                        itemVenda.totalizarReceita();
                        registro.add(itemVenda);
                    }
                    case "monitor" -> {
                        itemVenda.setPrecoUnitario(505.79);
                        System.out.println("Quantidade?");
                        itemVenda.setQuantidade(teclado.nextInt());
                        itemVenda.totalizarReceita();
                        registro.add(itemVenda);
                    }
                    case "peças" -> {
                        itemVenda.setPrecoUnitario(53.32);
                        System.out.println("Quantidade?");
                        itemVenda.setQuantidade(teclado.nextInt());
                        itemVenda.totalizarReceita();
                        registro.add(itemVenda);
                    }
                }
            }

            System.out.println("Quer mais alguma coisa?");
            System.out.println("Se procura consertar seu equipamento digite (1):");
            System.out.println("Se deseja comprar algum produto digite (2): ");
            System.out.println("Se já está satisfeito ,digite (0): ");
            n = teclado.nextInt();
        }

        System.out.println("\nAgora veja o seus registros na loja:\n");
        double soma = 0;
        for (Recebivel percorre : registro) {
            soma += percorre.totalizarReceita();
            if (percorre instanceof Servico) {
                double soma1 = 0.0;
                soma1 += percorre.totalizarReceita();
                System.out.println("O seu serviço teve a descrição de : " + ((Servico) percorre).getDescricao());
                System.out.println("E teve duração de : " + ((Servico) percorre).getHoras() + " horas");
                System.out.println("Custando por hora : R$" + ((Servico) percorre).getPrecoHora());
                System.out.println("Tendo um preço total de : R$" + soma1 + "\n");

            }
            if (percorre instanceof ItemVenda) {
                double soma2 = 0.0;
                soma2 += percorre.totalizarReceita();
                System.out.println("Voce comprou o item: " + ((ItemVenda) percorre).getProduto() + " (" + ((ItemVenda) percorre).getQuantidade() + " unidades)");
                System.out.println("Que tem um preço de : R$" + ((ItemVenda) percorre).getPrecoUnitario());
                System.out.println("Tendo um preço total de : R$" + soma2 + "\n");

            }
        }
        System.out.println("O total de gasto na loja foi de : R$" + soma);
    }
}

