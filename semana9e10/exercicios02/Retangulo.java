package semana9e10.exercicios02;

public class Retangulo extends Figura{
    public double base;
    public double altura;

    public Retangulo(){

    }

    public Retangulo(double base, double altura, double x, double y){
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base){this.base = base;}
    public double getBase(){return base;}

    public void setAltura(double altura){this.altura = altura;}
    public double getAltura(){return altura;}

    public double calculaArea(){
        return getBase() * getAltura();
    }

    public String toString(){
        return "Base: " +getBase()+ "\nAltura: " +getAltura()+ "\nCalculo da área do retangulo: " + calculaArea();
    }
}
