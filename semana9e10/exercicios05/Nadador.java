package semana9e10.exercicios05;

public class Nadador extends Atleta{
    private String categoria;

    public Nadador(String nome, int idade, String categoria){
        super(nome, idade);
        this.categoria = categoria;
    }

    public void setCategoria(String categoria){this.categoria = categoria;}
    public String getCategoria(){return categoria;}

    @Override
    public void imprimeInfo(){
        System.out.println("Nome: " +getNome()+ "\nIdade: " +getIdade()+ "\nCategoria: " +getCategoria());
    }
}
