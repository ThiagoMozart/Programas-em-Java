package ic.uff.semana5.exercicio1;

public class Quadrado extends Retangulo {

    public void calcularArea(float lado) {
        super.calcularArea(lado,lado);
    }

    public void calcularPerimetro(float lado) {
        super.calcularPerimetro(lado, lado);
    }
}
