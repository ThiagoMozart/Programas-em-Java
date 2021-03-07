package ic.uff.semana3.exercicio3.exercicio4;

public class Casa {
    private String cor;
    Portas[] quantidade = new Portas[3];
    int tamanho = 0;

    void adicionar(Portas porta){
        quantidade[tamanho] = porta;
        tamanho++;
    }

    void AbrirFechar(int n){
        if(quantidade[n-1].getModo() == false){
            quantidade[n-1].setModo(true);
        }
        else if(quantidade[n-1].getModo() == true){
            quantidade[n-1].setModo(false);
        }
    }

    void QuantasPortasEstaoAbertas(){
        int aux = 0;
        for(int i = 0; i < 3 ;i++){
            if(quantidade[i].getModo()){
                aux++;
            }
        }
        System.out.println("Tem " + aux + " portas abertas.");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}