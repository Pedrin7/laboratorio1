package semana7e8.whilee;

public class Exercicios {

    public void contador(int x){
        while(x <= 300){
            System.out.println(x);
            x++;
        }
    }

    public void imprimePares(int x){
        int cont = 0;
        if (x < 0) {
            System.out.println("ERRO!");
        }else{
            while(cont <= x) {
                if (cont % 2 == 0) {
                System.out.println(cont);   
                }
                cont++;
            }
        }
    }

    public void verificaPrimo(int x){
        if (x < 2) {
            System.out.println(x + " não é primo");
            return;
        }

        int cont = 2;
        boolean primo = true;

        while (cont * cont <= x) { // só checa até a raiz quadrada
            if (x % cont == 0) {
                primo = false; // encontrou um divisor
                break; // não precisa continuar
            }
            cont++;
        }

        if (primo) {
            System.out.println(x + " é primo");
        } else {
            System.out.println(x + " não é primo");
        }
    }
}
