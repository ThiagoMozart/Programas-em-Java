package ic.uff.semana3.exercicio3.exercicio3;

public class Porta {
   private int largura;
    private int altura;
    private String cor;
    private boolean abertura;

    public int getLargura(){
        return this.largura;
    }
    public int getAltura(){
        return this.altura;
    }
    public String getCor(){
        return this.cor;
    }
    public boolean getAbertura(){
        return this.abertura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAbertura(boolean abertura) {
        this.abertura = abertura;
    }
}

