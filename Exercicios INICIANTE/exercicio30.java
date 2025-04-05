import java.util.Scanner;

public class exercicio30 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double N1 = scanner.nextDouble();
        double N2 = scanner.nextDouble();
        double N3 = scanner.nextDouble();

        if ((N1 + N2) > N3 && (N1 + N3) > N2 && (N2 + N3) > N1) {
            double P = N1 + N2 + N3;

            System.out.println("Perimetro = "+ P);
            
        }

        else{
            Double A = ((N1 + N2) * N3)/2;

            System.out.println("Area = " + A);
        }



        scanner.close();
    }
    
}
