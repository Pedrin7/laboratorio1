package semana11e12.listaDeExercicios2;

public class Exer06 {
    public static void infosArrays(double[] array){
        double maior = array[0];
        double menor = array[0];
        double soma = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] > maior) {
                maior = array[i];
            }
            if (array[i] < menor) {
                menor = array[i];
            }
            soma += array[i];
        } 
        double media = soma / array.length;
        System.out.println("O maior valor do array é: " +maior);
        System.out.println("O menor valor do array é: " +menor);
        System.out.println("O média valor dos valores do array é: " +media);
    }

    public static void main(String[] args) {
        double[] a1 = {10, 5, 2, 2.5, 80};
        infosArrays(a1);
    }
}
