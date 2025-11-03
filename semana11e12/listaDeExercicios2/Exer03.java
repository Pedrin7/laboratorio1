package semana11e12.listaDeExercicios2;

public class Exer03 {
    public static int exer03(int[] array){
        int soma = 0;
        for(int i = 0; i < array.length; i++){
            soma += array[i];
        }

        return soma;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(exer03(array));
    }
}
