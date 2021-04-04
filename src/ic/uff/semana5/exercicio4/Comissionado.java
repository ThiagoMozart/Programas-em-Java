package ic.uff.semana5.exercicio4;

public class Comissionado extends Funcionario {
    Comissionado(float venda){
        super(venda);
    }
    @Override
    public void salario(){
        setSalario(getVenda() * (getSalarioFixo() * 0.01));
    }

}
