package exer3;

public class Computador {
    public String marca;
    public double velocidade;
    public int anoFabricacao;
    public char novo;

    public Computador(String marca, double velocidade, int anoFabricacao, char novo){
        this.marca = marca;
        this.velocidade = velocidade;
        this.anoFabricacao = anoFabricacao;
        this.novo = novo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    
    public char getNovo(){
        return novo;
    }

    public void setNovo(char novo){
        this.novo = novo;
    }
}
