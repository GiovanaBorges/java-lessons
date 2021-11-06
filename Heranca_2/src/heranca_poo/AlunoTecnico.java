package heranca_poo;

public final class AlunoTecnico extends Aluno{
    private double registroProfissional;
    private void praticar(){
        System.out.println("VocÊ está praticando !" + this.nome);
    }

    public double getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(double registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
