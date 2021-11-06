package livraria;

public class Biblioteca implements Publicacao{
        private String titulo;
        private String autor;
        private Integer totPaginas;
        private Integer pagAtual;
        private boolean aberto;
        private String leitor;


        public Biblioteca(String titulo, String autor, Integer totPaginas, Integer pagAtual, boolean aberto, String leitor) {
                this.titulo = titulo;
                this.autor = autor;
                this.totPaginas = totPaginas;
                this.pagAtual = pagAtual;
                this.aberto = aberto;
                this.leitor = leitor;
        }

        public void detalhes(){
                System.out.println("O livro "+ this.titulo +"\n");
                System.out.println("Do autor "+ this.autor +"\n");
                System.out.println("esta sendo lido por "+ this.leitor +"\n");
                System.out.println(this.leitor + " você esta na pagina " + this.pagAtual +"\n");
                System.out.println(this.leitor + " faltam  " + (this.totPaginas - this.pagAtual) +"\n");
                System.out.println(this.leitor + "O livro está aberto ?" + this.isAberto() +"\n");
        }

        public String getTitulo() {
                return titulo;
        }

        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }

        public String getAutor() {
                return autor;
        }

        public void setAutor(String autor) {
                this.autor = autor;
        }

        public Integer getTotPaginas() {
                return totPaginas;
        }

        public void setTotPaginas(Integer totPaginas) {
                this.totPaginas = totPaginas;
        }

        public Integer getPagAtual() {
                return pagAtual;
        }

        public void setPagAtual(Integer pagAtual) {
                this.pagAtual = pagAtual;
        }

        public boolean isAberto() {
                return aberto;
        }

        public void setAberto(boolean aberto) {
                this.aberto = aberto;
        }

        public String getLeitor() {
                return leitor;
        }

        public void setLeitor(String leitor) {
                this.leitor = leitor;
        }

        @Override
        public void abrir() {
                if(!this.aberto){
                        this.aberto = true;
                }else{
                        System.out.println("O livro já está aberto");
                }
        }

        @Override
        public void fechar() {
                if(this.aberto){
                        this.aberto = false;
                }else{
                        System.out.println("O livro já está fechado");
                }
        }

        @Override
        public void folhear() {
                if(this.pagAtual + 15 > this.totPaginas){
                        this.pagAtual = this.pagAtual + 10;
                }else{
                        System.out.println("Você está na página " + this.pagAtual);
                }
        }

        @Override
        public void avancarPag() {
                if(this.pagAtual > this.getTotPaginas()){
                        System.out.println("Você já chegou no final do livro " + this.leitor);
                }else{
                        this.pagAtual = getPagAtual() + 1;
                }

        }

        @Override
        public void voltarPag() {
                this.pagAtual = getPagAtual() - 1;
        }
}
