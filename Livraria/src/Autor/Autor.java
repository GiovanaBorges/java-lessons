package Autor;

public class Autor {
    protected String nomeAutor;
    protected String nomeLivro;
    private int idadeAutor;
    protected String cpfAutor;


    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getIdadeAutor() {
        return idadeAutor;
    }

    public void setIdadeAutor(int idadeAutor) {
        this.idadeAutor = idadeAutor;
    }

    public String getCpfAutor() {
        return cpfAutor;
    }

    public void setCpfAutor(String cpfAutor) {
        this.cpfAutor = cpfAutor;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nomeAutor='" + nomeAutor + '\'' +
                ", nomeLivro='" + nomeLivro + '\'' +
                ", idadeAutor=" + idadeAutor +
                ", cpfAutor='" + cpfAutor + '\'' +
                '}';
    }
}

