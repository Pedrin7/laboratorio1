package semana9e10.exercicios03;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        // Criação das classes abaixo
        // teclado
        Scanner sc = new Scanner(System.in);

        // Graus dos alunos
        GrauA ga1 = new GrauA();
        GrauB gb1 = new GrauB();

        GrauA ga2 = new GrauA();
        GrauB gb2 = new GrauB();

        // Alunos
        Aluno a1 = new Aluno(null, ga1, gb1);
        Aluno a2 = new Aluno(null, ga2, gb2);

        // Turma
        Turma t1 = new Turma(0, a1, a2, null);

        System.out.println("Informe o código da turma: ");
        int codigo = sc.nextInt();
        t1.setCodigo(codigo);

        sc.nextLine();
        
        System.out.println("Informe o nome do primeiro aluno: ");
        String nome = sc.nextLine();
        a1.setNome(nome);

        System.out.println("Informe as notas do "+ a1.getNome()+ " referente ao Grau A: ");
        System.out.println("--------------------------");
        System.out.print("Trabalho: ");
        double trab = sc.nextDouble();
        ga1.setTrabalho(trab);
        System.out.print("Prova: ");
        double prov = sc.nextDouble();
        ga1.setProva(prov);

        System.out.println("Informe as notas do " +a1.getNome()+ " referente ao Grau B: ");
        System.out.println("--------------------------");
        System.out.print("Atividades: ");
        double atvd = sc.nextDouble();
        gb1.setAtividade(atvd);

        System.out.print("Seminário: ");
        double semi = sc.nextDouble();
        gb1.setSeminario(semi);

        System.out.print("Participação: ");
        double part = sc.nextDouble();
        gb1.setParticipacao(part);

        System.out.println("---------------------------");

        sc.nextLine();

        System.out.println("Informe o nome do segundo aluno: ");
        String nome2 = sc.nextLine();
        a2.setNome(nome2);

        System.out.println("Informe as notas do "+ a2.getNome()+ " referente ao Grau A: ");
        System.out.println("--------------------------");
        System.out.print("Trabalho: ");
        double trab2 = sc.nextDouble();
        ga2.setTrabalho(trab2);
        System.out.print("Prova: ");
        double prov2 = sc.nextDouble();
        ga2.setProva(prov2);

        System.out.println("Informe as notas do " +a2.getNome()+ " referente ao Grau B: ");
        System.out.println("--------------------------");
        System.out.print("Atividades: ");
        double atvd2 = sc.nextDouble();
        gb2.setAtividade(atvd2);

        System.out.print("Seminário: ");
        double semi2 = sc.nextDouble();
        gb2.setSeminario(semi2);

        System.out.print("Participação: ");
        double part2 = sc.nextDouble();
        gb2.setParticipacao(part2);

        // System.out.println("Nota final do " +a1.getNome()+ " é: " +a1.calculaNotaFinal());
        // System.out.println("Nota final do " +a2.getNome()+ " é: " +a2.calculaNotaFinal());

        // System.out.println("A média de notas da turma " +t1.getCodigo()+ " é: " +t1.mediaNotasTurma());

        if (a1.calculaNotaFinal() >= 6) {
            System.out.println("Aluno " +a1.getNome()+ " passou por média, e a média foi: " +a1.calculaNotaFinal());
        }else{
            System.out.println("Aluno " + a1.getNome()+ " ficou em GRAU C!");
        }

        if (a2.calculaNotaFinal() >= 6) {
            System.out.println("Aluno " +a2.getNome()+ " passou por média, e a média foi: " +a2.calculaNotaFinal());
        }else{
            System.out.println("Aluno " + a2.getNome()+ " ficou em GRAU C!");
        }

        sc.close();
    }
}
