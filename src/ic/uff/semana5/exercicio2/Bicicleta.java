package ic.uff.semana5.exercicio2;

public class Bicicleta implements carbonFootPrint {
    private float mediaDeKm;
    private double carbonFootPrint;

    public double getMediaDeKm() {
        return mediaDeKm;
    }

    public void setMediaDeKm(float mediaDeKm) {
        this.mediaDeKm = mediaDeKm;
    }

    @Override
    public double getCarbonFootPrint() {
        carbonFootPrint = getMediaDeKm() * 0;
        return carbonFootPrint;
    }
}
