import java.util.Locale;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor");
        String salStr = sc.next().replace(",", ".");
        double sal = Double.parseDouble(salStr);
        System.out.println(sal);



    }
}
