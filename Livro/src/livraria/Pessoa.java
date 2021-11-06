package livraria;

public class Pessoa {
    private String nome;
    private String sexo;
    private Integer idade;

    public void fazerAniver(){}

    public static void main(String []args){
        Biblioteca  p = new Biblioteca("o livrete rico","daniela"
        ,505,5,false,"carlos");

        p.avancarPag();
        p.folhear();
        p.detalhes();
        p.fechar();
        p.abrir();
        p.detalhes();


    }
}
