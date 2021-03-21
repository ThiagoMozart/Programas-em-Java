package ic.uff.semana4.exercicio6;

import java.util.Scanner;

public class Stats {
    private float hp;
    private int atk;
    private int def;
    private int spAtk;
    private int spDef;
    private int spd;
    private int exp;

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(int spAtk) {
        this.spAtk = spAtk;
    }

    public int getSpDef() {
        return spDef;
    }

    public void setSpDef(int spDef) {
        this.spDef = spDef;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void mudarStats(){
        int ataque = 5;
        int defesa = 5;
        float vida = 3;
        int experiencia = 100;
        int ataqueSpecial = 5;
        int defesaSpecial = 10;
        int velocidade = 10;

        setAtk(atk + ataque);
        setDef(def + defesa);
        setHp(hp + vida);
        setExp(exp + experiencia);
        setSpAtk(spAtk + ataqueSpecial);
        setSpDef(spDef + defesaSpecial);
        setSpd(spd + velocidade);
    }

    public void mostrarStats(){
        getAtk();
        getDef();
        getHp();
        getSpAtk();
        getSpDef();
        getExp();
    }
}
