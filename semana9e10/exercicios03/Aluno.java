package semana9e10.exercicios03;

public class Aluno {
    private String nome;
    private Grau ga;
    private Grau gb;

    public Aluno(String nome, Grau ga, Grau gb){
        this.nome = nome;
        this.ga = ga;
        this.gb = gb;
    }

    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return nome;}

    public void setGrauA(Grau ga){this.ga = ga;}
    public Grau getGrauA(){return ga;}

    public void setGrauB(Grau gb){this.gb = gb;}
    public Grau getGrauB(){return gb;}

    public String toString(){
        return "Nome: " +getNome();
    }

    public double calculaNotaFinal(){

        double notaFinal = (((GrauA)this.ga).calculaNotaFinalGrau() * 0.33) + (((GrauB)this.gb).calculaNotaFinalGrau() * 0.67);
        return notaFinal;
    }
}
