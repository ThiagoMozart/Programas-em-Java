package ic.uff.semana3.exercicio4;

public class Data {
    private int dia;
    private String nomeMes;
    private int numeroMes;
    private int ano;
    private int diasAno;

    Data(int dia , int mes ,int ano){
        this.dia = dia;
        this.numeroMes = mes;
        this.ano = ano;
    }

    Data(String nomeMes ,int dia , int ano){
        this.nomeMes = nomeMes;
        this.dia = dia;
        this.ano = ano;
    }

    Data(int diasAno,int ano){
        this.diasAno = diasAno;
        this.ano = ano;
    }

    void getPrimeiroMetodo(){
        System.out.println(dia + "/" + numeroMes + "/" + ano );
    }
    void getSegundoMetodo(){
        System.out.println(nomeMes +" "+ dia +", "+ ano);
    }
    void getTerceiroMetodo(){
        System.out.println(diasAno + " "+ ano);
    }
}
