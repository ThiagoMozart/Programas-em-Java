package ic.uff.semana5.exercicio5;

public class Servico implements Recebivel{

    private String descricao;
    private int horas;
    private final double precoHora;

    Servico( String descricao , int horas , double precoHora){
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getHoras() {
        return horas;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    @Override
    public double totalizarReceita() {
        return this.horas * this.precoHora;

    }
}
