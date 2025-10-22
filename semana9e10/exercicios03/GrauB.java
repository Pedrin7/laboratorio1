package semana9e10.exercicios03;

public class GrauB extends Grau{
    private double atividades;
    private double seminario;
    private double participacao;

    public GrauB(double atividades, double seminario, double participacao, String dataComeco, String dataFim){
        super(dataComeco, dataFim);
        this.atividades = atividades;
        this.seminario = seminario;
        this.participacao = participacao;
    }

    public GrauB(){
        this.atividades = 0;
        this.seminario = 0;
        this.participacao = 0;
    }

    public void setAtividade(double atividades){this.atividades = atividades;}
    public double getAtividade(){return atividades;}

    public void setSeminario(double seminario){this.seminario = seminario;}
    public double getSeminario(){return seminario;}

    public void setParticipacao(double participacao){this.participacao = participacao;}
    public double getParticipacao(){return participacao;}

    @Override
    public String toString(){
        return "Grau B:\nNota das atividades: " +getAtividade()+ "\nNota do seminário: " +getSeminario()+ 
            "\nNota de participação: " +getParticipacao();
    }

    public double calculaNotaFinalGrau(){
        double notaFinal = (getAtividade() * 0.3) + (getSeminario() * 0.6) + (getParticipacao() * 0.1);
        return notaFinal;
    }

}
