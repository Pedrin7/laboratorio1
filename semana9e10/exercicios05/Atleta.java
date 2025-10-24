package semana9e10.exercicios05;

public class Atleta {
    private String nome;
    private int idade;

    public Atleta(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return nome;}

    public void setIdade(int idade){this.idade = idade;}
    public int getIdade(){return idade;}

    public void imprimeInfo(){
        System.out.println("Nome: " +getNome()+ "\nIdade: " +getIdade());
    }
}
