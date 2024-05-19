package br.com.devleofulco.musicmatch.principal;

import br.com.devleofulco.musicmatch.model.Favoritas;
import br.com.devleofulco.musicmatch.model.Musica;
import br.com.devleofulco.musicmatch.model.Podcast;

/**
 * Classe Principal do aplicativo MusicMatch.
 * Esta classe contém o método main e é responsável por iniciar o aplicativo,
 * criar instâncias de Musica e Podcast, reproduzir e curtir áudios, e adicionar
 * itens à lista de favoritos.
 */

public class Principal {


    public static void main(String[] args) {

        // Cria uma nova instância de Musica
        Musica primeira = new Musica();

        // Define o título e o artista da música
        primeira.setTitulo("Janela de vidro");
        primeira.setArtista("Gabriel Diniz");

        // Reproduz a música 5000 vezes
        for (int i = 0; i < 5000; i++) {

            primeira.reproduzirAudio();
        }

        // Curte a música 860 vezes
        for (int i = 0; i < 860; i++) {
            primeira.curtirAudio();
        }

        // Cria uma nova instância de Podcast
        Podcast techwave = new Podcast();

        // Define o título, apresentador e descrição do podcast
        techwave.setTitulo("TechWave Master");
        techwave.setApresentador("Leo Fulco");
        techwave.setDescricao("O podcast de tecnologia e outras modinhas!");

        // Reproduz o podcast 800 vezes
        for (int i = 0; i < 800; i++) {
            techwave.reproduzirAudio();
        }
        // Curte o podcast 450 vezes
        for (int i = 0; i < 450; i++) {
            techwave.curtirAudio();
        }

        // Cria uma nova instância de Favoritas
        Favoritas favoritas = new Favoritas();

        // Adiciona o podcast e a música à lista de favoritos
        favoritas.incluir(techwave);
        favoritas.incluir(primeira);
    }
}