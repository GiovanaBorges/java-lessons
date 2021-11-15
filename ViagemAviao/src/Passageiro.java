
import java.util.Calendar;
import java.util.Scanner;

public class Passageiro {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        Calendar c = Calendar.getInstance();

        int nVoo,nPassageiros,assentoLivre,cadeirasVagas;
        String data;

        System.out.println("Data/Hora atual: "+c.getTime());
        System.out.println("Ano: "+c.get(Calendar.YEAR));
        System.out.println("Mês: "+c.get(Calendar.MONTH));
        System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));

         data = (c.get(Calendar.DAY_OF_MONTH) + " / " +c.get(Calendar.MONTH) + " / " +c.get(Calendar.YEAR) );

        System.out.println("Digite o numero do VOO");
        nVoo = scan.nextInt();

        System.out.println("Digite a quantidade de passageiros");
        nPassageiros = scan.nextInt();

        System.out.println("Digite o numero do assento livre");
        assentoLivre = scan.nextInt();

        System.out.println("Digite a quantidade de cadeiras livres");
        cadeirasVagas = scan.nextInt();

        Aviao aviao = new Aviao(assentoLivre, cadeirasVagas,nVoo,data);
        System.out.println("proximo assento livre " + aviao.proximoAssentoLivre());
        aviao.setPassageiros(25);
        aviao.setDvoo(data);
        aviao.getDvoo();
        System.out.println("o assento está ocupado " + aviao.ocupa());


    }
}
