package semana9e10.exercicios02;

public class Circulo extends Figura{
    public double raio;

    public Circulo(){

    }

    public Circulo(double raio, double x, double y){
        super(x, y);
        this.raio = raio;
    }

    public Circulo(double raio){
        this.raio = raio;
    }

    public void setRaio(double raio){this.raio = raio;}
    public double getRaio(){return raio;}

    public String toString(){
        return "Raio do circulo: " +getRaio();
    }

    public double calculaArea(){
        double pi = 3.14;
        double areaCirculo = pi * (getRaio() * getRaio());
        return areaCirculo;
    }
}
