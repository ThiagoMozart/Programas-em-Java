package ic.uff.semana5.exercicio2;

public class Carro implements carbonFootPrint{
    private String combustivel;
    private float motor;
    private float quilometragem;
    private double carbonFootPrint;


    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public double getCarbonFootPrint() {
        double total = 0;
        switch (getCombustivel()) {
            case "Etanol":
                if ((getMotor() >= 1.0) && (getMotor() <= 1.5)) {
                    total = (0.14 * (getQuilometragem())) / 100;
                } else if ((getMotor() >= 1.6) && (getMotor() <= 2.0)) {
                    total = (0.19 * (getQuilometragem())) / 100;
                } else if ((getMotor() > 2.0)) {
                    total = (0.29 * (getQuilometragem())) / 100;
                }
                break;
            case "Gasolina":
                if ((getMotor() >= 1.0) && (getMotor() <= 1.5)) {
                    total = (12.8 * (getQuilometragem())) / 100;
                } else if ((getMotor() >= 1.6) && (getMotor() <= 2.0)) {
                    total = (16.9 * (getQuilometragem())) / 100;
                } else if ((getMotor() > 2.0)) {
                    total = (24.7 * (getQuilometragem())) / 100;
                }
                break;

            case "Diesel":
                if ((getMotor() >= 1.0) && (getMotor() <= 1.5)) {
                    total = (0.02 * (getQuilometragem())) / 100;
                } else if ((getMotor() >= 1.6) && (getMotor() <= 2.0)) {
                    total = (0.05 * (getQuilometragem())) / 100;
                } else if ((getMotor() > 2.0)) {
                    total = (22.4 * (getQuilometragem())) / 100;
                }
                break;
        }
        this.carbonFootPrint = total;
        return carbonFootPrint;
    }
}
