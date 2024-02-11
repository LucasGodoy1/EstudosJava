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

        System.out.printf("Area Triangulo 1: %.2f\n", triangulo1.calculaArea());

        System.out.printf("Area Triangulo 2: %.2f\n", triangulo2.calculaArea());
        if (triangulo2.calculaArea() > triangulo1.calculaArea()){
            System.out.println(String.format("A maior area é trianguolo 2 - > %.2f", triangulo2.calculaArea()));
        }else if (triangulo1.calculaArea() == triangulo2.calculaArea()){
            System.out.println(String.format("Os dois triangulos tem o mesmo tamanho -> %.2f", triangulo1.calculaArea()));
        }else{
            System.out.println(String.format("A maior area é trianguolo 1 -> %.2f", triangulo1.calculaArea()));
        }


    }
}
