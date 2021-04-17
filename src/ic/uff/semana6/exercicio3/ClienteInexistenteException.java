package ic.uff.semana6.exercicio3;

public class ClienteInexistenteException extends Exception{

    @Override
    public String getMessage() {
        return "Erro ,o cliente é inexistente" ;
    }
}
