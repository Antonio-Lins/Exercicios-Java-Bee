import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float media1 = scanner.nextFloat(); 
        float media2 = scanner.nextFloat();
        
        double MediaFinal = (((media1 * 3.5) + (media2 * 7.5)) / 11);

        System.out.printf("MEDIA = %.5f%n", MediaFinal);


        scanner.close();
    }
}
 