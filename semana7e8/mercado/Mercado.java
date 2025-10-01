package semana7e8.mercado;

public class Mercado {
    public Prateleira prat01;
    public Prateleira prat02;

    public Mercado(Prateleira prat01, Prateleira prat02){
        this.prat01 = prat01;
        this.prat02 = prat02;
    }

    public Prateleira getPrat01(){return prat01;}
    public Prateleira getPrat02(){return prat02;}

    public String mediaValorProdutos(){
        double soma = 0;
        int cont = 0;

        if (prat01.produto01 != null) {
            soma += prat01.produto01.getPreco();
            cont ++;
        }
        if (prat01.produto02 != null) {
            soma += prat01.produto02.getPreco();
            cont ++;
        }
        if (prat01.produto03 != null) {
            soma += prat01.produto03.getPreco();
            cont ++;
        }
        if (prat02.produto01 != null) {
            soma += prat02.produto01.getPreco();
            cont ++;
        }
        if (prat02.produto02 != null) {
            soma += prat02.produto02.getPreco();
            cont ++;
        }
        if (prat02.produto03 != null) {
            soma += prat02.produto03.getPreco();
            cont ++;
        }

        double media = soma / cont;
        String mediaFormatada = String.format("%.2f", media);
        return mediaFormatada;
    }
}
