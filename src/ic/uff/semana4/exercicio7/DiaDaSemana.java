package ic.uff.semana4.exercicio7;

public class DiaDaSemana {
    private DiasDaSemana status;

    public DiasDaSemana getStatus(){
        return status;
    }

    public void setStatus(DiasDaSemana status){
        this.status = status;
    }

    public boolean ehDiaUtil(){
        if(this.getStatus() == DiasDaSemana.SEGUNDA){
            return true;
        }
        if(this.getStatus() == DiasDaSemana.TERCA){
            return true;
        }
        if(this.getStatus() == DiasDaSemana.QUARTA) {
            return true;
        }
        if(this.getStatus() == DiasDaSemana.QUINTA) {
            return true;
        }
        if(this.getStatus() == DiasDaSemana.SEXTA) {
            return true;
        }
        return false;
    }

}
