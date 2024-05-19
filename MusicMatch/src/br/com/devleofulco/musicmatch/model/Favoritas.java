package br.com.devleofulco.musicmatch.model;

/**
 * Classe Favoritas do aplicativo MusicMatch.
 * Esta classe é responsável por gerenciar a lista de áudios favoritos dos usuários,
 * incluindo músicas e podcasts, e classificá-los com base em sua classificação.
 */
public class Favoritas {

    /**
     * Inclui um áudio na lista de favoritos e imprime uma mensagem com base na classificação do
     * áudio.
     * Passando o objeto Audio a ser incluído na lista de favoritos que pode ser musica ou Podcast.
     */
    public void incluir(Audio audio){
        // Verifica a classificação do áudio e imprime uma mensagem correspondente
        if (audio.getClassificacao()>=9){
            // Se a classificação for 9 ou superior, o áudio está no Top Favoritas
            System.out.println(audio.getTitulo() + " está no Top Favoritas!");
        } else if (audio.getClassificacao()>5) {
            // Se a classificação for maior que 5, o áudio está subindo no Ranking
            System.out.println(audio.getTitulo() + " está subindo no Ranking!");
        }else {
            // Se a classificação for 5 ou inferior, o áudio está mal avaliado
            System.out.println(audio.getTitulo() + " está mal avaliada! ");
        }
    }
}
