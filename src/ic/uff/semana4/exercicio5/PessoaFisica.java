package ic.uff.semana4.exercicio5;

public class PessoaFisica extends Pessoa {
    private final String cpf;
    private final String niver;

    public String getCpf() {
        return cpf;
    }

    public String getNiver() {
        return niver;
    }
    PessoaFisica(String nome, String cpf , String endereco , String niver){
        super(nome,endereco,Tipo.FISICA);
        this.cpf = cpf;
        this.niver = niver;
    }
}
