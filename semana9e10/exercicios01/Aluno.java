package semana9e10.exercicios01;

public class Aluno{
    public String nome;
    public int idade;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return nome;}

    public void setIdade(int idade){this.idade = idade;}
    public int getIdade(){return idade;}

    @Override
    public String toString(){
        return "Nome: " +getNome()+ "\nIdade: " + getIdade();
    }
}