public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduz;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduz() {
        return reproduz;
    }

    public void setReproduz(boolean reproduz) {
        this.reproduz = reproduz;
    }



    @Override
    public void play() {
        this.reproduz = true;
    }

    @Override
    public void pause() {
        this.reproduz = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduz=" + reproduz +
                '}';
    }
}

