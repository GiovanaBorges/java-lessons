package animals;

public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo animais menores");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao emite som");
    }
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

}
