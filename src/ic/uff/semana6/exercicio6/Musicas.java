package ic.uff.semana6.exercicio6;

public class Musicas {
    private final String artista;
    private final String nomeMusica;


    Musicas(String artista , String nomeMusica){
        this.artista = artista;
        this.nomeMusica = nomeMusica;
    }

    public String getArtista() {
        return artista;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }
}
