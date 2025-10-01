package semana7e8.ifElse;

public class Pessoa {
    public String nome;
    public String sexo;
    public int idade;
    public double altura;
    public int qtdIrmaos;
    public String endereco;

    public Pessoa(){

    }

    public Pessoa(String nome, String sexo, int idade, double altura, int qtdIrmaos, String endereco){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.qtdIrmaos = qtdIrmaos;
        this.endereco = endereco;
    }

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public String getSexo(){return sexo;}
    public void setSexo(String sexo){this.sexo = sexo;}

    public int getIdade(){return idade;}
    public void setIdade(int idade){this.idade = idade;}

    public double getAltura(){return altura;}
    public void setAltura(double altura){this.altura = altura;}

    public int getQtdIrmaos(){return qtdIrmaos;}
    public void setQtdIrmaos(int qtdIrmaos){this.qtdIrmaos = qtdIrmaos;}

    public String getEndereco(){return endereco;}
    public void setEndereco(String enderco){this.endereco = enderco;}

    public void infoPessoa(){
        System.out.println("Nome: "+getNome()+ "\nSexo: "+getSexo()+ "\nIdade: "+getIdade()+ 
            "\nAltura: "+getAltura()+ "\nQuantidade de irmãos: "+getQtdIrmaos()+ "\nEndereço: "+getEndereco());
    }

    public boolean isFilhoUnico(){
        if (getQtdIrmaos() == 0) {
            return true;
        }else{
            return false;
        }
    }



}
