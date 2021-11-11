package Fornecedor;

public class Fornecedor {
    protected String cnpjFornecedor;

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "cnpjFornecedor='" + cnpjFornecedor + '\'' +
                '}';
    }
}
