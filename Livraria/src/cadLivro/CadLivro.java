package cadLivro;
import Autor.Autor;

public class CadLivro extends Autor{
    protected int anoLivro;
    protected float precoLivro;
    protected int qtdPaginas;
    protected String generoLivro;

    public int getAnoLivro() {
        return anoLivro;
    }

    public void setAnoLivro(int anoLivro) {
        this.anoLivro = anoLivro;
    }

    public float getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(float precoLivro) {
        this.precoLivro = precoLivro;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public String getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }


    public int verificaGeneroLivro() {
        switch (this.generoLivro) {
            case "terror":
                return 1;
            case "suspense":
                return 1;

            case "drama":
                return 1;

            case "romance":
                return 1;

            case "aventura":
                return 1;

            case "espiritual":
                return 1;

            case "fic":
                return 1;

            case "superação":
                return 1;

            default:
                return 0;
        }

    }

    public String toString() {
        return("CadLivro{" +
                " anoLivro=" + this.getAnoLivro() +
                ", precoLivro=" + this.getPrecoLivro() +
                ", qtdPaginas=" + this.getQtdPaginas() +
                ", nomeLivro='" + this.getNomeLivro() + '\'' +
                ", generoLivro='" + this.getGeneroLivro()+ '\'' +
                '}');
    }

}
