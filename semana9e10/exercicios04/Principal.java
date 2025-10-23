package semana9e10.exercicios04;
import java.util.Scanner;
import java.util.Random;


public class Principal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        Produto[] produtos = new Produto[4];
        
        for(int i = 0; i < produtos.length;i++){
    
            int numeroSorteado = random.nextInt(100) + 1;
            
            if(numeroSorteado % 2 == 0){
                // PAR = perecivel
                System.out.println("Produto perecivel!!!");
                System.out.println("---------------------------------");
                System.out.println("Informe o nome do produto: ");
                String nome = sc.nextLine();

                System.out.println("Descrição: ");
                String descricao = sc.nextLine();

                System.out.println("Valor: ");
                double valor = sc.nextDouble();
                sc.nextLine();

                System.out.println("Informe a data de validade do produto: ");

                System.out.print("Dia: ");
                int dia = sc.nextInt();
                sc.nextLine();

                System.out.print("Mês: ");
                int mes = sc.nextInt();
                sc.nextLine();

                System.out.print("Ano: ");
                int ano = sc.nextInt();
                sc.nextLine();

                Data data = new Data(dia, mes, ano);

                produtos[i] = new Perecivel(nome, descricao, valor, data);
            }else{
                // Impar = Nao perecivel
                System.out.println("Produto não perecivel!!!");
                System.out.println("---------------------------------");
                System.out.println("Informe o nome do produto: ");
                String nome = sc.nextLine();

                System.out.println("Descrição: ");
                String descricao = sc.nextLine();

                System.out.println("Valor: ");
                double valor = sc.nextDouble();
                sc.nextLine();


                System.out.println("Informe a data de fabricação do produto: ");

                System.out.print("Dia: ");
                int dia = sc.nextInt();
                sc.nextLine();

                System.out.print("Mês: ");
                int mes = sc.nextInt();
                sc.nextLine();

                System.out.print("Ano: ");
                int ano = sc.nextInt();
                sc.nextLine();

                Data data = new Data(dia, mes, ano);
                produtos[i] = new NaoPerecivel(nome, descricao, valor, data);

            }
        }        

        Produto produtoPerecivelMaisCaro = null;
        for(Produto p: produtos){

            if (p instanceof Perecivel) {
                if (produtoPerecivelMaisCaro == null) {
                    produtoPerecivelMaisCaro = p;
                }else if(p.getValor() > produtoPerecivelMaisCaro.getValor()){
                    produtoPerecivelMaisCaro = p;
                }
            }
        }

        System.out.println("----------------------------------");
        System.out.println("O produto perecivel mais caro é: " +produtoPerecivelMaisCaro.getNome());
        System.out.println("----------------------------------");

        for(Produto p: produtos){
            if (p instanceof NaoPerecivel) {
                NaoPerecivel pNaoPerecivel = (NaoPerecivel) p;
                if (pNaoPerecivel.getDataDeFabricacao().getAno() < 2023) {
                    System.out.println("Produto fabricado antes de 2023:\nNome: "+pNaoPerecivel.getNome()+"\nDia: "+pNaoPerecivel.getDataDeFabricacao().getDia()+
                    "\nMês: " +pNaoPerecivel.getDataDeFabricacao().getMes()+ "\nAno: " +pNaoPerecivel.getDataDeFabricacao().getAno());
                }
            }
        }

        for(Produto p: produtos){
            if (p instanceof Perecivel) {
                Perecivel pPerecivel = (Perecivel) p;
                if (pPerecivel.getDataDeValidade().getDia() < 1 || pPerecivel.getDataDeValidade().getMes() < 5 || pPerecivel.getDataDeValidade().getAno() < 2023) {
                    System.out.println("Produto perecivel vencido!! " +pPerecivel.getNome());
                }
            }
        }
        sc.close();
    }
}