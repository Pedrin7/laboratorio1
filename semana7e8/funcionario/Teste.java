package semana7e8.funcionario;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Criação do objeto Empresa
        Empresa empresa1 =  new Empresa();
        System.out.println("Informe o nome da empresa: ");
        empresa1.setNome(sc.nextLine());
        System.out.println("------------------------");

        // Craição dos objetos funcionários  
        FuncionarioCaixa funcionario = new FuncionarioCaixa();
        FuncionarioCaixa funcionario2 = new FuncionarioCaixa();

        //Criação do relacionmento entre funcionarios e a empresa, ou seja, a empresa agora tem 02 funcionários
        empresa1.fun1 = funcionario;
        empresa1.fun2 = funcionario2;

        //Criação do relacionamento e criação das calculadoras dos funcionários
        funcionario.calculadora =  new Calculadora();
        funcionario2.calculadora =  new Calculadora();

        //Criação do funcionário 01 através do teclado + operações matemáticas
        System.out.println("Informe o nome do funcionário 01: ");
        funcionario.setNome(sc.next());
        sc.nextLine();
        System.out.println("Informe o endereço do funcionário 01: ");
        funcionario.setEndereco(sc.nextLine());
        System.out.println("Informe o sexo do funcionário 01: ");
        funcionario.setSexo(sc.next());
        System.out.println("Informe a cor da calculadora do funcionário 01: ");
        funcionario.calculadora.setCor(sc.next());
        System.out.println("---------------------------------");
        funcionario.imprimeInfo();
        System.out.println("---------------------------");
        System.out.println("Soma: " +funcionario.calculadora.soma(2, 2));
        System.out.println("Subtrai: " +funcionario.calculadora.subtrai(5, 4));
        System.out.println("Multiplica: "+funcionario.calculadora.multiplica(2, 3));
        System.out.println("Divisão: " +funcionario.calculadora.divide(6, 3));
        System.out.println("Elevado ao quadrado: " +funcionario.calculadora.elevaAoQuadrado(72));
        System.out.println("Elevado ao cubo: " +funcionario.calculadora.elevaAoCubo(83));
        System.out.println("---------------------------");

        //Criação do funcionário 0 através do teclado + operações matemáticas
        System.out.println("Informe o nome do funcionário 02: ");
        funcionario2.setNome(sc.next());
        sc.nextLine();
        System.out.println("Informe o endereço do funcionário 01: ");
        funcionario2.setEndereco(sc.nextLine());
        System.out.println("Informe o sexo do funcionário 01: ");
        funcionario2.setSexo(sc.next());
        System.out.println("Informe a cor da calculadora do funcionário 01: ");
        funcionario2.calculadora.setCor(sc.next());
        System.out.println("---------------------------------");
        funcionario2.imprimeInfo();
        System.out.println("-----------------");

        //imprimindo as informações da empresa abaixo
        empresa1.imprimeInfo();


        sc.close();
    }
}
