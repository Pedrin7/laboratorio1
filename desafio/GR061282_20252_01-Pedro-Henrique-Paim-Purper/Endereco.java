public class Endereco {
    private String nomeDaRua, cidade, estado, pais, cep, numero, complemento;

    // Construtor
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento){
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    // Getters e setters
    public void setNomeDaRua(String nomeDaRua){this.nomeDaRua = nomeDaRua;}
    public String getNomeDaRua(){return nomeDaRua;}

    public void setCidade(String cidade){this.cidade = cidade;}
    public String getCidade(){return cidade;}

    public void setEstado(String estado){this.estado = estado;}
    public String getEstado(){return estado;}

    public void setPais(String pais){this.pais = pais;}
    public String getPais(){return pais;}

    public void setCep(String cep){this.cep = cep;}
    public String getCep(){return cep;}

    public void setNumero(String numero){this.numero = numero;}
    public String getNumero(){return numero;}

    public void setComplemento(String complemento){this.complemento = complemento;}
    public String getComplemento(){return complemento;}

    public String toString(){
        return "Nome da rua: " +getNomeDaRua()+ "\nCidade: " +getCidade()+ "\nEstado: " +getEstado()+ 
            "\nPaís: " +getPais()+ "\nCEP:" +getCep()+ "\nNúmero: " +getNumero()+ "\nComplemento: " +getComplemento();
    }

}
  
