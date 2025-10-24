package semana9e10.exercicios05;

public class Corredor extends Atleta{
    private double peso;
    private Competicao competicao;

    public Corredor(String nome, int idade, double peso, Competicao competicao){
        super(nome, idade);    
        this.peso = peso;
        this.competicao = competicao;
    }

    public void setPeso(double peso){this.peso = peso;}
    public double getPeso(){return peso;}

    public void setCompeticao(Competicao competicao){this.competicao = competicao;}
    public Competicao getCompeticao(){return competicao;}

    public void imprimeCompeticao(){
        System.out.println("Nome da competição: " +getCompeticao().getNomeCompeticao()+
            "\nData da competição: " +getCompeticao().getData());
    }

    @Override
    public void imprimeInfo(){
        System.out.println("Nome: " +getNome()+ "\nIdade: " +getIdade()+
            "\nPeso: " +getPeso()+"kg");
    }
}
