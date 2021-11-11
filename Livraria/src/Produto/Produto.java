package Produto;

import Fornecedor.Fornecedor;

public class Produto  extends Fornecedor{
    protected String marcaProduto;
    protected String nomeMaterial;
    protected int qtdMaterial;
    protected float tamanhoMaterial;
    protected float precoMaterial;
    protected String cnpjFornecedor;



    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public String getNomeMaterial() {
        return nomeMaterial;
    }

    public void setNomeMaterial(String nomeMaterial) {
        this.nomeMaterial = nomeMaterial;
    }

    public int getQtdMaterial() {
        return qtdMaterial;
    }

    public void setQtdMaterial(int qtdMaterial) {
        this.qtdMaterial = qtdMaterial;
    }

    public float getTamanhoMaterial() {
        return tamanhoMaterial;
    }

    public void setTamanhoMaterial(float tamanhoMaterial) {
        this.tamanhoMaterial = tamanhoMaterial;
    }

    public float getPrecoMaterial() {
        return precoMaterial;
    }

    public void setPrecoMaterial(float precoMaterial) {
        this.precoMaterial = precoMaterial;
    }

    @Override
    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    @Override
    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cnpjFornecedor='" + this.cnpjFornecedor + '\'' +
                ", marcaProduto='" + marcaProduto + '\'' +
                ", nomeMaterial='" + nomeMaterial + '\'' +
                ", qtdMaterial=" + qtdMaterial +
                ", tamanhoMaterial=" + tamanhoMaterial +
                ", precoMaterial=" + precoMaterial +
                '}';
    }
}
