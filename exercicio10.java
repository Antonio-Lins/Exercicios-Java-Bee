import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double numero1 = scanner.nextDouble(); ;
        double vendas = scanner.nextDouble();

        double salario = ((vendas * 0.15) + numero1);

        System.out.printf(Locale.US,"TOTAL = R$ %.2f%n", salario);
        scanner.close();
    }
}
