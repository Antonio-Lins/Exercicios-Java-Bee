import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float Media1 = scanner.nextFloat();
        float Media2 = scanner.nextFloat();
        float Media3 = scanner.nextFloat();

        double MediaFinal = ((Media1 * 2) + (Media2 * 3) + (Media3 * 5)) / 10;

        System.out.printf("MEDIA = %.1f%n",MediaFinal);

        scanner.close();
    }
    
}
