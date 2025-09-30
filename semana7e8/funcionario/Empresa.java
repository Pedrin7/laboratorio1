package semana7e8.funcionario;

public class Empresa {
    public String nome;
    public FuncionarioCaixa fun1;
    public FuncionarioCaixa fun2;

    public Empresa(String nome, FuncionarioCaixa fun1, FuncionarioCaixa fun2){
        this.nome = nome;
        this.fun1 = fun1;
        this.fun2 = fun2;
    }

    public Empresa(String nome){
        this.nome = nome;
        fun1 = null;
        fun2 = null;
    }

    public Empresa(){
        this.nome = "";
        this.fun1 = null;
        this.fun2 = null;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public FuncionarioCaixa getFuncionarioCaixa1(){
        return fun1;
    }

    public void setFuncionarioCaixa1(FuncionarioCaixa fun1){
        this.fun1 = fun1;
    }

    public FuncionarioCaixa getFuncionarioCaixa2(){
        return fun2;
    }

    public void setFuncionarioCaixa2(FuncionarioCaixa fun2){
        this.fun2 = fun2;
    }

    public void imprimeInfo(){
        System.out.println("Nome da empresa: " +getNome()+ "\nNome do funcionario 01: " +fun1.getNome()+ 
            "\nNome do funcionário 02: " +fun2.getNome());
    }


}
