import java.util.Scanner;

public class exercicio15 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        double y = scanner.nextDouble();

        double distancia = (x/y);


        System.out.printf("%.3f km/l%n", distancia);


        scanner.close();
    }
    
}
