public class Obj {
    public static void main(String [] args){
        Lobo n = new Lobo();
        Cachorro a = new Cachorro();
        n.emitirSom();
        a.emitirSom();

        a.reagir("vamo passear");
        a.reagir(false);
        a.reagir(true);
    }
}
