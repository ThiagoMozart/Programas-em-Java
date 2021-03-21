package ic.uff.semana4.exercicio4;

public class Circulo extends FiguraGeometrica {
    Circulo (float raio){
        super(raio);
    }
    @Override
    void fazerArea() {
        setArea(3*(getRaio() * getRaio()));
    }
}
