public class Motorista {
    public static void main(String []args){

        Carro car = new Carro();
        Veiculo v = new Veiculo();
        Garagem ga = new Garagem();
        car.setVelocidadeMaxima(175);
        car.setCorVeiculo("Azul");
        car.setMarcaVeiculo("Toyota");


        v.setCorVeiculo(car.getCorVeiculo());
        v.setVelocidadeMaxima(car.getVelocidadeMaxima());
        System.out.println(v.somVeiculo());
        System.out.println(car.somVeiculo());
        System.out.println(v.getVelocidadeMaxima());
        System.out.println(v.getCorVeiculo());
        System.out.println(ga.Park(car));
    }
}

