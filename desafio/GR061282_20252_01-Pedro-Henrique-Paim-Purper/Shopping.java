import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // Construtor
    public Shopping(String nome, Endereco endereco, int qtdLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qtdLojas];
    }

    // Getters e setters
    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return nome;}

    public void setEndereco(Endereco endereco){this.endereco = endereco;}
    public Endereco getEndereco(){return endereco;}

    public void setLojas(Loja[] lojas){this.lojas = lojas;}
    public Loja[] getLojas(){return lojas;}

    public String toString(){
        return "Nome do shopoping: " +this.getNome()+ 
            "\nEndereço do shopping: " +this.getEndereco().toString()+
            "\nLojas do shopping: " +Arrays.toString(this.getLojas());
    }

    // Método que insere lojas do shopping
    public boolean insereLoja(Loja loja){
        boolean lojaInserida = false;
        for(int i = 0; i < lojas.length; i++){
            if (lojas[i] == null) {
                lojas[i] = loja;
                lojaInserida = true;
                return lojaInserida;
            }
        }
        return lojaInserida;
    }

    // Método que remove lojas do shopping
    public boolean removeLoja(String nome){
        boolean lojaRemovida = false;
        for(int i = 0; i < lojas.length; i++){
            if (lojas[i] != null && lojas[i].getNome().equals(nome)) {
                lojas[i] = null;
                lojaRemovida = true;
                return lojaRemovida;
            }
        }
        return lojaRemovida;
    }

    // Método que contabiliza as lojas por tipo
    public int quantidadeLojasPorTipo(String tipoLoja){
        int cont = 0;
        if (tipoLoja.equalsIgnoreCase("Alimentacao")) {
            for(int i = 0; i < lojas.length; i++){
                if (lojas[i] != null && lojas[i] instanceof Alimentacao) {
                    cont++;      
                }
            }
            return cont;
        }
        if (tipoLoja.equalsIgnoreCase("Bijuteria")) {
            for(int i = 0; i < lojas.length; i++){
                if (lojas[i] != null && lojas[i] instanceof Bijuteria) {
                    cont++;      
                }  
            }
            return cont;
        }
        if (tipoLoja.equalsIgnoreCase("Cosmetico")) {
            for(int i = 0; i < lojas.length; i++){
                if (lojas[i] != null && lojas[i] instanceof Cosmetico) {
                    cont++;      
                }  
            }
            return cont;
        }
        if (tipoLoja.equalsIgnoreCase("Informatica")) {
            for(int i = 0; i < lojas.length; i++){
                if (lojas[i] != null && lojas[i] instanceof Informatica) {
                    cont++;      
                } 
            }
            return cont;
        }
        if (tipoLoja.equalsIgnoreCase("Vestuario")) {
            for(int i = 0; i < lojas.length; i++){
                if (lojas[i] != null && lojas[i] instanceof Vestuario) {
                    cont++;      
                }  
            }
            return cont;
        }else{
            return -1;
        }
    }

    // Método que retorna a loja de informática com o seguro mais caro
    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaComSeguroMaisCaro = null;
        for(int i = 0; i < lojas.length; i++){
            if (lojas[i] != null && lojas[i] instanceof Informatica l) { 
                if (lojaComSeguroMaisCaro == null) {
                    lojaComSeguroMaisCaro = l;
                }else if(l.getSeguroEletronicos() > lojaComSeguroMaisCaro.getSeguroEletronicos()){
                    lojaComSeguroMaisCaro = l;
                }

            }
        }
        return lojaComSeguroMaisCaro;
    }
}

/*  Foi usado Pattern Matching no if
    Após verificar se a loja no indice i é uma loja de informática, ao lado, ja criei o ponteiro l
    que me possibilita o acesso as métodos da classe informática    

    Caso não tivesse o ponteiro ali, teria que ser feito o casting.
*/
 
