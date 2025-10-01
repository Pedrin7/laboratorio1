package semana7e8.mercado;

public class Data {
    public int dia, mes, ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //getter e setter do dia
    public int getDia(){return dia;}
    public void setDia(int dia){this.dia = dia;}

    //getter e setter do mes
    public int getMes(){return mes;}
    public void setMes(int mes){this.mes = mes;}

    //getter e setter do ano
    public int getAno(){return ano;}
    public void setAno(int ano){this.ano = ano;}

    public String toString(){
        return getDia() + "/" +getMes()+ "/" + getAno();
    }
}
