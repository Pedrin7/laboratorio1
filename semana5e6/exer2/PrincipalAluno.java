package exer2;
import java.util.Scanner;

public class PrincipalAluno {
    
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        Aluno a1 = new Aluno("Brandamente Brasil", "1585258", 5, 9);
        Aluno a2 = new Aluno("Radigunda Cercená", "2254879", 8, 2);
        Aluno a3 = new Aluno("Vitimado José Araújo", "0085994", 5, 9);

        a2.setGrauA(9);
        a1.setMatricula("1585228");

        System.out.println("Informe a nova nota do Grau B de Radigunda: ");
        double grauB = sc.nextDouble();
        a2.setGrauB(grauB);

        System.out.println("--------------------------------------");
        System.out.println(a1.imprimeInfo());
        System.out.println("--------------------------------------");
        System.out.println(a2.imprimeInfo());
        System.out.println("--------------------------------------");
        System.out.println(a3.imprimeInfo());
        System.out.println("--------------------------------------");
        System.out.println("Apenas a média final de Radigunda: " + a2.calculaMediaFinal());
        System.out.println("--------------------------------------");
        System.out.println("Apenas a mátricula de Vitimado: " + a3.getMatricula());


        sc.close();

    }
}
