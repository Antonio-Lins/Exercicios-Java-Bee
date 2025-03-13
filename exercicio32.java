import java.util.Scanner;
import java.util.Arrays;

public class exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] lados = new double[3];
        lados[0] = scanner.nextDouble();
        lados[1] = scanner.nextDouble();
        lados[2] = scanner.nextDouble();

        // ordenar os lados em ordem decrescente
        Arrays.sort(lados);
        double A = lados[2], B = lados[1], C = lados[0];

        // verificar se forma um triângulo
        if (A >= B + C) {
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
