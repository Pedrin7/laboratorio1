import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        while (opcao != 3) {
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Informe o nome da loja: ");
                String nome = sc.nextLine();
                System.out.println("Informe a quantidade de funcionários: ");
                int qtdFuncionarios = sc.nextInt();
                sc.nextLine();
                System.out.println("Informe o salário base dos funcionários: ");
                double salarioBase = sc.nextDouble();
                sc.nextLine();
                System.out.println("Informe a quantidade de espaço que o estoque suporta: ");
                int qtdEstoque = sc.nextInt();
                sc.nextLine();
                System.out.println("Informe o nome da rua da loja: ");
                String nomeRua = sc.nextLine();
                System.out.println("Informe o nome da cidade: ");
                String cidade = sc.nextLine();
                System.out.println("Informe o nome do estado: ");
                String estado = sc.nextLine();
                System.out.println("Informe o nome do país: ");
                String pais = sc.nextLine();
                System.out.println("Informe o CEP da loja: ");
                String cep = sc.nextLine();
                System.out.println("Informe o numero da loja: ");
                String num = sc.nextLine();
                System.out.println("Informe o complemento: ");
                String complemento = sc.nextLine();
                System.out.println("Informe o dia da fundação da loja: ");
                int dia = sc.nextInt();
                sc.nextLine();
                System.out.println("Informe o mês da fundação da loja: ");
                int mes = sc.nextInt();
                sc.nextLine();
                System.out.println("Informe o ano da fundação da loja: ");
                int ano = sc.nextInt();
                sc.nextLine();

                loja = new Loja(nome, qtdFuncionarios, salarioBase, new Endereco(nomeRua, cidade, estado, pais, cep, num, complemento), new Data(dia, mes, ano), qtdEstoque);
            }
            else if(opcao == 2){
                System.out.println("Informe o nome do produto: ");
                String nomeProduto = sc.nextLine();
                System.out.print("Informe o preço do produto: R$");
                double precoProduto = sc.nextDouble();
                sc.nextLine();
                System.out.println("Informe o dia da data de validade do produto: ");
                int diaValidade = sc.nextInt();
                sc.nextLine();
                System.out.println("Informe o mês da data de validade do produto: ");
                int mesValidade = sc.nextInt();
                sc.nextLine();
                System.out.println("Informe o ano da data de validade do produto: ");
                int anoValidade = sc.nextInt();
                sc.nextLine();

                produto = new Produto(nomeProduto, precoProduto, new Data(diaValidade, mesValidade, anoValidade));
            }else if(opcao > 3 || opcao < 1){
                System.out.println("Opção inválida");
            }
        }
        if (loja != null && produto != null) {
            System.out.println(loja.toString());
            Data data = new Data(20, 10, 2023);
            if(produto.estaVencido(data) == true){
                System.out.println("PRODUTO VENCIDO!");
            }else{
                System.out.println("PRODUTO NÃO VENCIDO!");
            }
        }else{
            System.out.println("Faltou a criação da loja ou a criação do produto, por isso nada foi impresso.");
        }
        sc.close();
    }
}
