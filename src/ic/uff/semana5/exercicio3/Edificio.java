package ic.uff.semana5.exercicio3;

public abstract class Edificio implements carbonFootPrint {
    private boolean energiaRenovavel;
    private int numLampadas;
    private boolean usoArCond;

    public int getNumLampadas() {
        return numLampadas;
    }
    public void setNumLampadas(int numLampadas) {
        this.numLampadas = numLampadas;
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
}