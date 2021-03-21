package ic.uff.semana4.exercicio4;

public class FiguraGeometrica {

    private float base;
    private float altura;
    private float raio;
    private float area;

    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }

    public float getRaio() {
        return raio;
    }

    public float getArea() {
        return area;
    }

    void setArea(float area){
        this.area = area;
    }

    FiguraGeometrica (float base ,float altura){
        this.base = base;
        this.altura = altura;
        fazerArea();
    }

    FiguraGeometrica (float raio){
        this.raio = raio;
        fazerArea();
    }

    void fazerArea(){
        this.area = base * altura;
    }
}
