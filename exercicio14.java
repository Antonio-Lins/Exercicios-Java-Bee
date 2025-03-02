import java.util.Scanner;

public class exercicio14 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maior_ab = (a + b + Math.abs(a - b)) / 2;
        int maior = (maior_ab + c + Math.abs(maior_ab - c)) / 2;

        System.out.printf("%d eh o maior\n", maior);



        scanner.close();
    }
    
}
