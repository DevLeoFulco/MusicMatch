package br.com.devleofulco.musicmatch.model;

/**
 * Classe Podcast, que estende a classe Audio.
 * Esta classe representa um podcast no aplicativo MusicMatch e inclui
 * informações específicas de podcasts, como apresentador e descrição fora o que herda da
 * classe Audio.
 */
public class Podcast extends Audio{
    private String apresentador;
    private String descricao;


    /**
     * Getters e Setters para manipulação desses metodos fora da classe.
     * Retornando seus respectivos metodos.
     */
    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    /**
     * Sobrescreve o método getClassificacao da classe Audio.
     * A classificação é determinada pelo número de curtidas do podcast.
     * Retorna a classificação do podcast com base no número de curtidas.
     */
    @Override
    public int getClassificacao() {
        // Classificação máxima se as curtidas forem mais de 400
        if (this.getCurtidas()>400){
            return 10;
            // Classificação média se as curtidas estiverem entre 150 e 399
        } else if (this.getCurtidas()>=150 && this.getCurtidas()<400) {
            return 7;
            // Classificação básica se as curtidas forem menos de 150
        }else {
            return 4;
        }

    }
}
