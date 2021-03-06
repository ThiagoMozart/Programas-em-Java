package ic.uff.semana4.exercicio9;

public class Retangulo extends FormaGeometrica<Float>{

    @Override
    public void calcularArea(Float... lado ){
        area = lado[0] * lado[1];
    }

    @Override
    public void calcularPerimetro(Float... lado){
        perimetro = (2 * lado[0]) + (2 * lado[1]);
    }
}
