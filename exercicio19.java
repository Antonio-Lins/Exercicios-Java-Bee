import java.util.Scanner;

public class exercicio19 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int valorOriginal = N;

        int notas100 = N / 100;
        N = N % 100;

        int notas50 = N / 50;
        N = N % 50;

        int notas20 = N / 20;
        N = N % 20;

        int notas10 = N / 10;
        N = N % 10;

        int notas5 = N / 5;
        N = N % 5;

        int notas2 = N / 2;
        N = N % 2;

        int notas1 = N / 1;
        N = N % 1;

        System.out.println(valorOriginal);

        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");

        scanner.close();
    }
}
