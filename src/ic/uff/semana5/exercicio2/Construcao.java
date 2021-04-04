package ic.uff.semana5.exercicio2;

public class Construcao implements carbonFootPrint{
    private int numPessoas;
    private boolean energiaRenovavel;
    private int numLampadas;
    private boolean usoArCond;
    private double carbonFootPrint;

    public int getNumLampadas() {
        return numLampadas;
    }

    public void setNumLampadas(int numLampadas) {
        this.numLampadas = numLampadas;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public boolean isEnergiaRenovavel() {
        return energiaRenovavel;
    }

    public void setEnergiaRenovavel(boolean energiaRenovavel) {
        this.energiaRenovavel = energiaRenovavel;
    }

    public boolean isUsoArCond() {
        return usoArCond;
    }

    public void setUsoArCond(boolean usoArCond) {
        this.usoArCond = usoArCond;
    }

    @Override
    public double getCarbonFootPrint() {
        if((this.energiaRenovavel) && (this.usoArCond)){
            this.carbonFootPrint = (5.0 * getNumLampadas() * getNumPessoas());
            return carbonFootPrint;
        }
        else if((this.energiaRenovavel) && (!this.usoArCond)){
            carbonFootPrint = (2.0 * getNumLampadas() * getNumPessoas());
            return carbonFootPrint;
        }
        else if((!this.energiaRenovavel) && (this.usoArCond)){
            carbonFootPrint = (2.0 * getNumLampadas() * getNumPessoas());
            return carbonFootPrint;
        }
        else if((!this.energiaRenovavel) && (!this.usoArCond)){
            carbonFootPrint = ( 0.8 * getNumLampadas() * getNumPessoas());
            return carbonFootPrint;
        }
        return carbonFootPrint;
    }
}

