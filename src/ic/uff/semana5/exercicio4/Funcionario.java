package ic.uff.semana5.exercicio4;

public abstract class Funcionario {
    private double salario;
    private final double SALARIO_FIXO = 950;
    private int horas_trab;
    private float venda;
    Funcionario(){

    }

    Funcionario(int horas_trab){
        this.horas_trab = horas_trab;
    }

    Funcionario(float venda){
        this.venda = venda;
    }

    public double getSalario() {
        return salario;
    }

    public double getSalarioFixo() {
        return SALARIO_FIXO;
    }

    public int getHoras_trab() {
        return horas_trab;
    }

    public float getVenda() {
        return venda;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void salario(){
    }
}
