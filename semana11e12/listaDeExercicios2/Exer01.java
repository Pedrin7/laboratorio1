package semana11e12.listaDeExercicios2;
import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de notas que irá informar: ");
        int qtdNotas = sc.nextInt();
        sc.nextLine();
        
        int[] listaNotas = new int[qtdNotas];
        int somaNotas = 0;
        for(int i = 0; i < listaNotas.length; i++){
            System.out.println("Informe a " +i+ " nota: ");
            int notas = sc.nextInt();
            sc.nextLine();
            somaNotas += notas;
        }

        int media = somaNotas / listaNotas.length;
        System.out.println("A médias aritmética das notas é: " +media);
        sc.close();
    }
}
