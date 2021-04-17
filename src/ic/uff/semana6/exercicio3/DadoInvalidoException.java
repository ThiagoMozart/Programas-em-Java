package ic.uff.semana6.exercicio3;

public class DadoInvalidoException extends NumberFormatException {

    public String getMessagePorFavor(){
        return "Erro ,o seu dado é inválido";
    }
    @Override
    public String getMessage() {
        return "Erro ,o seu dado é inválido";
    }
}
