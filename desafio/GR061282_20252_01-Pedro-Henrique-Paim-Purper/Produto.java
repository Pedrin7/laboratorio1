public class Produto {
    private String nome;
    private double preco;
    private Data dataDeValidade;
    
    // Construtor
    public Produto(String nome, double preco, Data dataDeValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
    }

    // Getters e setters
    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return nome;}

    public void setPreco(double preco){this.preco = preco;}
    public double getPreco(){return preco;}

    public void setDataValidade(Data dataDeValidade){this.dataDeValidade = dataDeValidade;}
    public Data getDataValidade(){return dataDeValidade;}

    public String toString(){
        return "Nome do produto: " +getNome()+ "\nPreço do produto: " +getPreco()+ 
            "\nData de validade: " +getDataValidade().toString();
    }

    // Método que verifica se o produto está vencido
    public boolean estaVencido(Data data){
        /*Abaixo começamos verificando se o ano informado é igual ao ano da data de validade do produto */
        if (data.getAno() > dataDeValidade.getAno()) {
            return true;
        }
        if (data.getAno() < dataDeValidade.getAno()) {
            return false;
        }
        /*Abaixo verificamos se o mês é válido(só testamos o mês caso o ano seja válido) */
        if (data.getMes() > dataDeValidade.getMes()) {
            return true;
        }
        if (data.getMes() < dataDeValidade.getMes()) {
            return false;
        }
        /*Por último, iremos testar o dia */
        if (data.getDia() > dataDeValidade.getDia()) {
            return true;
        }
        return false;
    }
}
