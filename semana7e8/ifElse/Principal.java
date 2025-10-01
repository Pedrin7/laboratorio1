package semana7e8.ifElse;

public class Principal {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Joaquim","M",19,1.78,0,"Rua C,145");
        Pessoa p2 = new Pessoa("Manuelita","F",30,1.67,3,"Rua dos camelos, 12");
        Pessoa p3 = new Pessoa("Pedro","M",10,1.91,1,"Rua dos Gigantes, 189");

        p1.infoPessoa();
        if (p1.isFilhoUnico() == false) {
            System.out.println("Não é filho unico!");
        }else{
            System.out.println("É filho unico!");     
        }
        System.out.println("-------------------------");
        p2.infoPessoa();
                if (p2.isFilhoUnico() == false) {
            System.out.println("Não é filho unico!");
        }else{
            System.out.println("É filho unico!");     
        }
        System.out.println("-------------------------");
        p3.infoPessoa();
                if (p3.isFilhoUnico() == false) {
            System.out.println("Não é filho unico!");
        }else{
            System.out.println("É filho unico!");     
        }




    }
}
