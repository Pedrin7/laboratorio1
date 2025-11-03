package semana11e12.listaDeExercicios2;
import java.util.Arrays;

public class Exer05 {
    public static int[] somaArrays(int[] a1, int[] a2){
        if (a1.length != a2.length) {
            return null;
        }
        
        int[] a3 = new int[a1.length];
        int soma = 0;

        for(int i = 0; i < a1.length; i++){
            soma = a1[i] + a2[i];
            a3[i] = soma;
        }
        return a3;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        System.out.println(Arrays.toString(somaArrays(a1, a2)));
    }
}
