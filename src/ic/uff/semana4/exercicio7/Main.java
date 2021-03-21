package ic.uff.semana4.exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int escolha;
        DiaDaSemana verificar = new DiaDaSemana();

        System.out.println("Digite qual dia voce quer verificar: \n");
        System.out.println("(1) --- SEGUNDA ");
        System.out.println("(2) --- TERÇA ");
        System.out.println("(3) --- QUARTA ");
        System.out.println("(4) --- QUINTA ");
        System.out.println("(5) --- SEXTA ");
        System.out.println("(6) --- SÁBADO ");
        System.out.println("(7) --- DOMINGO ");

        escolha = teclado.nextInt();

        if(escolha == 1){
            verificar.setStatus(DiasDaSemana.SEGUNDA);
        }
        if(escolha == 2){
            verificar.setStatus(DiasDaSemana.TERCA);
        }
        if(escolha == 3){
            verificar.setStatus(DiasDaSemana.QUARTA);
        }
        if(escolha == 4){
            verificar.setStatus(DiasDaSemana.QUINTA);
        }
        if(escolha == 5){
            verificar.setStatus(DiasDaSemana.SEXTA);
        }
        if(escolha == 6){
            verificar.setStatus(DiasDaSemana.SABADO);
        }
        if(escolha == 7) {
            verificar.setStatus(DiasDaSemana.DOMINGO);
        }


        if (verificar.ehDiaUtil()) {
            System.out.println("È um dia útil");
        }
        else {
            System.out.println("Não é um dia útil");
        }
    }
}
