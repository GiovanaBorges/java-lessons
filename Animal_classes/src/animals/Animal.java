package animals;

public abstract class Animal {
    //atributos
    protected float peso;
    protected int idade;
    protected int membros;

    //metodos especiais
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
