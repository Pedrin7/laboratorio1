public class Alimentacao extends Loja{
    private Data dataAlvara;

    // Construtor
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int capacidadeEstoqueProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoqueProdutos);
        this.dataAlvara = dataAlvara;
    }

    // Getters e setters
    public void setDataAlvara(Data dataAlvara){this.dataAlvara = dataAlvara;}
    public Data getDataAlvara(){return dataAlvara;}

    @Override
    public String toString(){
        return "Nome: " +getNome()+ "\nQuantidade de funcionários: " +getQuantidadeFuncionarios()+ 
            "\nSalario base dos funcionários: " +getSalarioBaseFuncionario()+ 
            "\nData do alvara: "+getDataAlvara()+ 
            "\n" +getEndereco().toString()+ 
            "\n" +getDataFundacao().toString();
    }


}
