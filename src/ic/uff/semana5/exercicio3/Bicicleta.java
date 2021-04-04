package ic.uff.semana5.exercicio3;

public class Bicicleta implements carbonFootPrint {
    private float mediaDeKm;

    public double getMediaDeKm() {
        return mediaDeKm;
    }
    public void setMediaDeKm(float mediaDeKm) {
        this.mediaDeKm = mediaDeKm;
    }
    @Override
    public double getCarbonFootPrint() {
        return getMediaDeKm() * 0;
    }
}
