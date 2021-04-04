package ic.uff.semana5.exercicio6;
public class RepresentaInfo {

    private final int dia;
    private final double tempMin;
    private final double tempMax;
    private final int nivelPluvi;

    RepresentaInfo(int dia , double tempMin , double tempMax , int nivelPluvi){
        this.dia = dia;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.nivelPluvi = nivelPluvi;
    }

    public int getDia() {
        return dia;
    }
    public double getTempMax() {
        return tempMax;
    }
    public double getTempMin() {
        return tempMin;
    }
    public int getNivelPluvi() {
        return nivelPluvi;
    }

}
