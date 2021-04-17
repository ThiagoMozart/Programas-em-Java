package ic.uff.semana6.exercicio3;

public class ClienteJaExisteException extends Exception{

    @Override
    public String getMessage() {
        return "Erro ,o cliente já existe" ;
    }
}
