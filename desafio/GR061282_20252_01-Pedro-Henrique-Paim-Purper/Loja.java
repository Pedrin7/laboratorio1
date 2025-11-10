import java.util.Arrays;
public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    // Construtores abaixo
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoqueProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[capacidadeEstoqueProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int capacidadeEstoqueProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[capacidadeEstoqueProdutos];

    }

    // Getters e setters
    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return nome;}

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){this.quantidadeFuncionarios = quantidadeFuncionarios;}
    public int getQuantidadeFuncionarios(){return quantidadeFuncionarios;}

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){this.salarioBaseFuncionario = salarioBaseFuncionario;}
    public double getSalarioBaseFuncionario(){return salarioBaseFuncionario;}

    public void setEndereco(Endereco endereco){this.endereco = endereco;}
    public Endereco getEndereco(){return endereco;}

    public void setDataFundacao(Data dataFundacao){this.dataFundacao = dataFundacao;}
    public Data getDataFundacao(){return dataFundacao;}

    public void setEstoqueProdutos(Produto[] estoqueProdutos){this.estoqueProdutos = estoqueProdutos;}
    public Produto[] getEstoqueProdutos(){return estoqueProdutos;}

    public String toString(){
        return "Nome: " +getNome()+ "\nQuantidade de funcionários: " +getQuantidadeFuncionarios()+ 
            "\nSalario base dos funcionários: " +getSalarioBaseFuncionario()+ "\n" +getEndereco().toString()+ 
                "\n" +getDataFundacao().toString() + "\n" +Arrays.toString(getEstoqueProdutos());
    }

    // Método que verifica o gasto com salários de uma loja
    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1) {
            return -1;
        }else{
            return quantidadeFuncionarios * salarioBaseFuncionario;  
        }
    }

    // Método que indica o tamanho da loja de acordo com o número de funcionários
    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10) {
            return 'P';
        }else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        }else{
            return 'G';
        }
    }

    // Método que imprime os produtos que a loja possui
    public void imprimeProdutos(){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(this.estoqueProdutos[i] != null){
                System.out.println(estoqueProdutos[i].toString());
            }
            System.out.println("-----------------------");
        }
    }

    // Método que insere produtos na loja
    public boolean insereProduto(Produto produto){
        boolean produtoInserido = false;
        for(int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                produtoInserido = true;
                return produtoInserido;
            }
        }
        return produtoInserido;
    }

    // Método que remove produtos da loja
    public boolean removeProduto(String nome){
        boolean produtoFoiRemovido = false;
        for(int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nome)) {
                estoqueProdutos[i] = null;
                produtoFoiRemovido = true;
                return produtoFoiRemovido;
            }
        }
        return produtoFoiRemovido;
    }

    
}