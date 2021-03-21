package ic.uff.semana4.exercicio1e2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Voce tem uma quadrada de futebol com uma área de 8.250 metros quadrados");
        System.out.println(" Se voce deseja converter essa área para pés quadrados ,digite (1) ");
        System.out.println(" Se voce deseja converter essa área para acres ,digite (2) ");
        System.out.println(" Se voce deseja converter essa área para centímetros quadrados ,digite (3) ");
        System.out.println(" Se voce deseja converter essa área para milhas quadradas ,digite (4) ");

        int n = teclado.nextInt();

        if(n == 1){
            conversaoDeUnidadesDeArea.converterPes();
            System.out.println("Sua área em pés é de: " + conversaoDeUnidadesDeArea.areaPes);

        }
        if(n == 2){
            conversaoDeUnidadesDeArea.converterAcres();
            System.out.println("Sua área em acres é de: " + String.format("%.4f",conversaoDeUnidadesDeArea.areaAcres));

        }
        if(n == 3){
            conversaoDeUnidadesDeArea.converterCm();
            System.out.println("Sua área em centímetros é de: " + String.format("%.2f",conversaoDeUnidadesDeArea.areaCm));

        }
        if(n == 4){
            conversaoDeUnidadesDeArea.converterMilha();
            System.out.println("Sua área em milhas é de: " + String.format("%.6f",conversaoDeUnidadesDeArea.areaMilha));

        }
    }

}
