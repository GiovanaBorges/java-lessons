package CadLeitor;

public class CadLeitor {
    protected String nomeLeitor;
    private int idadeLeitor;
    private String cpfLeitor;
    private String livroEscolhido;
    private int qtdLivrosLidos;
    protected String generoEscolhido;


    public String getLivroEscolhido() {
        return livroEscolhido;
    }

    public void setLivroEscolhido(String livroEscolhido) {
        this.livroEscolhido = livroEscolhido;
    }

    public int getQtdLivrosLidos() {
        return qtdLivrosLidos;
    }

    public void setQtdLivrosLidos(int qtdLivrosLidos) {
        this.qtdLivrosLidos = qtdLivrosLidos;
    }

    public String getNomeLeitor() {
        return nomeLeitor;
    }

    public void setNomeLeitor(String nomeLeitor) {
        this.nomeLeitor = nomeLeitor;
    }

    public int getIdadeLeitor() {
        return idadeLeitor;
    }

    public void setIdadeLeitor(int idadeLeitor) {
        this.idadeLeitor = idadeLeitor;
    }

    public String getCpfLeitor() {
        return cpfLeitor;
    }

    public void setCpfLeitor(String cpfLeitor) {
        this.cpfLeitor = cpfLeitor;
    }

    public String toString() {
        return "CadLeitor{" +
                "nomeLeitor='" + nomeLeitor + '\'' +
                ", idadeLeitor=" + idadeLeitor +
                ", cpfLeitor='" + cpfLeitor + '\'' +
                ", livroEscolhido='" + livroEscolhido + '\'' +
                ", qtdLivrosLidos=" + qtdLivrosLidos +
                ", generoEscolhido='" + generoEscolhido + '\'' +
                '}';
    }
}
