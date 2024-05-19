package br.com.devleofulco.musicmatch.model;


/**
 * Classe Audio representa um item de áudio genérico no aplicativo MusicMatch.
 * Esta classe serve como superclasse para tipos específicos de áudio, como músicas e podcasts,
 * e contém atributos e métodos comuns relacionados à reprodução e interação com o áudio.
 */
public class Audio {

    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    /**
     * Define Getters e Setters para manipulação
     *  fora da classe Audio.
     */

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }
    /**
     * Obtém o total de reproduções do áudio.
     * E retorna o número total de vezes que o áudio foi reproduzido.
     */

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao++;
    }
    /**
     * Incrementa o número de curtidas do áudio.
     */
    public void curtirAudio(){
        this.curtidas ++;
    }
    /**
     * Incrementa o contador de reproduções do áudio.
     */
    public void reproduzirAudio(){
        this.totalDeReproducoes++;
    }
}
