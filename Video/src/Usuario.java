public class Usuario extends Pessoa{
    private String login;
    private int totAssistido;

    public Usuario(String nome,int idade, String sexo,String login,int totAssistido){
        super(nome,idade,sexo);
        this.totAssistido = 0;
        this.login = login;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm(){
        this.totAssistido++;
    }

    @Override
    public String toString() {
        return "Usuario{" + super.toString()+
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
