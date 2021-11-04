package aula06;

import java.util.Optional;

public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean replay;
    //métodos especiais

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        this.replay = false;
    }

    public boolean isReplay() {
        return replay;
    }

    public void setReplay(boolean replay) {
        this.replay = replay;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado?"+ this.getLigado());
        System.out.println("Está tocando?" + this.getTocando());
        System.out.println("Volume :"+ this.getVolume());
        for(int i=0; i<= this.getVolume(); i+=10){
            System.out.println("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu....");

    }

    @Override
    public void maisVolume() {
        if(getLigado()){
            setVolume(getVolume() + 1);
        }else{
            System.out.println("impossivel aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if(getLigado()){
            setVolume(getVolume() - 1);
        }else{
            System.out.println("impossivel diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(getLigado() && getVolume() > 0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(getLigado() && getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("nao consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("nao consegui pausar");
        }
    }

    @Override
    public void replay(){
        if(!this.replay && this.getLigado()){
            this.replay = true;
            System.out.println("repetindo video");
        }else{
            System.out.println("nao consegui repetir");
            this.replay = false;
        }
    }

    //metodos abstratos

}
