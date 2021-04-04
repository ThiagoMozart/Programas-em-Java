package ic.uff.semana5.exercicio4;

public class ComissioEfixo extends Funcionario{
    ComissioEfixo(float venda){
        super(venda);
    }

    @Override
    public void salario() {
        setSalario(getSalarioFixo() + (getVenda() * (getSalarioFixo() * 0.01)));
    }
}
