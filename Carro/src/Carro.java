public class Carro extends Veiculo{
    protected int velocidadeMaxima;

    @Override
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    @Override
    public void setVelocidadeMaxima(int vMaxima) {
        if(this.velocidadeMaxima > 150){
            System.out.println("o carro pifou você passou da velocidade máxima");
        }else{
            System.out.println("ta veloz em ");
        }
    }

    @Override
    public String somVeiculo(){
        return "VRAUUUUUUUUUUUUUUUUUUUUUUU";
    }
}
