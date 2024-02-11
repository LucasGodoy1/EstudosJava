package entidade;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public Double calculaArea(){
       Double t = (this.a + this.b + this.c) /2.0;
       return Math.sqrt(t * (t - this.a) * (t - this.b) * (t - this.c));

    }

}
