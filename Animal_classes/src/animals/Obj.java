package animals;

public class Obj {
    public static void main(String [] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Cachorro c = new Cachorro();
        Gato g = new Gato();

        c.locomover();
        g.locomover();
        c.emitirSom();
        g.emitirSom();
        c.alimentar();
        g.alimentar();
    }
}
