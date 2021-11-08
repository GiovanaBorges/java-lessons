public class VideoObj {
    public static void main (String []args){
        Video v[] = new Video[3];
        v[0] = new Video("Aula de encapsuamento");
        v[1] = new Video("Aula de herança");
        v[2] = new Video("Aula de polimorfismo");

        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Jorge",23,"M","jorgito",5);
        u[1] = new Usuario("rosana",45,"F","Vania",2);

        System.out.println(v[0].toString());

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(u[0], v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(u[0], v[1]);
        vis[1].avaliar(35.0f);
        System.out.println(vis[1].toString());
    }
}

