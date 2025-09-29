package semana7e8.livro;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Cliente c1 = new Cliente(new Livro());

        Scanner sc = new Scanner(System.in);

        System.out.println("Abaixo preencha as informações do cliente: ");
        System.out.print("Nome: ");
        c1.setNome(sc.nextLine());
        System.out.print("Idade: ");
        c1.setIdade(sc.nextInt());
        sc.nextLine();
        System.out.print("Sexo: ");
        c1.setSexo(sc.nextLine());
        System.out.print("Email: ");
        c1.setEmail(sc.nextLine());
        System.out.print("Senha: ");
        c1.setSenha(sc.nextLine());
        System.out.println("Abaixo preencha as informações do livro do cliente: ");
        System.out.print("Título: ");
        c1.getLivro().setTitulo(sc.nextLine());
        System.out.print("Autor: ");
        c1.getLivro().setAutor(sc.nextLine());
        System.out.print("Ano de publicação: ");
        c1.getLivro().setAnoDePublicacao(sc.nextInt());
        sc.nextLine();
        System.out.print("Preço: R$ ");
        c1.getLivro().setPreco(sc.nextDouble());
        sc.nextLine();
        System.out.print("Quantidade de páginas: ");
        c1.getLivro().setQtdPaginas(sc.nextInt());

        System.out.println("O cliente " + c1.getNome() + " está com o livro " + c1.getLivro().getTitulo() 
            +" e o preço por página deste livro é: R$ " +c1.getLivro().precoPorPaginaFormatado() +".");

        c1.imprimeInformacoes();
        sc.close();

        // preguiça de fazer o outros 02 clientes + livros que se pede
    }
}
