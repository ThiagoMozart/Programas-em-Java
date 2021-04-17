package ic.uff.semana6.exercicio2;

public class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;

    ContaCorrente(){
        this.limite = 1500;
        this.saldo = 1000;
        this.valorLimite = 2000;
    }

    public float getSaldo() {
        return saldo;
    }

    public void sacar(float valor){

        if(valor > 0 && valor < this.valorLimite && valor < this.saldo){
            this.saldo = this.saldo - valor;
        }
        else if (valor < 0){
            throw  new IllegalArgumentException("Voce tentou sacar um valor negativo");
        }
        else if (valor > this.valorLimite){
            throw new IllegalArgumentException("Seu saque foi maior que o limite permitido");
        }
        else if (this.saldo - valor < 0){
            throw new IllegalArgumentException("Seu saque não pode ser feito ,por insuficiência monetária");
        }
    }

    public void depositar(float valor) {
        if(valor > 0){
             this.saldo = this.saldo + valor ;
        }

        else if (valor < 0) {
            throw new IllegalArgumentException("Voce tentou depositar um valor negativo");
        }
    }

    public void setValorLimite(float valorLimite){
        this.valorLimite = valorLimite;
    }
}
