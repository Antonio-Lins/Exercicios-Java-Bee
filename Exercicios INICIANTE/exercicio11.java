import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        double peca1 = scanner.nextDouble();
        
        int numero3 = scanner.nextInt();
        int numero4 = scanner.nextInt();
        double peca2 = scanner.nextDouble();


        double Calculo = (numero2 * peca1) + (numero4 *peca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", Calculo);

        scanner.close();
    } 
}
