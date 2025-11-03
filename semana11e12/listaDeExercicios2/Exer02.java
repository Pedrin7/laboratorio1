package semana11e12.listaDeExercicios2;
import java.util.Scanner;

public class Exer02 {

    static Scanner sc =  new Scanner(System.in);
    String nome = "";
    public static String[] exer02(){

        System.out.println("Informe a quantidade de nomes que irá informar: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        String[] array = new String[qtd];

        for(int i = 0; i < array.length; i++){
            System.out.println("Informe o " +(i + 1)+ " nome: ");
            String nome = sc.nextLine();
            array[i] = nome;
        }

        System.out.print("Lista de nomes: ");

        for(int i = 0; i < array.length; i++){

            System.out.print(array[i]);

            if (i == array.length - 2) {
                System.out.print(" e ");
            }else if(i < array.length - 1){
                System.out.print(", ");
            }else{
                System.out.print(".");
            }

        }

        return array;    
    }

    public static void main(String[] args) {
        exer02();
        sc.close();
    }   
}
