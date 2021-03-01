package exercicio4;

public class Casa {
    String cor;
    Portas[] quantidade = new Portas[3];
    int tamanho = 0;

    void adicionar(Portas porta){
        quantidade[tamanho] = porta;
        tamanho++;
    }

    void AbrirFechar(int n){
        quantidade[n-1].modo = !quantidade[n-1].modo;
    }

    void QuantasPortasEstaoAbertas(){
        int aux = 0;
        for(int i = 0; i < 3 ;i++){
            if(quantidade[i].modo){
                aux++;
            }
        }
        System.out.println("Tem " + aux + " portas abertas.");
    }
}