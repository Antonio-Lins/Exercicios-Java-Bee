import java.util.Scanner;

public class exercicio9 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        float horas = scanner.nextFloat();

        float Salario = (numero2 * horas);

        System.out.printf("NUMBER = %d\n",numero1);
        System.out.printf("SALARY = U$ %.2f%n", Salario);

        scanner.close();
    }
}
