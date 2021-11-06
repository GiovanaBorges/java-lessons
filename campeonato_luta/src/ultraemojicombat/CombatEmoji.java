package ultraemojicombat;

public class CombatEmoji {
    public static void main(String[] args){
        Lutador l = new Lutador("Giba" , "venezuela" , 1.90f,83.9f,16
                ,0,0,21);

        Lutador l1 = new Lutador("carlos" , "colombia" , 1.90f,83.9f,7
                ,5,1,56);

        Luta ufc = new Luta();
        ufc.marcarLuta(l,l1);
        ufc.lutar();
        l.Status();
        l1.Status();

    }

}
