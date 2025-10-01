package semana7e8.mercado;

public class Produto {
    public String nome;
    public double preco;
    public Data dataDeValidade;

    //Construtor para inicalizar os atributos
    public Produto(String nome, double preco, Data dataDeValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
    }

    // getters e setters para o nome
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    //getters e setters para o preco
    public double getPreco(){return preco;}
    public void setPreco(double preco){this.preco = preco;}

    // getters e setters para a data
    public Data getData(){return dataDeValidade;}
    public void setData(Data dataDeValidade){this.dataDeValidade = dataDeValidade;}

    public String toString(){
        return "Nome do produto: " +getNome()+ "\nPreço do produto: R$ " +getPreco()+ 
        "\nData de validade: " + dataDeValidade.toString();
    }

    public boolean verificaProdutoVencido(Data data){
        if (data.getAno() > dataDeValidade.getAno()) {
            return true; //passou o ano de validade
        }else if(data.getAno() == dataDeValidade.getAno()){
            if (data.getMes() > dataDeValidade.getMes()) {
                return true; // mesmo ano, mas o mes passou
            }else if(data.getMes() == dataDeValidade.getMes()){
                if (data.getDia() > dataDeValidade.getDia()) {
                    return true; // mesmo mes e ano, mas o dia passou
                }
            }
        }
        return false;
    }

}
