package ic.uff.semana3.exercicio4;

public class Main {
    public static void main(String[] args){
        Data primeiraData = new Data(24 ,07 ,2018);
        Data segundaData = new Data(05 ,11 ,1999);
        Data terceiraData = new Data("Agosto",25,2020);
        Data quartaData = new Data("Outubro",11,2017);
        Data quintaData = new Data(120,1987);
        Data sextaData = new Data(238,1963);

        primeiraData.getPrimeiroMetodo();
        segundaData.getPrimeiroMetodo();
        terceiraData.getSegundoMetodo();
        quartaData.getSegundoMetodo();
        quintaData.getTerceiroMetodo();
        sextaData.getTerceiroMetodo();
    }
}