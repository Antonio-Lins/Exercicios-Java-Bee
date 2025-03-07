import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double bhaskara = (b * b) - (4 * a * c);

        if (a == 0 || bhaskara < 0) { 
            System.out.println("Impossivel calcular");
        } else {
            double x1 = (-b + Math.sqrt(bhaskara)) / (2 * a);
            double x2 = (-b - Math.sqrt(bhaskara)) / (2 * a);

            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);
        }

        scanner.close();
    }
}
