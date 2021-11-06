package heranca_poo;

public final class  Professor extends Pessoa{
    private String especialidade;
    private double salario;
    private void receberAumento(){
        this.salario +=5;
        System.out.println("Você recebeu o aumento de somente 5 reais seu salário atual: "+this.salario);

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
