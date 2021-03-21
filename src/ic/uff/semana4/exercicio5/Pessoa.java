package ic.uff.semana4.exercicio5;

public abstract class Pessoa {
    private final Tipo tipo;
    private final String nome;
    private final String endereco;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public Tipo getTipo(){
        return tipo;
    }

    Pessoa(String nome , String endereco, Tipo tipo){
        this.nome = nome;
        this.endereco = endereco;
        this.tipo = tipo;
    }

    public boolean ehFisica(){
        return true;
    }

}
