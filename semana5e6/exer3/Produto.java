package exer3;

public class Produto {
    public String nome;
    public double valor;
    public String descricao;
    public int qtdEstoque;

    public Produto(String nome, double valor, String descricao, int qtdEstoque){
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this. qtdEstoque = qtdEstoque;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getQtdEstoque(){
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }
}