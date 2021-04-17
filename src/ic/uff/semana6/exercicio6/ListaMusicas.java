package ic.uff.semana6.exercicio6;
import java.util.*;

public class ListaMusicas extends Comparador{

    List<Musicas> musicas = new ArrayList<>();
    ArrayDeque<Musicas> musicaTocada = new ArrayDeque<>();
    Scanner teclado = new Scanner(System.in);

    public void adicionarMusicas(){
        Musicas musicas1 = new Musicas("O Rappa" , "Anjos pra quem tem fé");
        Musicas musicas2 = new Musicas("Slipknot" , "Duality");
        Musicas musicas3 = new Musicas("César mc" , "Canção infantil");
        Musicas musicas4 = new Musicas("Alok" , "Ocean");
        Musicas musicas5 = new Musicas("Karil" ,"Caballo homosexual de las Montañas" );
        Musicas musicas6 = new Musicas("Cypis","Gdzie jest biały węgorz?");
        Musicas musicas7 = new Musicas("Mc Poze" , "To voando alto");
        Musicas musicas8 = new Musicas("Eminem" , "Without me");
        Musicas musicas9 = new Musicas("Parkway drive" ,"Wishing wells");
        Musicas musicas10 = new Musicas("Maroon 5" , "Animals");

        this.musicas.add(musicas1);
        this.musicas.add(musicas2);
        this.musicas.add(musicas3);
        this.musicas.add(musicas4);
        this.musicas.add(musicas5);
        this.musicas.add(musicas6);
        this.musicas.add(musicas7);
        this.musicas.add(musicas8);
        this.musicas.add(musicas9);
        this.musicas.add(musicas10);
    }

    public void verMusica(){
        System.out.println("Aqui voce pode ver a sua lista de músicas");
        imprimir();
    }

    public void mostrasListaMusica(){
        System.out.println("Aqui voce ve sua lista só pelos nomes das músicas");
        musicas.sort(Comparator.comparing(Musicas::getNomeMusica));
        System.out.println("Aqui voce pode ver a sua lista de músicas ordenada pelos nomes das músicas");
        imprimir();
    }

    public void mostrarListaArtista(){
        System.out.println("Aqui voce ve sua lista só pelos nomes dos artistas");
        musicas.sort(Comparator.comparing(Musicas::getArtista));
        System.out.println("Aqui voce pode ver a sua lista de músicas ordenada pelos nomes dos artistas");
        imprimir();
    }

    public void adicionarMusicaFila(){
        System.out.println("\nQuantas músicas deseja tocar?");
        int num = teclado.nextInt();
        teclado.nextLine();

        for(int i = 0 ; i < num ; i++) {
            System.out.println("Digite o nome da música pedida :");
            String musicaNome = teclado.nextLine();

            for (Musicas percorre : musicas) {
                if (percorre.getNomeMusica().equals(musicaNome)) {
                    musicaTocada.add(percorre);
                }
            }
        }
    }

    public void tocarMusica(){
        System.out.println("\nEstá tocando agora");
        System.out.println(musicaTocada.getFirst().getNomeMusica());
        musicaTocada.removeFirst();
    }

    public void imprimir(){
        for(Musicas percorre : musicas){
            System.out.println("Música: "+ percorre.getNomeMusica() + " | Artista: " + percorre.getArtista());
        }
    }
}
