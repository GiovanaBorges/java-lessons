package gabarito;

import java.util.Scanner;

public class Estudante {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        Gabarito gabarito = new Gabarito();
        Prova p1 = new Prova(gabarito);
        char response;


        for(int i=0;i<15;i++){
            System.out.println("Digite sua resposta da questão "+ (i+1));
            response = scan.next().charAt(0);
            p1.respostaAluno(response);
        }

        p1.calcNota();

        System.out.println("Quantidade de acertos  = " + p1.acertos() + "\n");
        System.out.println("Sua nota = " + p1.nota());
    }
}
