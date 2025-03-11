import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // verificar se forma um triângulo
        if (A + B <= C || A + C <= B || B + C <= A) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // verificações de tipo de triângulo
            if ((A * A) == (B * B) + (C * C)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if ((A * A) > (B * B) + (C * C)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if ((A * A) < (B * B) + (C * C)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scanner.close();
    }
}
