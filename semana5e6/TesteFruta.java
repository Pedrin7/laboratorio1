public class TesteFruta {
    public static void main(String args[]){

        Fruta f1 = new Fruta("Maça", 9.90);

        System.out.println(f1.getNome());
        System.out.println(f1.getPreco());
        System.out.println(f1.calculaPreco(.1));
        System.out.println("------------------------");

        Fruta f2 = new Fruta("Banana", 20);

        System.out.println(f2.getNome());
        System.out.println(f2.getPreco());
        System.out.println(f2.calculaPreco(.1));

    }
}
