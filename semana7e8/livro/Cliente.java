package semana7e8.livro;

public class Cliente {
    public String nome;
    public int idade;
    public String sexo;
    public String email;
    public String senha;
    public Livro livro;

    public Cliente(){

    }

    public Cliente(Livro livro){
        this.livro = livro;
    }

    public Cliente(String nome, int idade, String sexo, String email, String senha, Livro livro){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.livro = livro;
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

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
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

    public Livro getLivro(){
        return livro;
    }

    public void setLivro(Livro livro){
        this.livro = livro;
    }

    public void imprimeInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Email: " + getEmail());
        System.out.println("Senha: " + getSenha());
    }

    public String toString(){
        return "Nome: " +getNome()+ "\n Idade: " +getIdade()+ "\nSexo: " +getSexo()+ "\nEmail" +getEmail()+ "\nSenha: " +getSenha();
    }


}
