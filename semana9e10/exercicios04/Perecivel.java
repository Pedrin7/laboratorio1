package semana9e10.exercicios04;

public class Perecivel extends Produto{
    private Data dataValidade;

    public Perecivel(String nome, String descricao, double valor, Data dataValidade){
        super(nome, descricao, valor);
        this.dataValidade = dataValidade;
    }

    public void setDataDeValidade(Data dataValidade){this.dataValidade = dataValidade;}
    public Data getDataDeValidade(){return dataValidade;}

    public String toString(){
        return "Data de validade: " +dataValidade.toString();
    }
}
