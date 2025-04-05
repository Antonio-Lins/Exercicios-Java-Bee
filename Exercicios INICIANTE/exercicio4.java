import java.util.Scanner; 

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("SOMA = " +soma);

         scanner.close();
    }
    
} 
