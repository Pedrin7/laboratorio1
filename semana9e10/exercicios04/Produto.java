package semana9e10.exercicios04;

public class Produto {
    private String nome;
    private String descricao;
    private double valor;

    public Produto(String nome, String descricao, double valor){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return nome;}

    public void setDescricao(String descricao){this.descricao = descricao;}
    public String getDescricao(){return descricao;}

    public void setValor(double valor){this.valor = valor;}
    public double getValor(){return valor;}

    public String toString(){
        return "Nome: " +getNome()+ "\nDescrição: " +getDescricao()+ "\nValor: R$" +getValor();
    }
}
