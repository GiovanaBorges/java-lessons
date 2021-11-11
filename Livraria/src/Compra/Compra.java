package Compra;

import Produto.Produto;

public class Compra {
    private float valorCompra;
    private String detalhesCompra;
    private int qtdItemsCompra;
    private int item;

    public Compra(){
        Produto item[] = new Produto[15];
        this.valorCompra = 0;
    }

    public void qtdItensTotal(int qtd){
        this.qtdItemsCompra+=qtd;
    }

    public float totalCompra(float preco){
        valorCompra+=preco;
        return valorCompra;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getDetalhesCompra() {
        return detalhesCompra;
    }

    public void setDetalhesCompra(String detalhesCompra) {
        this.detalhesCompra = detalhesCompra;
    }

    public int getQtdItemsCompra() {
        return qtdItemsCompra;
    }

    public void setQtdItemsCompra(int qtdItemsCompra) {
        this.qtdItemsCompra = qtdItemsCompra;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "valorCompra=" + this.getValorCompra() +
                ", detalhesCompra='" + detalhesCompra + '\'' +
                ", qtdItemsCompra=" + qtdItemsCompra +
                ", item=" + item +
                '}';
    }
}
