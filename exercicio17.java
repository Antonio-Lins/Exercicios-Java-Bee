import java.util.Scanner;

public class exercicio17 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int carrox = 60;
        int carroy = 90;

        int distancia = ( x * 60 ) / (carroy - carrox);

        System.out.println(distancia + " minutos");


        scanner.close();
    }
    
}
