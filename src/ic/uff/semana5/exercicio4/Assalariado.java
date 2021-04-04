package ic.uff.semana5.exercicio4;

public class Assalariado extends Funcionario{
    Assalariado(){
        super();
    }
    @Override
    public void salario(){
        setSalario(getSalarioFixo());
    }
}
