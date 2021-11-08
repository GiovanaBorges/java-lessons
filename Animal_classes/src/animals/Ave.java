package animals;

public class Ave extends Animal{
    public String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas e vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
}
