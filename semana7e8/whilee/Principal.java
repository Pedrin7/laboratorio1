package semana7e8.whilee;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Exercicios e = new Exercicios();
        int opcao = 0;

        System.out.println("1. conta até 300"+"\n2. imprime pares"+"\n3. verifica primo");
        System.out.println("Qual a opção desejada?");
        opcao = sc.nextInt();

        while (opcao >= 1 && opcao <= 3) {
            if (opcao == 1) {
                System.out.println("Informe um número: ");
                int num = sc.nextInt();
                System.out.println("-------------");
                e.contador(num);
            }else if(opcao == 2){
                System.out.println("Informe um número: ");
                int num = sc.nextInt();
                System.out.println("-------------");
                e.imprimePares(num);
            }else if(opcao == 3){
                System.out.println("Informe um número: ");
                int num = sc.nextInt();
                System.out.println("-------------");
                e.verificaPrimo(num);
            }else{
                System.out.println("Opção inválida!");
                break;
            }
            System.out.println("-------------");
            System.out.println("1. conta até 300"+"\n2. imprime pares"+"\n3. verifica primo");
            opcao = sc.nextInt();
        }

        sc.close();
    }
}
