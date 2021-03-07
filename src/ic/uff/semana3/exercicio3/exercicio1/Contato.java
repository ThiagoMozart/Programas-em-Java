package ic.uff.semana3.exercicio3.exercicio1;

public class Contato {
    private String nome;
    private String endereco;
    private String email;
    private int telefone;

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getEmail() {
        return this.email;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        if (telefone > 0) {
            this.telefone = telefone;

        }
    }
}
