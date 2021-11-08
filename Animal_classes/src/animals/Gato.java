package animals;

public class Gato extends Mamifero{
    private String nome;

    @Override
    public void locomover() {
        System.out.println("Escalando e se escondendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miauuuuu");
    }
}
