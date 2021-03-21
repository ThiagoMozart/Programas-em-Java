package ic.uff.semana4.exercicio9;

public class Circulo extends FormaGeometrica<Float> {

    @Override
    public void calcularArea(Float... raio){
       area = (3 * (raio[0] * raio[0]));
    }

    @Override
    public void calcularPerimetro(Float... raio){
        perimetro = 2 * (3 * raio[0]);
    }
}
