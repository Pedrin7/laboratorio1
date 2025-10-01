package semana7e8.mercado;

public class Prateleira {
    public Produto produto01;
    public Produto produto02;
    public Produto produto03;

    public Prateleira(Produto produto01,Produto produto02, Produto produto03){
        this.produto01 = produto01;
        this.produto02 = produto02;
        this.produto03 = produto03;
    }

    public Prateleira(){

    }

    public Produto getProduto01(){return produto01;}
    public void setProduto01(Produto produto01){this.produto01 = produto01;}

    public Produto getProduto02(){return produto02;}
    public void setProduto02(Produto produto02){this.produto02 = produto02;}

    public Produto getProduto03(){return produto03;}
    public void setProduto03(Produto produto03){this.produto03 = produto03;}

    public Produto produtoMaisCaro(){
        if (produto01 != null && produto02 != null && produto03 != null) {
            if (produto01.getPreco() > produto02.getPreco() && produto01.getPreco() > produto03.getPreco()) {
                return produto01;      
            }else if(produto02.getPreco() > produto01.getPreco() && produto02.getPreco() > produto03.getPreco()){
                return produto02;
            }else{
                return produto03;
            }
        }else if(produto01 != null && produto02 != null && produto03 == null){
            if (produto01.getPreco() > produto02.getPreco()) {
                return produto01;
            }else{
                return produto02;
            }
        }else if(produto01 != null && produto02 == null && produto03 != null){
            if (produto01.getPreco() > produto03.getPreco()) {
                return produto01;
            }else{
                return produto03;
            }
        }else if (produto01 == null && produto02 != null && produto03 != null) {
            if (produto02.getPreco() > produto03.getPreco()) {
                return produto02;
            }else{
                return produto03;
            }
        }else if (produto01 != null && produto02 == null && produto03 == null) {
            return produto01;
        }else if(produto01 == null && produto02 != null && produto03 == null){
            return produto02;
        }else if(produto01 == null && produto02 == null && produto03 != null){
            return produto03;
        }
        else{
            return null;
        }
    }

    public String toString(){
        if (produto01 != null && produto02 != null && produto03 != null) {
                return "Produto 01: " +produto01.getNome()+ "\nPreço do produto 01: R$ " +produto01.getPreco()+ 
            "\nData de validade: " +produto01.dataDeValidade.toString() + "\n--------------------------" +
            "\nProduto 02: " +produto02.getNome()+ "\nPreço do produto 02: R$ " +produto02.getPreco()+ "\nData de validade: " +produto02.dataDeValidade.toString()+ "\n--------------------------" +
            "\nProduto 03: " +produto03.getNome()+ "\nPreço do produto 03: R$ " +produto03.getPreco()+ "\nData de validade: " +produto03.dataDeValidade.toString();

        }else if (produto01 != null && produto02 != null && produto03 == null) {
            return "Produto 01: " +produto01.getNome()+ "\nPreço do produto 01: R$ " +produto01.getPreco()+ 
            "\nData de validade: " +produto01.dataDeValidade.toString() + "\n--------------------------" +
            "\nProduto 02: " +produto02.getNome()+ "\nPreço do produto 02: R$ " +produto02.getPreco()+ "\nData de validade: " +produto02.dataDeValidade.toString();

        }else if (produto01 != null && produto02 == null && produto03 == null) {
            return "Produto 01: " +produto01.getNome()+ "\nPreço do produto 01: R$ " +produto01.getPreco()+ 
            "\nData de validade: " +produto01.dataDeValidade.toString(); 

        }else if (produto01 == null && produto02 != null && produto03 != null) {
                return "Produto 01: " +produto01+ "\n--------------------------" +
            "\nProduto 02: " +produto02.getNome()+ "\nPreço do produto 02: R$ " +produto02.getPreco()+ "\nData de validade: " +produto02.dataDeValidade.toString()+ "\n--------------------------" +
            "\nProduto 03: " +produto03.getNome()+ "\nPreço do produto 03: R$ " +produto03.getPreco()+ "\nData de validade: " +produto03.dataDeValidade.toString();

        }else if (produto01 == null && produto02 == null && produto03 != null) {
                return "Produto 01: " +produto01 + "\n--------------------------" +
            "\nProduto 02: " +produto02+ "\n--------------------------" +
            "\nProduto 03: " +produto03.getNome()+ "\nPreço do produto 03: R$ " +produto03.getPreco()+ "\nData de validade: " +produto03.dataDeValidade.toString();

        }else if (produto01 == null && produto02 != null && produto03 == null) {
                return "Produto 01: " +produto01+ "\n--------------------------" +
            "\nProduto 02: " +produto02.getNome()+ "\nPreço do produto 02: R$ " +produto02.getPreco()+ "\nData de validade: " +produto02.dataDeValidade.toString()+ "\n--------------------------" +
            "\nProduto 03: " +produto03;
        }else{
            return null;
        }
    }
}
