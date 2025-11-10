public class Informatica extends Loja{
    private double seguroEletronicos;

    // Construtor
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoqueProdutos, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Getters e setters
    public void setSeguroEletronicos(double seguroEletronicos){this.seguroEletronicos = seguroEletronicos;}
    public double getSeguroEletronicos(){return seguroEletronicos;}

    @Override
    public String toString(){
        return "Nome: " +getNome()+ "\nQuantidade de funcionários: " +getQuantidadeFuncionarios()+ 
            "\nSalario base dos funcionários: " +getSalarioBaseFuncionario()+ 
            "\nSeguro dos eletrônicos: "+getSeguroEletronicos()+ 
            "\n" +getEndereco().toString()+ 
            "\n" +getDataFundacao().toString();
    }


}
