package heranca_poo;

public class Bolsista extends Aluno{
    private float bolsa;
    public void renovarBolsa(){
        System.out.println("bolsa renovada com sucesso Aluno:"+ this.nome);
    }

    public void pagarMensalidade(){
        System.out.println(this.nome + "é bolsista ! pagamento realizado com sucesso");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
