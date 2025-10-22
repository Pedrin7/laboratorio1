package semana9e10.exercicios03;

public class Grau {
    private String dataComeco;
    private String dataFim;

    public Grau(String dataComeco, String dataFim){
        this.dataComeco = dataComeco;
        this.dataFim = dataFim;
    }
    
    public Grau(){
        this.dataComeco = null;
        this.dataFim = null;
    }
    
    public void setDataComeco(String dataComeco){this.dataComeco = dataComeco;}
    public String getDataComeco(){return dataComeco;}

    public void setDataFim(String dataFim){this.dataFim = dataFim;}
    public String getDataFim(){return dataFim;}

    public String toString(){
        return "Começo: " +getDataComeco()+ "\nFim: " +getDataFim();
    }
}