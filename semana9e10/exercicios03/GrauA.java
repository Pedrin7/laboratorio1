package semana9e10.exercicios03;

public class GrauA extends Grau{
    private double trabalho;
    private double prova;

    public GrauA(double trabalho, double prova, String dataComeco, String dataFim){
        super(dataComeco, dataFim);
        this.trabalho = trabalho;
        this.prova = prova;
    }

    public GrauA(){
        this.trabalho = 0;
        this.prova = 0;
    }

    public void setTrabalho(double trabalho){this.trabalho = trabalho;}
    public double getTrabalho(){return trabalho;}

    public void setProva(double prova){this.prova = prova;}
    public double getProva(){return prova;}

    @Override
    public String toString(){
        return "Grau A:\nNota do trabalho: " +getTrabalho()+ "\nNota da prova: " +getProva(); 
    }

    public double calculaNotaFinalGrau(){
        double notaFinal = (getTrabalho() * 0.3) + (getProva() * 0.7);
        return notaFinal;
    }
}   
