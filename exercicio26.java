import java.util.Scanner;

public class exercicio26 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        if (codigo == 1) {
            float lanche1 = 4;
            float calculo1 = lanche1 * quantidade;

            System.out.printf("Total: R$ %.2f%n",calculo1);
        }


        else if (codigo == 2) {
            double lanche2 = 4.5;
            double calculo2 = lanche2 * quantidade;

            System.out.printf("Total: R$ %.2f%n",calculo2);
        }

        else if (codigo == 3) {
            double lanche3 = 5;
            double calculo3 = lanche3 * quantidade;

            System.out.printf("Total: R$ %.2f%n",calculo3);
        }

        else if (codigo == 4) {
            double lanche4 = 2;
            double calculo4 = lanche4 * quantidade;

            System.out.printf("Total: R$ %.2f%n",calculo4);

        }

        else if (codigo == 5) {
            double lanche5 = 1.5;
            double calculo5 = lanche5 * quantidade;

            System.out.printf("Total: R$ %.2f%n",calculo5);

        }

        scanner.close();
    }
    
}
