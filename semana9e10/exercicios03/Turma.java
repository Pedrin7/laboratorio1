package semana9e10.exercicios03;

public class Turma {
    private int codigo;
    private Aluno a1;
    private Aluno a2;
    private Aluno a3;

    public Turma(int codigo, Aluno a1, Aluno a2, Aluno a3){
        this.codigo = codigo;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public void setCodigo(int codigo){this.codigo = codigo;}
    public int getCodigo(){return codigo;}

    public double mediaNotasTurma(){
        double mediaNotas = 0;
        int cont = 0;
        double a1notaFinal = 0;
        double a2notaFinal = 0;
        double a3notaFinal = 0;

        if (a1 != null) {
            a1notaFinal = a1.calculaNotaFinal();
            cont++;
        }else{
            a1notaFinal = 0;
        }
        if(a2 != null){
            a2notaFinal = a2.calculaNotaFinal();
            cont++;
        }else{
            a2notaFinal = 0;
        }
        if (a3 != null) {
            a3notaFinal = a3.calculaNotaFinal();
            cont++;
        }else{
            a3notaFinal = 0;
        }

        if (cont == 0) {
            return -1;
        }else{
            mediaNotas = (a1notaFinal + a2notaFinal + a3notaFinal) / cont;
            return mediaNotas;
        }
    }  
    
    public void alteraNotasGrauA(Aluno a, double notaAlteradaTrabalho, double notaAlteradaProva){
        Grau grau = a.getGrauA();

        if(grau instanceof GrauA){
            GrauA ga = (GrauA) grau;

            ga.setTrabalho(notaAlteradaTrabalho);
            ga.setProva(notaAlteradaProva);
        }  
    }

    public void alteraNotasGrauB(Aluno a, double notaAlteradaAtividade, double notaAlteradaSeminario, double notaAlteradaParticipacao){
        Grau grau = a.getGrauB();

        if(grau instanceof GrauB){
            GrauB gb = (GrauB) grau;

           gb.setAtividade(notaAlteradaAtividade);
           gb.setSeminario(notaAlteradaSeminario);
           gb.setParticipacao(notaAlteradaParticipacao);
        }  
    }
}
