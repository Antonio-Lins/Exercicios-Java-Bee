import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int N3 = scanner.nextInt();
        int N4 = scanner.nextInt();

        int diferenca = (N1 * N2 - N3 * N4);

        System.out.printf("DIFERENcA = %d/n",diferenca);

        scanner.close();
    }
    
}
