package ic.uff.semana4.exercicio8;

public class Par<F,S>{
    private F primeiro;
    private S segundo;

    public F getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(F primeiro) {
        this.primeiro = primeiro;
    }

    public S getSegundo() {
        return segundo;
    }

    public void setSegundo(S segundo) {
        this.segundo = segundo;
    }

    public Par(F primeiro, S segundo){
        setPrimeiro(primeiro);
        setSegundo(segundo);
    }

}
