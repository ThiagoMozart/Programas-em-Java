package ic.uff.semana4.exercicio6;

public class Pokemon {

    private String aparencia;
    private float tamanho;
    private float peso;
    private String nome;
    private float stats;

    public void mostrarStats(){
        Stats estatos = new Stats();
        estatos.mostrarStats();
    }

    public void evoluir(){
        Stats estatos = new Stats();
        estatos.mudarStats();
    }
}
