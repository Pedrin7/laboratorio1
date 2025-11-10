public class Bijuteria extends Loja{
    private double metaVendas;
    
    // Construtor
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoqueProdutos ,double metaVendas){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoqueProdutos);
        this.metaVendas = metaVendas;
    }

    // Getters e setters
    public void setMetaVendas(double metaVendas){this.metaVendas = metaVendas;}
    public double getMetaVendas(){return metaVendas;}

    @Override
    public String toString(){
        return "Nome: " +getNome()+ "\nQuantidade de funcionários: " +getQuantidadeFuncionarios()+ 
            "\nSalario base dos funcionários: " +getSalarioBaseFuncionario()+
            "\nMeta de vendas: "+getMetaVendas()+ 
            "\n" +getEndereco().toString()+ 
            "\n" +getDataFundacao().toString();
    }

}
