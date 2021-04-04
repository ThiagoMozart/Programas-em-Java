package ic.uff.semana5.exercicio1;

public class Triangulo extends FormaGeometrica<Float> {

    @Override
    public void calcularArea(Float... base){
        area = (base[0] * base[1]) / 2;
    }

    @Override
    public void calcularPerimetro(Float... lado ){
        perimetro = lado[0] + lado[1] + lado[2];
    }
}
