package Acervo;

import cadLivro.CadLivro;

public class Acervo extends CadLivro {
    protected float qtdLivros;
    private int livro;
    private int capacidade;

    public Acervo() {
        CadLivro[] livro = new CadLivro[100];
        this.capacidade = 100;
        this.qtdLivros = 98;
    }

    public void capacidadeTotal(){
        capacidade--;
    }


}
