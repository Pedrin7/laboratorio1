package semana9e10.exercicios05;

public class Competicao {
    private String nomeCompeticao;
    private Data data;

    public Competicao(String nomeCompeticao, Data data){
        this.nomeCompeticao = nomeCompeticao;
        this.data = data;
    }

    public void setNomeCompeticao(String nomeCompeticao){this.nomeCompeticao = nomeCompeticao;}
    public String getNomeCompeticao(){return nomeCompeticao;}

    public void setData(Data data){this.data = data;}
    public Data getData(){return data;}

    public void imprimeData(){
        data.imprimeInfo();
    }
}