package ic.uff.semana6.exercicio4;

import java.util.*;

public class lerPalavra {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Nesse programa voce irá escrever uma frase e iremos dizer quantas vezes " +
                "cada palavra foi repetida \n");

        System.out.println("Escreva três frases para analisarmos: ");

        for(int i = 0 ; i < 3 ; i++ ) {

            ArrayList<String> frases = new ArrayList<>();
            Map<String , Integer> mapFrases = new HashMap<>();
            String[] frase ;
            int cont = 0;

            System.out.println("\nDigite sua frase aqui: ");
            frase = teclado.nextLine().split(" ");

            for (int a = 0; a < frase.length; a++) {
                frase[a] = frase[a].toLowerCase();
                frases.add(frase[a]);
            }

            for (String percorre : frases) {
                if (mapFrases.get(percorre) == null) {
                    cont = 0;
                } else {
                    cont = mapFrases.get(percorre);
                }
                mapFrases.put(percorre, cont + 1);
            }

            for (Map.Entry<String, Integer> palavra : mapFrases.entrySet()) {
                System.out.println("A palavra teve de ocorrência: " + palavra.getValue() + " vez(es) | (Palavra: "+ palavra.getKey() + ") \n");
            }
        }
    }
}
