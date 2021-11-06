package ultraemojicombat;

public class Lutador {
    private String nome,nacionalidade,categoria;
    private float altura,peso;
    private Integer vitorias,empates,derrotas,idade;

    public void apresentar(){
        System.out.println("ultraemojicombat.Lutador : " + getNome());
        System.out.println("Origem : " + getNacionalidade());
        System.out.println(getIdade() + " anos de idade");
        System.out.println(getAltura() + " m de altura");
        System.out.println("Pesando " + getPeso() + "KG");
        System.out.println("Ganhou  "+getVitorias());
        System.out.println("Perdeu " + getDerrotas());
        System.out.println("Empatou "+ getEmpates());
    }

    public void Status(){
        System.out.println(getNome() + "\n");
        System.out.println("é um peso " + getCategoria() + "\n");
        System.out.println(" com "+getVitorias() + " Vitórias\n");
        System.out.println("com" + getDerrotas() + " Derrotas\n");
        System.out.println("com " +getEmpates() + " Empates\n");
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);

    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

    public Lutador(String nome, String nacionalidade, float altura, float peso, Integer vitorias, Integer empates, Integer derrotas, Integer idade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso <52.2){
            this.categoria = "Inválido";
        }else if(this.peso <=62.2){
            this.categoria = "Frango";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <=83.9){
            this.categoria = "Médio";
        }else if(this.peso <=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
