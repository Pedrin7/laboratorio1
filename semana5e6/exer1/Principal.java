package exer1;

import java.util.Scanner;

public class Principal {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        Livro l1 = new Livro();

        System.out.println("Nome do livro: ");
        String titulo = sc.nextLine();
        l1.setTitulo(titulo);
        System.out.println("Autor: ");
        String autor = sc.nextLine();
        l1.setAutor(autor);
        System.out.println("Ano da publicação do livro: ");
        int anoDePublicacao = sc.nextInt();
        l1.setAnoDePublicacao(anoDePublicacao);
        System.err.print("Preço do livro: R$ ");
        double preco = sc.nextDouble();
        l1.setPreco(preco);
        System.out.println("Quantidade de páginas: ");
        int qtdPaginas = sc.nextInt();
        l1.setQtdPaginas(qtdPaginas);

        System.out.println("-------------------------------");

        Cliente c1 = new Cliente();

        System.out.println("Nome: ");
        String nome = sc.next();
        c1.setNome(nome);
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        c1.setIdade(idade);
        System.out.println("Sexo: M ou F");
        char sexo = sc.next().charAt(0);
        c1.setSexo(sexo);
        System.out.println("E-mail: ");
        String email = sc.next();
        c1.setEmail(email);
        System.out.println("Senha: ");
        String senha = sc.next();
        c1.setSenha(senha);

        System.out.println("-----------------------------------");
        System.out.println("Informações do autor/autora abaixo:");
        System.out.println(c1.imprimeInformacoes());
        System.out.println("-----------------------------------");
        System.out.println("Informações do livro do autor/autora:");
        System.out.println(l1);
        System.out.println("-----------------------------------");
        System.out.println("Preço por página: "+l1.calcularPrecoPorPagina());

        sc.close();
    }
}
