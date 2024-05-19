package br.com.devleofulco.musicmatch.model;

/**
 * Classe Musica, que estende a classe Audio.
 * Esta classe representa uma música no aplicativo MusicMatch e inclui
 * informações específicas de músicas, como álbum, artista e gênero.
 */

public class Musica extends Audio{
    /**
     * Getters e Setters do álbum da música.
     * para manipulação dos atributos fora da classe.
     */

    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * Sobrescreve o método getClassificacao da classe Audio.
     * A classificação é determinada pelo número de curtidas da música.
     * E retorna a classificação da música com base no número de curtidas.
     */
    @Override
    public int getClassificacao() {
        if (this.getCurtidas()>1200){
            return 10; // Classificação máxima
        } else if (this.getCurtidas()>=750 && this.getCurtidas()<1200) {
            return 7; // Classificação média
        }else {
            return 4; // Classificação básica
        }

    }
}
