package ic.uff.semana4.exercicio6;

public class Planta extends Pokemon {
    @Override
    public void evoluir() {
        super.evoluir();
    }

    public void usarAtaque(){
        Ataque atacar = new Ataque();
        atacar.atacar();
    }
}
