package ic.uff.semana4.exercicio3;

public class Pessoa {

    private String nome;
    private int idade;
    private String pai;
    private String mae;

    Pessoa(String nome , int idade ,String pai ,String mae){
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getMae() {
        return mae;
    }
    public String getPai() {
        return pai;
    }
}
