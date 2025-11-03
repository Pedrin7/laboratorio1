package semana11e12.listaDeExercicios2;
import java.util.Arrays;

public class Exer07 {
    public static void arrayAleatorio(){
        double tamanhoArray = ((Math.random()*100)+1);
        double[] a = new double[(int) tamanhoArray];
        for(int i = 0; i < a.length; i++){
            a[i] = (int) ((Math.random()*100)+1);
        }

        for(int i = 0; i < a.length; i++){
            if (i == a.length - 2) {
                System.out.print(" - ");
            }
        }
        System.out.print("Tamanho do array: "+a.length+" Array a seguir: "+Arrays.toString(a));
    }

    public static void main(String[] args) {
        arrayAleatorio();
    }
}
 