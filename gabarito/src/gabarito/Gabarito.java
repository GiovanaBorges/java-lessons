package gabarito;

public class Gabarito {

    public char respostaQuestao(int numeroQuestao){
        char response=' ';
        switch (numeroQuestao){
            case 1 :
                response = 'A';
                break;
            case 2:
            case 7:
            case 12:
            case 13:
                response = 'B';
                break;
            case 3:
            case 8:
            case 10:
                response = 'C';
                break;
            case 4:
            case 6:
            case 9:
                response = 'D';
                break;
            case 5:
            case 14:
            case 11:
                response = 'E';
                break;
            case 15:
                response = 'D';
                break;
        }
        return response;
    }
}
