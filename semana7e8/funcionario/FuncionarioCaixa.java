package semana7e8.funcionario;

public class FuncionarioCaixa {
    public String nome;
    public String endereco;
    public String sexo;
    public Calculadora calculadora;

    public FuncionarioCaixa(){
        this.nome = "";
        this.endereco = "";
        this.sexo = "";
        this.calculadora = null;
    }

    public FuncionarioCaixa(String nome, String endereco, String sexo, Calculadora calculadora){
        this.nome = nome;
        this. endereco = endereco;
        this.sexo = sexo;
        this.calculadora = calculadora;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public Calculadora getCalculadora(){
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora){
        this.calculadora = calculadora;
    }

    public double soma(){
        return calculadora.soma(0, 0);
    }

    public double subtrai(){
        return calculadora.subtrai(0, 0);
    }

    public double multiplica(){
        return calculadora.multiplica(0, 0);
    }

    public double divide(){
        return calculadora.divide(0, 0);
    }

    public int elevaAoQuadrado(){
        return calculadora.elevaAoQuadrado(0);
    }

    public int elevaAoCubo(){
        return calculadora.elevaAoCubo(0);
    }

    public void imprimeInfo(){
        System.out.println("Nome: " +getNome()+ "\nEndereço: " +getEndereco()+ "\nSexo: " +getSexo()+ 
            "\nMemória da calculadora: " +calculadora.getMemoria()+ "\nCor da calculadora: " +calculadora.getCor());
    }
}
