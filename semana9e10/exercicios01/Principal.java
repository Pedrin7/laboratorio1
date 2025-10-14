package semana9e10.exercicios01;
import java.util.Scanner;
import javax.swing.*; 
import java.awt.Color;

public class Principal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome da sala: ");
        String salaNome = sc.nextLine();
        System.out.println();
        Data d1 = new Data(01, 07, 2023);
        Data d2 = new Data(20, 05, 2025);
        CadeiraComMesa cadeira01 = new CadeiraComMesa(null, null, 10, 20);
        CadeiraComMesa cadeira02 = new CadeiraComMesa(null, null, 5, 10);
        CadeiraComRodinhas cadeira03 = new CadeiraComRodinhas(d1, null, null);
        CadeiraComRodinhas cadeira04 = new CadeiraComRodinhas(d2, null, null);

        Sala sala = new Sala(salaNome, cadeira01, cadeira02, cadeira03, cadeira04);

        System.out.println("Informe a cor da cadeira01: ");
        System.out.print("R: ");
        int r1 = sc.nextInt();
        System.out.print("G: ");
        int g1 = sc.nextInt();
        System.out.print("B: ");
        int b1 = sc.nextInt();
        Cor cor1 = new Cor(r1, g1, b1);

        System.out.println("Informe a cor da cadeira02: ");
        System.out.print("R: ");
        int r2 = sc.nextInt();
        System.out.print("G: ");
        int g2 = sc.nextInt();
        System.out.print("B: ");
        int b2 = sc.nextInt();
        Cor cor2 = new Cor(r2, g2, b2);

        System.out.println("Informe a cor da cadeira03: ");
        System.out.print("R: ");
        int r3 = sc.nextInt();
        System.out.print("G: ");
        int g3 = sc.nextInt();
        System.out.print("B: ");
        int b3 = sc.nextInt();
        Cor cor3 = new Cor(r3, g3, b3);

        System.out.println("Informe a cor da cadeira04: ");
        System.out.print("R: ");
        int r4 = sc.nextInt();
        System.out.print("G: ");
        int g4 = sc.nextInt();
        System.out.print("B: ");
        int b4 = sc.nextInt();
        Cor cor4 = new Cor(r4, g4, b4);

        cadeira01.setCor(cor1);
        cadeira02.setCor(cor2);
        cadeira03.setCor(cor3);
        cadeira04.setCor(cor4);

        System.out.println("-------------------------------------------");
        System.out.println("Informe o nome do primeiro aluno: ");
        String nome01 = sc.next();
        System.out.println("Informe a idade do primeiro aluno: ");
        int idade01 = sc.nextInt();
        Aluno a1 = new Aluno(nome01, idade01);

        System.out.println("-------------------------------------------");
        System.out.println("Informe o nome do segundo aluno: ");
        String nome02 = sc.next();
        System.out.println("Informe a idade do segundo aluno: ");
        int idade02 = sc.nextInt();
        Aluno a2 = new Aluno(nome02, idade02);
        
        System.out.println("-------------------------------------------");
        System.out.println("Informe o nome do terceiro aluno: ");
        String nome03 = sc.next();
        System.out.println("Informe a idade do terceiro aluno: ");
        int idade03 = sc.nextInt();
        Aluno a3 = new Aluno(nome03, idade03);

        System.out.println("-------------------------------------------");
        System.out.println("Informe o nome do quarto aluno: ");
        String nome04 = sc.next();
        System.out.println("Informe a idade do quarto aluno: ");
        int idade04 = sc.nextInt();
        Aluno a4 = new Aluno(nome04, idade04);

        System.out.println("-------------------------------------------");
        System.out.println("Informe o nome do quinto aluno: ");
        String nome05 = sc.next();
        System.out.println("Informe a idade do quinto aluno: ");
        int idade05 = sc.nextInt();
        Aluno a5 = new Aluno(nome05, idade05);

        System.out.println("-------------------------------------------");
        System.out.println("Informe o nome do sexto aluno: ");
        String nome06 = sc.next();
        System.out.println("Informe a idade do sexto aluno: ");
        int idade06 = sc.nextInt();
        Aluno a6 = new Aluno(nome06, idade06);
        System.out.println("-------------------------------------------");

        System.out.println(sala.entraAluno(a1, "mesa"));
        System.out.println(sala.entraAluno(a2, "mesa"));
        System.out.println(sala.entraAluno(a3, "mesa"));
        System.out.println(sala.entraAluno(a4, "mesa"));
        System.out.println(sala.entraAluno(a5, "rodinha"));
        System.out.println(sala.entraAluno(a6, "rodinha"));

        System.out.println("-------------------------------------------");

        System.out.println("Aluno da cadeira01: "+cadeira01.getAluno().getNome() + "\nInformações da cadeira: " +cadeira01.toString());
        System.out.println("-------------------------------------------");
        System.out.println("Aluno da cadeira02: "+cadeira02.getAluno().getNome() + "\nInformações da cadeira: " +cadeira02.toString());
        System.out.println("-------------------------------------------");
        System.out.println("Aluno da cadeira03: "+cadeira03.getAluno().getNome() + "\nInformações da cadeira: " +cadeira03.toString());
        System.out.println("-------------------------------------------");
        System.out.println("Aluno da cadeira04: "+cadeira04.getAluno().getNome() + "\nInformações da cadeira: " +cadeira04.toString());
        System.out.println("-------------------------------------------");

        sc.close();
    }
}
