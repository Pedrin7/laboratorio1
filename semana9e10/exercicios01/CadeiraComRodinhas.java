package semana9e10.exercicios01;

public class CadeiraComRodinhas extends Cadeira{
    public Data ultimaManutencao;
    public Aluno aluno;

    public CadeiraComRodinhas(Data ultimaManutencao, Cor cor,Aluno aluno){
        super(cor);
        this.ultimaManutencao = ultimaManutencao;
        this.aluno = aluno;
    }

    public void setUltimaManutencao(Data ultimaManutencao){this.ultimaManutencao = ultimaManutencao;}
    public Data getUltimaManutencao(){return ultimaManutencao;}

    @Override
    public String toString(){
        return "A última manutenção da cadeira com rodinhas foi em: " +getUltimaManutencao();
    }
}
