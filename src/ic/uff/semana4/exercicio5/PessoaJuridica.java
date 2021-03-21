package ic.uff.semana4.exercicio5;

public class PessoaJuridica extends Pessoa {
    private  final String cnpj;
    private final double faturamento;

    public String getCnpj() {
        return cnpj;
    }

    public double getFaturamento() {
        return faturamento;
    }

    PessoaJuridica(String nome, String cnpj , String endereco , double faturamento){
        super(nome, endereco,Tipo.JURIDICA);
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }

    @Override
    public boolean ehFisica() {
        return !super.ehFisica();
    }
}