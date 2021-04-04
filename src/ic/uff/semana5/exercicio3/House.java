package ic.uff.semana5.exercicio3;

public class House extends Edificio{
    private int moradores;
    private int numAparelhoDomestico;

    public int getMoradores() {
        return moradores;
    }

    public void setMoradores(int moradores) {
        this.moradores = moradores;
    }

    public int getNumAparelhoDomestico() {
        return numAparelhoDomestico;
    }

    public void setNumAparelhoDomestico(int numAparelhoDomestico) {

        this.numAparelhoDomestico = numAparelhoDomestico;
    }

    @Override
    public double getCarbonFootPrint() {
        float variavel = 0.0F;

        if((isEnergiaRenovavel()) && (isUsoArCond())){
            variavel = 5.0F;
        }
        else if((!isEnergiaRenovavel()) && (!isUsoArCond())){
            variavel = 0.8F;
        }
        else if (isEnergiaRenovavel() ^ isUsoArCond()){
            variavel = 2.0F;
        }
        return variavel * getNumLampadas() * getMoradores() * getNumAparelhoDomestico();
    }
}