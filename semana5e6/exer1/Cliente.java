package exer1;

public class Cliente {
    public String nome;
    public int idade;
    public char sexo;
    public String email;
    public String senha;

    public Cliente(){
        
    }

    public Cliente(String nome, int idade, char sexo, String email, String senha){ 
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String imprimeInformacoes(){
        String imprime =  "Nome: " +getNome()+ "\nIdade: " +getIdade()+ "\nSexo: " +getSexo()+ "\nE-mail: " +getEmail()+ "\nSenha: " +getSenha();
        return imprime;
    }
}
