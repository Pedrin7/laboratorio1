package semana9e10.exercicios01;

public class CadeiraComMesa extends Cadeira{
    public double larguraMesaAcoplada;
    public double profundidadeMesaAcoplada;

    public CadeiraComMesa(Cor cor, Aluno aluno, double larguraMesaAcoplada, double profundidadeMesaAcoplada){
        super(cor);
        this.larguraMesaAcoplada = larguraMesaAcoplada;
        this.profundidadeMesaAcoplada = profundidadeMesaAcoplada;
        this.aluno = aluno;
    }

    public void setLarguraMesaAcoplada(double larguraMesaAcoplada){this.larguraMesaAcoplada = larguraMesaAcoplada;}
    public double getLarguraMesaAcoplada(){return larguraMesaAcoplada;}

    public void setProfundidadeMesaAcoplada(double profundidadeMesaAcoplada){this.profundidadeMesaAcoplada = profundidadeMesaAcoplada;}
    public double getProfundidadeMesaAcoplada(){return profundidadeMesaAcoplada;}

    @Override
    public String toString(){
        return "A cadeira com mesa possui a seguinte cor:\n" +getCor()+ "\nA largura da mesa da cadeira é: " +getLarguraMesaAcoplada()+ 
            "\nA profundidade da mesa da cadeira é: " +getProfundidadeMesaAcoplada();
    }
}
