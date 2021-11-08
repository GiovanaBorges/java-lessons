package animals;

public class Cachorro extends Mamifero{
    private String nome;


    @Override
    public void locomover() {
        System.out.println("Correndo procurando o dono");
    }

    @Override
    public void emitirSom() {
        System.out.println("Auauauau");
    }
}
