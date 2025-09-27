package exer1;

public class Livro {

    public String titulo;
    public String autor;
    public int anoDePublicacao;
    public double preco;
    public int qtdPaginas;

    public Livro(){

    }

    public Livro(String titulo, String autor, int anoDePublicacao, double preco, int qtdPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.preco = preco;
        this.qtdPaginas = qtdPaginas;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAnoDePublicacao(){
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao){
        this.anoDePublicacao = anoDePublicacao;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQtdPaginas(){
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas){
        this.qtdPaginas = qtdPaginas;
    }

    public double calcularPrecoPorPagina(){
        double precoPorPagina = preco / qtdPaginas;
        return precoPorPagina;
    }

    public String toString(){
        return "Título: " +getTitulo()+ "\nAutor: " +getAutor()+ "\nAno de publicação: " +getAnoDePublicacao()+ "\nPreço: R$ " +getPreco()+ "\nQuantidade de páginas: " + getQtdPaginas();
    }
}
