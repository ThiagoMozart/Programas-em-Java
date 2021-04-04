package ic.uff.semana5.exercicio3;

public class Escola extends Edificio{
    private int numSalas;
    private int numFuncionarios;
    private int numEstudantes;

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumEstudantes() {
        return numEstudantes;
    }

    public void setNumEstudantes(int numEstudantes) {
        this.numEstudantes = numEstudantes;
    }

    public int getNumSalas() {
        return numSalas;
    }

    public void setNumSalas(int numSalas) {
        this.numSalas = numSalas;
    }

    @Override
    public double getCarbonFootPrint() {
        float variavel = 0.0F;

        if (isEnergiaRenovavel() && isUsoArCond()){
            variavel = 5.0F;
        }
        else if (!isEnergiaRenovavel() && !isUsoArCond()){
            variavel = 0.8F;
        }
        else if (isEnergiaRenovavel() ^ isUsoArCond()){
            variavel = 2.0F;
        }
        return variavel * (getNumLampadas() * getNumEstudantes() * getNumFuncionarios() * getNumSalas());
    }
}

