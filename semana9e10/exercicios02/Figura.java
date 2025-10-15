package semana9e10.exercicios02;

public class Figura {
    public double x;
    public double y;

    public Figura(){
    }

    public Figura(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x){this.x = x;}
    public double getX(){return x;}

    public void setY(double y){this.y = y;}
    public double getY(){return y;}

    public String toString(){
        return "X: " +getX()+ "\nY: " +getY();
    }
}
