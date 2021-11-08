public class Lobo extends Mamifero{
    @Override
    public void emitirSom(){
        System.out.println("auuuuuuuuuuuu!");
    }

    public void reagir(String frase){
        if(frase.equals("Toma Comida") || frase.equals("vamo passear")){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e Latir");
        }
    }

    public void reagir(int idade, float peso){
       if(idade <5){
           if(peso < 10){
               System.out.println("Abanar");
           }else{
               System.out.println("Latir");
           }
       }else{
           if(peso < 10){
               System.out.println("Rosnar");
           }else{
               System.out.println("Ignorar");
           }
       }
    }

    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e Latir");
        }
    }
}
