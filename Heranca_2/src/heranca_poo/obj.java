package heranca_poo;

public class obj {
    public static void main(String []args){
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(12);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno A = new Aluno();
        A.setNome("roberto");
        A.setMatricula(5);
        A.setCurso("Administração");

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1111);
        b1.setNome("Fábio");
        b1.setBolsa(12.8f);
        b1.setSexo("F");
        b1.pagarMensalidade();
    }
}
