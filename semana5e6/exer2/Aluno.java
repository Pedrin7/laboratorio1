package exer2;

public class Aluno {
    public String nome;
    public String matricula;
    public double grauA;
    public double grauB;

    public Aluno(String nome, String matricula, double grauA, double grauB){
        this.nome = nome;
        this.matricula = matricula;
        this.grauA = grauA;
        this.grauB = grauB;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public double getGrauA(){
        return grauA;
    }

    public void setGrauA(double grauA){
        this.grauA = grauA;
    }

    public double getGrauB(){
        return grauB;
    }

    public void setGrauB(double grauB){
        this.grauB = grauB;
    }

    // Método para calcular a média final
    public String calculaMediaFinal(){
        double mediaFinal = (grauA * 0.33) + (grauB * 0.67);
        String mediaFinalFormatada = String.format("%.1f", mediaFinal);
        return mediaFinalFormatada; 
    }

    public String imprimeInfo(){
        String imprime = "Nome: "+getNome()+ "\nNúmero da matrícula: " +matricula+ "\nA média final do aluno é: " +calculaMediaFinal();
        return imprime;
    }

}
