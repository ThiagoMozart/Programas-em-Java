package ic.uff.semana6.exercicio5;

import java.util.*;

public class Conversor {
    public static void main( String[] args) {
        ArrayList<String> listaArray = new ArrayList<>();
        Set<String> listaHash;
        Queue<String> listaQueue;
        Deque<String> listaDeque;
        Set<String> listaTree;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantas informações desejar (Palavras | Letras | Números) :");
        String[] frase ;
        frase = teclado.nextLine().split(" ");

        for (int a = 0; a < frase.length; a++) {
            listaArray.add(frase[a]);
        }
        System.out.println("Lista em Array");
        System.out.println(listaArray.toString());

        listaHash = new HashSet<>(listaArray);
        System.out.println("\nLista em HashSet");
        System.out.println(listaHash.toString());

        listaQueue = new PriorityQueue<>(listaHash);
        System.out.println("\nLista em PriorityQueue");
        System.out.println(listaQueue.toString());

        listaDeque = new ArrayDeque<>(listaQueue);
        System.out.println("\nLista em ArrayDeque");
        System.out.println(listaDeque.toString());

        listaTree = new TreeSet<>(listaDeque);
        System.out.println("\nLista em TreeSet");
        System.out.println(listaTree.toString());

    }
}
