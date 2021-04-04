package ic.uff.semana5.exercicio4;

public class PorHora extends Funcionario{
    PorHora(int horas_trab){
        super(horas_trab);
    }

    @Override
    public void salario()  {
        int horaExtra = getHoras_trab() - 40;
        double taxaPorHora = getSalarioFixo()/40;

        if (getHoras_trab() > 40) {
             setSalario(((horaExtra) * 1.5 * taxaPorHora) + getSalarioFixo());

        }
            setSalario(getHoras_trab() * taxaPorHora);

    }
}
