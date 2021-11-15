public class Data {
    private int mes;
    private int ano;
    private int dia;

    public Data(int mes, int ano, int dia) {
        this.mes = mes;
        this.ano = ano;
        this.dia = dia;
        if(this.mes > 12 | this.mes < 0){
            this.mes = 01;
        }if(this.dia > 30 | this.dia < 0){
            this.dia = 01;
        }
        if(this.ano > 4 | this.ano < 4){
            this.ano = 0001;
        }


    }

    public int compar(int d, int m,int a){
        int response=0;
        int dia=21,mes=06,ano=2003;
        if(d.equals(dia) && m.equals(mes) && a.equals(ano)){
            response = 0;
        }else if(d > dia && m > mes && a > ano){
            response = -1;
        }
        return response;
    }

    public String getMesExtenso(String d, String m,String a){
        String response;
        response = (this.dia + "/" + this.mes + "/" + this.ano);
        return response;
    }


    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
}

