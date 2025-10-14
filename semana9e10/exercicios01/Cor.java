package semana9e10.exercicios01;

public class Cor {
    public int r, g , b;

    public Cor(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void setR(int r){this.r = r;}
    public int getR(){return r;}

    public void setG(int g){this.g = g;}
    public int getG(){return g;}

    public void setB(int b){this.b = b;}
    public int getB(){return b;}

    @Override
    public String toString(){
        return "R: " +getR()+ "\nG: " +getG()+  "\nB: " +getB();    
    }
}
