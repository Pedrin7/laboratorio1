package semana7e8.forr;
import java.util.Scanner;

public class ExerciciosFor {

    Scanner sc = new Scanner(System.in);

    public void exercicio1(int x){
        String nome = " ";
        for(int i = 0; i <= x; i++){
            System.out.println("Informe o nome de " +x+ " pessoas:");
            nome = sc.nextLine();
        }
    }

    public void exercicio2(int x){
        for(int i = 0; i <= x; i++){
            System.out.println("Número: "+i);
        }
    }

    public void exercicio3(int x){
        if (x <= 0) {
            System.out.println("O número informado é negativo, ERRO!");
        }else{
            System.out.println("Os números pares no intervalo de 0 ao número informado são:");
            for(int i = 0; i <= x; i++){
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public void exercicio4(int x){
        if (x <= 0) {
            System.out.println("Erro!");
        }else{
            for(int i = x; i >= 0 ; i--){
                System.out.println(i);
            }
        }
    }

    public void exercicio5(int x){
        String time = "";
        int contTorcedoresGremio = 0;
        for(int i = 0; x >= i; i++){
            System.out.println("Informe o seu time: ");
            time = sc.nextLine();
            if (time == "gremio" || time == "Gremio" || time == "Grêmio" || time == "grêmio") {
                contTorcedoresGremio++;
            }
        }
    }

    public double exercicio6(int x){
        double num = 0;
        double soma = 0;
        for(int i = 0; x >= i; i++){
            System.out.println("Informe " +x+ " números com ponto flutuantes");
            num = sc.nextDouble();
            soma += num;
        }
        return soma;
    }

    public int exercicio7(){
        int soma = 0;
        int num = 0;
        for(int i = 0;i <= 10; i++){
            System.out.println("Informe um número inteiro: ");
            num = sc.nextInt();
            soma += num;
        }
        return soma;
    }  
    
    public void exercicio8(){
        System.out.println("Quantos números você irá digitar? ");
        int quant = sc.nextInt();
        int num = 0;

        for(int i = quant; i >= 0; i--){
            System.out.println("Informe o número: ");
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("Zero!");
            }else if(num > 0){
                System.out.println("Positivo!");
            }else{
                System.out.println("Negativo!");
            }
        }
    }

    public void exercicio9(int val1, int val2){
        if (val1 >= 0 && val2 >= 0) {
            int maior = val1;
            int menor = val2;
            if (menor > maior) {
                maior = val2;
                menor = val1;
            }
            for(int i = menor + 1; i < maior; i++){
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Insira dois números positivos!");
        }
    }

    public void exercicio10(){
        int soma = 0;
        for(int i = 0; i <= 198; i++){
            soma += i;
        }
    }

    public int exercicio11(int val1, int val2){
        int soma = 0;
        for(int i = val1 + 1;i < val2; i++){
            if (i % 2 != 0) {
                soma += i;
            }
        }
        return soma;
    }

    public double exercicio12(){
        double num = 0;
        double soma = 0;
        double media = 0;
        for(int i = 1; i > 0; i++){
            System.out.println("Informe números positivos: ");
            num = sc.nextDouble();
            if (num > 0) {
                soma += num;
            }
            else{
                media = soma / i;
                break;
            }
        }
        return media;
    }

    public void exercicio13(int n){
        int fat = 1;
        if (n < 0) {
            System.out.println("O número informado tem que ser maior que 0.");
        }else if(n == 1 || n == 0){
            System.out.println("O fatorial de 1/0 é 1.");
        }
        else{
            for(int i = n; i > 1; i--){
                fat *= i;
            }
        }
    }

    public boolean exercicio14(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public void exercicio15(int x) {
    int soma = 0;
    System.out.println("Números primos entre 0 e " + x + ":");
    for (int i = 0; i <= x; i++) {
        if (exercicio14(i)) {
            System.out.print(i + " ");
            soma += i; 
        }
    }
    System.out.println("\nA soma de todos os primos encontrados é: " + soma);

    }
}
