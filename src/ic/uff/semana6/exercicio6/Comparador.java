package ic.uff.semana6.exercicio6;

import java.util.Comparator;

public class Comparador{

    public Comparator<Musicas> nomeMusica = new Comparator<Musicas>(){
        @Override
        public int compare(Musicas musica1 , Musicas musica2) {
            return musica1.getNomeMusica().compareTo(musica2.getNomeMusica());
        }
    };

    public Comparator<Musicas> nomeArtista = new Comparator<Musicas>(){
        @Override
        public int compare(Musicas musica1 , Musicas musica2) {
            return musica1.getArtista().compareTo(musica2.getArtista());
        }
    };
}
