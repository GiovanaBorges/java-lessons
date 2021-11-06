package media;

public class Calc extends Aluno{
    protected float trab_nota;
    protected float nota;
    protected float nota1;
    protected float media;

    protected float getNota1() {
        return nota1;
    }

    protected void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    protected void Calc(float trab_nota, float nota, float nota1) {
        this.trab_nota = trab_nota;
        this.nota = nota;
        this.nota1 = nota1;
    }

    protected void media(){
        this.media = ((this.nota + 2.5f +this.nota + 2.5f)+(this.trab_nota + 2));
    }


    protected void final_nota(){
        if(this.media < 6){
            System.out.println("VocÊ precisa de " + (this.media - 6));
        }else{
            System.out.println(this.nome +"Tranquilo você passou sua media final" +this.media );
        }
    }



    public float getTrab_nota() {
        return trab_nota;
    }

    public void setTrab_nota(float trab_nota) {
        this.trab_nota = trab_nota;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
