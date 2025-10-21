package semana9e10.exercicios02;
import java.util.Random;

public class Principal {

        // instanciando a classe Random abaixo
        static Random random = new Random();

        public static Figura criarFiguraAleatoria(){

            // A chance será de 50% de criação de uma figura = Circulo
            boolean criarCirculo = random.nextBoolean();

            Figura figuraCriada;

            // Sorteixo dos eixos x e y abaixo
            double xAleatorio = random.nextDouble() * 100.00;
            double yAleatorio = random.nextDouble() * 100.00;

            if (criarCirculo) {
                double raioAleatorio = (random.nextDouble() * 20.0) + 1.0;

                figuraCriada = new Circulo(xAleatorio, yAleatorio, raioAleatorio);
            }else{
                double larguraAleatoria = (random.nextDouble() * 15.0) + 1;
                double alturaAleatoria = (random.nextDouble() * 15.0) + 1;

                figuraCriada = new Retangulo(xAleatorio, yAleatorio, larguraAleatoria, alturaAleatoria);
            }

            return figuraCriada;
        }

    public static void main(String[] args){

        Figura f1 = criarFiguraAleatoria();
        Figura f2 = criarFiguraAleatoria();
        Figura f3 = criarFiguraAleatoria();
        Figura f4 = criarFiguraAleatoria();
     
        System.out.println("----- FIGURA 01 -----");
        System.out.println(f1.toString());

        System.out.println("----- FIGURA 02 -----");
        System.out.println(f2.toString());

        System.out.println("----- FIGURA 03 -----");
        System.out.println(f3.toString());

        System.out.println("----- FIGURA 04 -----");
        System.out.println(f4.toString());
    }
}
