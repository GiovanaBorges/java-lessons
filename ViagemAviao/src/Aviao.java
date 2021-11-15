import java.util.Date;
import java.util.Calendar;

public class Aviao {
    private int assentos;
    private int Passageiros;
    private int nvoo;
    private String Dvoo;
    private int assentoLivre;


    public Aviao(int assentoLivre , int assentos, int nvoo, String dvoo) {
        this.assentos = assentos;
        this.nvoo = nvoo;
        this.Dvoo = dvoo;
        this.assentoLivre = assentoLivre;
    }

    public int proximoAssentoLivre(){
        return this.assentoLivre;
    }

    public boolean verificaAssento(){
        boolean ocupado=false;
        if(this.assentoLivre >  0){
            ocupado = true;
        }if(assentoLivre <  this.assentos){
            ocupado = true;
        }else{
            ocupado = false;
        }
        return ocupado;
    }

    public int vagas(int vagas){
        return vagas;
    }

    public boolean ocupa(){
        if(verificaAssento()){
            return false;  //se o verificaassento retornar true quer dizer que o lugar pode ser ocupado;
        }else{
            return true;
        }
    }

    public int isAssento() {
        return assentos;
    }

    public void setAssento(int assento) {
        this.assentos = assento;
    }

    public int getPassageiros() {
        return Passageiros;
    }

    public void setPassageiros(int Passageiros) {
        this.Passageiros = Passageiros;
    }

    public int getNvoo() {
        return nvoo;
    }

    public void setNvoo(int nvoo) {
        this.nvoo = nvoo;
    }

    public String getDvoo() {
        return Dvoo;
    }

    public void setDvoo(String dvoo) {
        Dvoo = dvoo;
    }

    public int getAssentoLivre() {
        return assentoLivre;
    }

    public void setAssentoLivre(int assentoLive) {
        this.assentoLivre = assentoLive;
    }
}

