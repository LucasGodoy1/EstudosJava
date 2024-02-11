package aplicacao;

import entidade.Triangulo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os lados do triangulo1");
        Triangulo triangulo1 = new Triangulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Entre com os lados do triangulo2");
        Triangulo triangulo2 = new Triangulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        sc.close();

        System.out.printf("Area Triangulo 1: %.2f\n", triangulo1.calculaArea());

        System.out.printf("Area Triangulo 2: %.2f\n", triangulo2.calculaArea());
        if (triangulo2.calculaArea() > triangulo1.calculaArea()){
            System.out.println(String.format("A maior area trianguolo 2 - > %.2f", triangulo2.calculaArea()));
        }else if (triangulo1.calculaArea() == triangulo2.calculaArea()){
            System.out.println(String.format("Os dois triangulos tem o mesmo tamanho -> %.2f", triangulo1.calculaArea()));
        }else{
            System.out.println(String.format("A maior area trianguolo 1 -> %.2f", triangulo1.calculaArea()));
        }


    }
}
