package exercicio6;

public class Baralho {
    Carta cartas = new Carta();
    Carta [] baralho = new Carta[52];
    String [] vetorCarta = {"Ás","2","3","4","5","6","7","8","9","10","J","Q","K"};

    void addCartas(Carta carta,int tamanho){
        baralho[tamanho] = carta;
    }

    void valorCarta(){
        int aux = 0;
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 13 ;j++){
                definirCartas(aux++,j,i);
            }
        }
    }

    void definirCartas(int aux,int j,int i){
        switch (i){
            case 0:
                baralho[aux].naipe = "copas";
                baralho[aux].valor = vetorCarta[j];
                break;
            case 1:
                baralho[aux].naipe = "paus";
                baralho[aux].valor = vetorCarta[j];
                break;
            case 2:
                baralho[aux].naipe = "ouro";
                baralho[aux].valor = vetorCarta[j];
                break;
            default:
                baralho[aux].naipe = "espada";
                baralho[aux].valor = vetorCarta[j];
        }
    }
}