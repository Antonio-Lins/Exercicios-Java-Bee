import java.util.Scanner;
public class exercicio33 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int hora = 24;

        if (B > A) {
            int Duração = B - A;
            System.out.printf("O JOGO DUROU %d HORA(S)\n" , Duração);
        }

        
        else if (B < A) {
            int Duração = (hora - A) + B;
            System.out.printf("O JOGO DUROU %d HORA(S)\n" , Duração);
        }

        
        else if (B == A) {
            System.out.printf("O JOGO DUROU 24 HORA(S)\n");
        }


        scanner.close();
    }
}