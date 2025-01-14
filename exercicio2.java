import java.util.Scanner; 

public class exercicio2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero");
    int numero = scanner.nextInt();

    System.out.println("Digite outro um numero");
    int numero1 = scanner.nextInt();

    int soma = numero + numero1;


    System.out.println("" + soma);



        scanner.close(); // fecha o scanner
    }
}
