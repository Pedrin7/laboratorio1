package semana9e10.exercicios05;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Competicao c = new Competicao("Correr cansa",null);
        // Data dC = new Data(19, 5, 2011);
        // c.setData(dC);

        // System.out.println("Nome: "+c.getNomeCompeticao());
        // c.imprimeData();
        // System.out.println("---------------------------");

        // Nadador n = new Nadador("Cielo", 23, "borboleta");
        // n.imprimeInfo();
        // System.out.println("---------------------------");

        // Corredor corredor = new Corredor("Pedro", 91, 68, c);
        // corredor.getCompeticao().getData().setMes(2);

        // data da competição do corredor
        // corredor.getCompeticao().imprimeData();

        // Competicao c2 = new Competicao("São Silvestre", dC);
        // Data d2 = new Data(1, 1, 2012);
        // c2.setData(d2);
        // Corredor corredor2 = new Corredor("Augosto", 100, 70, c2);

        // corredor2.imprimeInfo();

        // System.out.println("-----------------------");

        Atleta a = null;
        System.out.println("Digite 1 para criar um NADADOR e 2 para criar um CORREDOR");
        int opcao = sc.nextInt();
        sc.nextLine();
        if (opcao == 1) {

            a = new Nadador(null, opcao, null);
            Nadador nadador = (Nadador) a;
            System.out.println("Informe o nome do nadador: ");
            String nome = sc.nextLine();
            nadador.setNome(nome);
            System.out.println("Informe a idade do nadador: ");
            int idade = sc.nextInt();
            nadador.setIdade(idade);
            sc.nextLine();
            System.out.println("Informe a categoria do nadador: ");
            String categoria = sc.nextLine();
            nadador.setCategoria(categoria);

        }else if(opcao == 2){

            a = new Corredor(null, 0, 0, new Competicao(null, new Data(0,0,0)));
            Corredor corredorDoIf = (Corredor) a;
            System.out.println("Informe o nome do corredor: ");
            String nome = sc.nextLine();
            corredorDoIf.setNome(nome);
            System.out.println("Informe a idade do corredor: ");
            int idade = sc.nextInt();
            corredorDoIf.setIdade(idade);
            sc.nextLine();
            System.out.println("Informe o peso do corredor: ");
            double peso = sc.nextDouble();
            sc.nextLine();
            corredorDoIf.setPeso(peso);
            System.out.println("Informe o nome da competição do corredor: ");
            String nomeDaCompeticao = sc.nextLine();
            corredorDoIf.getCompeticao().setNomeCompeticao(nomeDaCompeticao);
            System.out.println("Informe a data da competição, sendo dia, mês e ano: ");
            System.out.println("Dia: ");
            int dia = sc.nextInt();
            sc.nextLine();
            System.out.println("Mês: ");
            int mes = sc.nextInt();
            sc.nextLine();
            System.out.println("Dia: ");
            int ano = sc.nextInt();
            sc.nextLine();
            corredorDoIf.getCompeticao().getData().setDia(dia);
            corredorDoIf.getCompeticao().getData().setMes(mes);
            corredorDoIf.getCompeticao().getData().setAno(ano);
        }

        InformacoesAtletas ia = new InformacoesAtletas();
        ia.imprimeExclusivosAtleta(a);
        System.out.println("-------------------------");
        ia.imprimeInformacoesAtleta(a);
        System.out.println("-------------------------");

        if (a instanceof Nadador) {
            ((Nadador)a).setCategoria("livre");
        }else if(a instanceof Corredor){
            ((Corredor)a).setPeso(89);
        }
        
        System.out.println("Mudanças na categoria caso o atleta for um nadador e mudança no peso caso for corredor!");
        ia.imprimeInformacoesAtleta(a);

        sc.close();
    }
}
