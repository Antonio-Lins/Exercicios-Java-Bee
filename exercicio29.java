import java.util.Scanner;

public class exercicio29 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int N3 = scanner.nextInt();

        int a = N1, b = N2, c = N3;

        if (N1 >  N2) {
            int temp = N1;
            N1 = N2;
            N2 = temp;
        }

        if (N1 >  N3) {
            int temp = N1;
            N1 = N3;
            N3 = temp;
        }

        if (N2 >  N3) {
            int temp = N2;
            N2 = N3;
            N3 = temp;
        }


        
        System.out.println(N1);
        System.out.println(N2);
        System.out.println(N3);

        System.out.println("");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        scanner.close();
    }
    
}
