package gabarito;

public class Prova {
    //respostaAluno recebe como parâmetro a resposta dada pelo aluno a uma questão; este método não
    //recebe entre os parâmetros o número da questão, ele mesmo deve estabelecer um
    //controle interno de modo que as questões sejam inseridas sequencialmente, ou seja, a
    //primeira vez que o método é chamado, insere a primeira questão, a segunda, insere a
    //segunda questão, e assim por diante.
    //acertos retorna a quantidade de questões que o aluno acertou
    //nota retorna a nota que o aluno tirou na prova
    //maior recebe como parâmetro um outro objeto da classe Prova e retorna a nota do aluno que
    //acertou mais questões; se houver empate, retorna a maior nota; se houver empate
    //novamente, retorna a nota do aluno representado no objeto corrente
    private int notaCorrect=0;
    private double nota;
    private char notas[] = new char[15];
    private int contNota=0;
    private Gabarito gabarito;

    public Prova(Gabarito g){
        this.gabarito = g;
    }

    public void respostaAluno(char nota){
        this.notas[contNota] = nota;
        this.contNota++;
    }

    public void calcNota(){
        if(this.notas[0] == gabarito.respostaQuestao(1)){
            this.nota+= 0.5;
            this.notaCorrect++;
        }
        if(this.notas[1] == gabarito.respostaQuestao(2)){
            this.nota+= 0.5;
            this.notaCorrect++;
        }
        if(this.notas[2] == gabarito.respostaQuestao(3)){
            this.nota+= 0.5;
            this.notaCorrect++;
        }
        if(this.notas[3] == gabarito.respostaQuestao(4)){
            this.nota+= 0.5;
            this.notaCorrect++;
        }
        if(this.notas[4] == gabarito.respostaQuestao(5)){
            this.nota+= 0.5;
            this.notaCorrect++;
        }
        if(this.notas[5] == gabarito.respostaQuestao(6)){
            this.nota+= 0.5;
            this.notaCorrect++;
        }
        if(this.notas[6] == gabarito.respostaQuestao(7)){
            this.nota+= 0.5;
            this.notaCorrect++;
        }
        if(this.notas[7] == gabarito.respostaQuestao(8)){
            this.nota+= 0.5;
            this.notaCorrect++;
        }
        if(this.notas[8]== gabarito.respostaQuestao(9)){
            this.nota+= 0.5;
            this.notaCorrect++;
        }
        if(this.notas[9]== gabarito.respostaQuestao(10)){
            this.nota+= 0.5;
            this.notaCorrect++;
        }
        if(this.notas[10]== gabarito.respostaQuestao(11)){
            this.nota+= 1;
            this.notaCorrect++;
        }
        if(this.notas[11]== gabarito.respostaQuestao(12)){
            this.nota+= 1;
            this.notaCorrect++;
        }
        if(this.notas[12]== gabarito.respostaQuestao(13)){
            this.nota+= 1;
            this.notaCorrect++;
        }
        if(this.notas[13]== gabarito.respostaQuestao(14)){
            this.nota+= 1;
            this.notaCorrect++;
        }
        if(this.notas[14]== gabarito.respostaQuestao(15)){
            this.nota+= 1;
            this.notaCorrect++;
        }
    }

    public double nota(){
        return this.nota;
    }

    public double maior(Prova aluno){
        if(aluno.nota > this.nota){
            return aluno.nota();
        }else{
            return this.nota();
        }
    }

    public int acertos(){
        return this.notaCorrect;
    }

}
