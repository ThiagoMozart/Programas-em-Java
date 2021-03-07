package ic.uff.semana3.exercicio3.exercicio2;

public class Pessoa {
    private String nome;
    private int idade;

    void aniversario(int parabens){
        idade = idade + parabens;

    }
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

