import java.util.Scanner;

public class exercicio21 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int Dias = scanner.nextInt();
        
        int anos = Dias / 365;
        Dias = Dias % 365;

        int meses = Dias / 30;
        Dias = Dias % 30;
        

        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", Dias);

        

        scanner.close();            

    }
    
}
