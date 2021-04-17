package ic.uff.semana6.exercicio3;

public class Cliente {
    private String nome;
    private long cpf;
    private int idade;

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) throws DadoInvalidoException {
        this.nome = nome;
    }

    public void setCpf(String cpf) throws DadoInvalidoException {
        try{
            this.cpf = Long.parseLong(cpf);
        }catch(NumberFormatException e){
            throw new DadoInvalidoException();
        }
    }

    public void setIdade(String idade) throws DadoInvalidoException {
        try{
            this.idade = Integer.parseInt(idade);
        }catch (NumberFormatException e){
            throw new DadoInvalidoException();
        }
    }
}
