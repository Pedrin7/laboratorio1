package semana9e10.exercicios04;

public class NaoPerecivel extends Produto{
    private Data dataFabricacao;

    public NaoPerecivel(String nome, String descricao, double valor, Data dataFabricacao){
        super(nome, descricao, valor);
        this.dataFabricacao = dataFabricacao;
    }

    public void setDataDeFabricacao(Data dataFabricacao){this.dataFabricacao = dataFabricacao;}
    public Data getDataDeFabricacao(){return dataFabricacao;}

    public String toString(){
        return "Data de fabricação: " +dataFabricacao.toString();
    }
}
