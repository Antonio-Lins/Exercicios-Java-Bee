import java.util.Scanner;

public class exercicio18 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int horas = scanner.nextInt();
        int kmh = scanner.nextInt();

        double gasto = (horas * kmh) / 12.0;

        System.out.printf("%.3f%n",gasto);



        scanner.close();
    }
    
}
