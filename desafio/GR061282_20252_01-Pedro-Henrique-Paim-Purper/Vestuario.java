public class Vestuario extends Loja{
    private boolean produtosImportados;

    // Construtor
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int capacidadeEstoqueProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoqueProdutos);
        this.produtosImportados = produtosImportados;
    }

    // Getters e setters
    public void setProdutosImportados(boolean produtosImportados){this.produtosImportados = produtosImportados;}
    public boolean getProdutosImportados(){return produtosImportados;}

    @Override
    public String toString(){
        return "Nome: " +getNome()+ "\nQuantidade de funcionários: " +getQuantidadeFuncionarios()+ 
            "\nSalario base dos funcionários: " +getSalarioBaseFuncionario()+ "\nProdutos importados: "+getProdutosImportados()+ "\n" +getEndereco().toString()+ 
                "\n" +getDataFundacao().toString();
    }

}
