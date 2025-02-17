import java.util.Scanner; 

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float numero = scanner.nextFloat();

        double numero1 = 3.14159;

        float circulo = numero * (numero * numero);

        System.out.println("A="+ circulo);

        scanner.close();
    }
    
}
