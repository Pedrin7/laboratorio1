package semana7e8.mercado;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Prateleira prat01 = new Prateleira();
        prat01.produto01 = new Produto(null, 0, null);
        prat01.produto01.dataDeValidade = new Data(0, 0, 0);
        prat01.produto02 = new Produto(null, 0, null);
        prat01.produto02.dataDeValidade = new Data(0, 0, 0);
        prat01.produto03 = new Produto(null, 0, null);
        prat01.produto03.dataDeValidade = new Data(0, 0, 0);
        
        //produto 01 - amaciante
        prat01.produto01.setNome("Amaciante");
        System.out.println("Informe o preço do amaciante: ");
        prat01.produto01.setPreco(sc.nextDouble());
        // verifica o preço que usuario digitou e ve se é um preço válido para o produto
        if (prat01.produto01.getPreco() <= 0){
            while (prat01.produto01.getPreco() <= 0) {
                System.out.println("Informe o preço do amaciante: ");
                prat01.produto01.setPreco(sc.nextDouble());
            }
        }
        prat01.produto01.dataDeValidade.setDia(10);
        prat01.produto01.dataDeValidade.setMes(4);
        prat01.produto01.dataDeValidade.setAno(2014);

        //produto 02 - creme dental
        prat01.produto02.setNome("Creme dental");
        System.out.println("Informe o preço do creme dental: ");
        prat01.produto02.setPreco(sc.nextDouble());
        // verifica o preço que usuario digitou e ve se é um preço válido para o produto
        if (prat01.produto02.getPreco() <= 0){
            while (prat01.produto02.getPreco() <= 0) {
                System.out.println("Informe o preço do creme dental: ");
                prat01.produto02.setPreco(sc.nextDouble());
            }
        }
        prat01.produto02.dataDeValidade.setDia(5);
        prat01.produto02.dataDeValidade.setMes(5);
        prat01.produto02.dataDeValidade.setAno(2015);

        //produto 03 - leite condensado
        prat01.produto03.setNome("Leite condensado");
        System.out.println("Informe o preço do leite condensado: ");
        prat01.produto03.setPreco(sc.nextDouble());
        // garante que o usuário digite um preço válido para o produto
        if (prat01.produto03.getPreco() <= 0){
            while (prat01.produto03.getPreco() <= 0) {
                System.out.println("Informe o preço do leite condensado: ");
                prat01.produto03.setPreco(sc.nextDouble());
            }
        }
        prat01.produto03.dataDeValidade.setDia(4);
        prat01.produto03.dataDeValidade.setMes(12);
        prat01.produto03.dataDeValidade.setAno(2012);

        Prateleira prat02 = new Prateleira();
        prat02.produto01 = new Produto(null, 0, null);
        prat02.produto01.dataDeValidade = new Data(0, 0, 0);
        prat02.produto01.setNome("Cortina");
        prat02.produto01.setPreco(167.98);
        prat02.produto01.dataDeValidade.setDia(13);
        prat02.produto01.dataDeValidade.setMes(10);
        prat02.produto01.dataDeValidade.setAno(2025);

        Mercado m1 = new Mercado(prat01, prat02);
        Data data = new Data(25, 04, 2025);
        m1.prat01.produto01.verificaProdutoVencido(data);
        m1.prat01.produto02.verificaProdutoVencido(data);
        m1.prat01.produto03.verificaProdutoVencido(data);
        m1.prat02.produto01.verificaProdutoVencido(data);

        if (m1.prat01.produto01.verificaProdutoVencido(data) == true){
            System.err.println("O produto " +m1.prat01.produto01.getNome()+ " está vencido!");
            System.out.println(m1.prat01.produto01.toString());
        }
        if(m1.prat01.produto02.verificaProdutoVencido(data) == true){
            System.err.println("O produto: " +m1.prat01.produto02.getNome()+ " está vencido!");
            System.out.println(m1.prat01.produto02.toString());
        }
        if(m1.prat01.produto03.verificaProdutoVencido(data) == true){
            System.err.println("O produto: " +m1.prat01.produto03.getNome()+ " está vencido!");
            System.out.println(m1.prat01.produto03.toString());
        }
        if (m1.prat02.produto01.verificaProdutoVencido(data) == true) {
            System.err.println("O produto: " +m1.prat02.produto01.getNome()+ " está vencido!");
            System.out.println(m1.prat02.produto01.toString());
        }

        Produto prodPrat1 = m1.prat01.produtoMaisCaro();
        Produto prodPrat2 = m1.prat02.produtoMaisCaro();

        if (prodPrat1.getPreco() > prodPrat2.getPreco()) {
            System.out.println("Esse é o produto mais caro do mercado\n"+ prodPrat1.toString());
        }else{
            System.out.println("Esse é o produto mais caro do mercado\n"+ prodPrat2.toString());
        }

        String media = m1.mediaValorProdutos();
        System.out.println("A médias dos produtos do mercado é: "+media);

        sc.close();   
    }
}
