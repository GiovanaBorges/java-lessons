import Acervo.Acervo;
import Autor.Autor;
import Compra.Compra;
import Fornecedor.Fornecedor;
import Produto.Produto;
import cadLivro.CadLivro;

import java.util.Scanner;

public class Usuario {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        Autor a = new Autor();
        Produto prod = new Produto();
        Fornecedor forn = new Fornecedor();
        CadLivro cadLivro = new CadLivro();
        Compra comp = new Compra();
        Acervo ac = new Acervo();
        String cnpj = forn.getCnpjFornecedor();
        String produto = prod.getMarcaProduto() + prod.getNomeMaterial();
        String nomeMaterial;
        float preco=0,tamanho=0;


        int opcao,end=1,compra=0;

        while(end == 1) {
            System.out.println("Voce deseja comprar material - 1 / cadastrar um livro - 2 / comprar um livro - 3  / vender algo para a livraria - 4");
            opcao = scan.nextInt();

            if (opcao == 2) {
                a.setCpfAutor("59595959");
                a.setIdadeAutor(45);
                a.setNomeAutor("Calors");
                a.setNomeLivro("Blinding bylights");
                System.out.println(a.toString());

                cadLivro.setGeneroLivro("terror");
                cadLivro.setAnoLivro(2004);
                cadLivro.setNomeLivro("terroroza");
                cadLivro.setPrecoLivro(45.9f);
                cadLivro.setQtdPaginas(504);

                if (cadLivro.verificaGeneroLivro() == 1) {
                    System.out.println("Livro cadastrado com sucesso");
                    System.out.println(cadLivro.toString());
                } else {
                    System.out.println("Não é possivel cadastrar esse genero");
                }
            }else if(opcao == 4) {
                System.out.println("Digite seu cnpj");
                cnpj = scan.next();
                System.out.println("Qual o nome do material");
                nomeMaterial = scan.next();
                System.out.println("Qual o preço do material");
                preco = scan.nextFloat();
                System.out.println("Qual o tamanho do material");
                tamanho = scan.nextFloat();

                forn.setCnpjFornecedor(cnpj);
                prod.setCnpjFornecedor(cnpj);
                prod.setPrecoMaterial(preco);
                prod.setTamanhoMaterial(tamanho);
                prod.setNomeMaterial(nomeMaterial);
                System.out.println(prod.toString());
            }else if(opcao == 1){
                comp.setValorCompra(preco);
                comp.setQtdItemsCompra(2);
                comp.setDetalhesCompra(produto);
                comp.toString();
                System.out.println("materiais disponiveis : " + comp.toString());

                System.out.println("Deseja esse material ?  - sim(1)  não(2)" );
                compra =scan.nextInt();

                if(compra == 1){
                    comp.totalCompra(preco);
                    System.out.println("Compra finalizada com sucesso " );
                }

            }else{

            }

            System.out.println("Deseja continuar ? / SIM - 1 /NAO - 2");
            end = scan.nextInt();
        }



    }
}
