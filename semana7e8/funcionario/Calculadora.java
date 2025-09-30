package semana7e8.funcionario;

public class Calculadora {
    public double memoria;
    public String cor;

    public Calculadora(){

    }

    public Calculadora(double memoria, String cor){
        this.memoria = 0;
        this.cor = cor;
    }

    public double getMemoria(){
        return memoria;
    }

    public void setMemoria(double memoria){
        this.memoria = memoria;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public double soma(double n1, double n2){
        return n1 + n2; 
    }

    public double subtrai(double n1, double n2){
        return n1 - n2;
    }

    public double multiplica(double n1, double n2){
        return n1 * n2;
    }

    public double divide(double n1, double n2){
        return n1 / n2;
    }

    public int elevaAoQuadrado(int n){
        return n * n;   
    }

    public int elevaAoCubo(int n){
        return n * n * n; 
    }

    public void imprimeInfo(){
        System.out.println("Memoria: " + getMemoria() + "\nCor: " + getCor());
    }
}
