package semana9e10.exercicios01;

public class Cadeira {
    public Cor cor;
    public Aluno aluno;

    public Cadeira(Cor cor){
        this.cor = cor;
    }

    public void setCor(Cor cor){this.cor = cor;}
    public Cor getCor(){return cor;}

    public void setAluno(Aluno aluno){this.aluno = aluno;}
    public Aluno getAluno(){return aluno;}

    @Override
    public String toString(){
        return "\nCor da cadeira:\n" +getCor()+ "\nAluno que senta na cadeira: "+getAluno();
    }

}
