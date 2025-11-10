public class Cosmetico extends Loja{
    private double taxaComercializacao;

    // Construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoqueProdutos ,double taxaComercializacao){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, capacidadeEstoqueProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Getters e setters
    public void setTaxaComercializacao(double taxaComercializacao){this.taxaComercializacao = taxaComercializacao;}
    public double getTaxaComercializacao(){return taxaComercializacao;}

    @Override
    public String toString(){
        return "Nome: " +getNome()+ "\nQuantidade de funcionários: " +getQuantidadeFuncionarios()+ 
            "\nSalario base dos funcionários: " +getSalarioBaseFuncionario()+ 
            "\nTaxa de comercialização: "+getTaxaComercializacao()+ 
            "\n" +getEndereco().toString()+ 
            "\n" +getDataFundacao().toString();
    }

    
}