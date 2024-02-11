package aplicacao;

import entidade.Triangulo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo();


        System.out.println("Entre com os lados do triangulo1");
        triangulo1.a = sc.nextDouble();
        triangulo1.b = sc.nextDouble();
        triangulo1.c = sc.nextDouble();
        System.out.println("Entre com os lados do triangulo2");
        triangulo2.a = sc.nextDouble();
        triangulo2.b = sc.nextDouble();
        triangulo2.c = sc.nextDouble();

        double t = (triangulo1.a + triangulo1.b + triangulo1.c) /2.0;
        System.out.println("valor do T " + t);
        System.out.println();

        double area1 = Math.sqrt(t * (t - triangulo1.a) * (t - triangulo1.b) * (t - triangulo1.c));
        System.out.printf("Area Triangulo 1: %.2f\n", area1);

        Double area2 = Math.sqrt(t * (t - triangulo2.a) * (t - triangulo2.b) * (t - triangulo2.c));

        System.out.printf("Area Triangulo 2: %.2f\n", area1);
        if (area2 > area1){
            System.out.println(String.format("A maior area é trianguolo 2 - > %.2f", area2));
        }else if (area2 == area1){
            System.out.println(String.format("Os dois triangulos tem o mesmo tamanho -> %.2f", area1));
        }else{
            System.out.println(String.format("A maior area é trianguolo 1 -> %.2f", area1));
        }


    }
}
