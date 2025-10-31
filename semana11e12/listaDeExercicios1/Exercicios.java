package semana11e12.listaDeExercicios1;

import java.util.Arrays;
import java.util.Scanner;


public class Exercicios{
    public void exercicio1(int[] array){
        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }

    public int[] exercicio2(int[] array){
        int[] arrayAoContrario = new int[array.length];
        for(int i = array.length - 1; i >= 0; i--){
            int indiceEscritaNoArrayAoContrario = (array.length - 1) - i;
            arrayAoContrario[indiceEscritaNoArrayAoContrario] = array[i];
        }
        return arrayAoContrario;
    }

    public int[] exercicio3(int[] array){
        int[] arrayDePares;
        int tamanhoArray = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
            tamanhoArray++;        
            }
        }
        arrayDePares = new int[tamanhoArray];
        int indiceArrayDePares = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                arrayDePares[indiceArrayDePares] = array[i];
                indiceArrayDePares++;
            }
        }
        return arrayDePares;
    }

    public int exercicio4(String[] array, String x){
        for(int i = 0; i < array.length; i++){
            if (array[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public int[] exercicio5(boolean array[]){
        int[] arrayTrueFalseParaNum = new int[array.length];
        for(int i = 0; i < array.length; i++){
            if (array[i] == true) {
                arrayTrueFalseParaNum[i] = 1;
            }else{
                arrayTrueFalseParaNum[i] = 0;
            }
        }
        return arrayTrueFalseParaNum;
    }

    public int[] exercicio6(int[] array, int[] array2){
        int[] array3;
        array3 = new int[array.length + array2.length];  

        int indiceContador = 0;

        for(int i = 0; i < array.length; i++){
            array3[indiceContador] = array[i];
            indiceContador++;
        }

        for(int i = 0; i < array2.length; i++){
            array3[indiceContador] = array2[i];
            indiceContador++;
        }
        return array3;
    }

    public int[] exercicio7(int[] a1, int[] a2){
        int[] a3 = new int[a1.length + a2.length];
        int indiceNegativos = 0;

        for(int i = 0;i < a1.length; i++){
            if (a1[i] < 0) {
                a3[indiceNegativos] = a1[i];
                indiceNegativos++;
            }
        }
        for(int i = 0; i < a2.length;i++){
            if (a2[i] < 0) {
                a3[indiceNegativos] = a2[i];
                indiceNegativos++;
            }
        }
        int indicePositivos = indiceNegativos;
        for(int i = 0; i < a1.length; i++){
            if (a1[i] >= 0) {
                a3[indicePositivos] = a1[i];
                indicePositivos++;
            }
        }

        for(int i = 0; i < a2.length; i++){
            if (a2[i] >= 0) {
                a3[indicePositivos] = a2[i];
                indicePositivos++;
            }
        }
        return a3;
    }

    public void exercicio8(char[] array){
        System.out.println(Arrays.toString(array));
    }

    public int exercicio9(int[] array){
        int div = array.length;
        int soma = 0;
        for(int i = 0; i < array.length; i++){
            soma += array[i];
        }
        int media = soma / div;
        return media;
    }

    public int exercicio10(int[] array){
        int inidicePares = 0;
        int soma = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                soma += array[i];
                inidicePares++;
            }
        }
        int media = soma / inidicePares;
        return media;
    }

    public int exercicio11(int[] array, int x){
        return array[x];
    }

    public boolean exercicio12(double[] array){
        for(int i = 0; i < array.length; i++){
            if (array[i] < 0) {
                return true;
            }
        }
        return false;
    }

    public int exercicio13(int[] array){
        int maior = array[0];
        for(int i = 0; i < array.length; i++){ 
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    public int exercicio14(int[] array){
        int maior = array[0];
        int indiceDoMaior = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] > maior) {
                maior = array[i];
                indiceDoMaior = i;
            }
        }
        return indiceDoMaior;
    }

    public int exercicio15(int[] array){
        int menor = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    public int exercicio16(int[] array){
        int menor = array[0
        ];
        int indiceDoMenor = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] < menor) {
                menor = array[i];
                indiceDoMenor = i;
            }
        }
        return indiceDoMenor;
    }

    public boolean exercicio17(int[] array1, int[] array2){
       if (array1.length != array2.length) {
            return false;
       }else{
            for(int i = 0; i < array1.length; i++){
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
       }
       return true;
    }

    public String exercicio18(char[] array){
        String palavraFormada = "";
        for(int i = 0; i < array.length; i++){
            palavraFormada = palavraFormada + array[i];
        }
        return palavraFormada;
    }

    public String[] exercicio19(int x){
        String[] array = new String[x];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.println("Informe uma palavra: ");
            String palavra = sc.nextLine();
            array[i] = palavra; 
        }
        return array;
    }

    public String[] exercicio20(String[] array, int x){
        String[] novoArray = new String[array.length - 1];
        int indiceNovoArray = 0;
        for(int i = 0; i < array.length; i++){
            if (i != x) {
                    novoArray[indiceNovoArray] = array[i];
                    indiceNovoArray++;
            }
        }
        return novoArray;
    }

    public void exercicio21(double[] array){
        for(int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}