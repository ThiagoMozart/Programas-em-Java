package ic.uff.semana5.exercicio5;

public class ItemVenda implements Recebivel{

    private String produto;
    private int quantidade;
    private double precoUnitario;

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public double totalizarReceita() {
        return this.precoUnitario * this.quantidade;
    }
}
