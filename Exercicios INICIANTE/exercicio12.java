import java.util.Scanner;

public class exercicio12 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double numero = 4/3.0;

        double calculo = (numero * pi * (raio*raio*raio));

        System.out.printf("VOLUME = %.3f%n", calculo);
        scanner.close();
    }
    
}
