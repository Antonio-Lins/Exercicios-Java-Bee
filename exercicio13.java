import java.util.Scanner;

public class exercicio13 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);


        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double pi = 3.14159;


        Double areaTriangulo = (A * C)/2;
        Double areaCirculo = ((C*C) * pi);
        Double areaQuadrado = ((A + B)*C)/2;
        Double areaTrapezio = (B * B);
        Double areaRetangulo = (A * B);

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaQuadrado);
        System.out.printf("QUADRADO: %.3f%n", areaTrapezio);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        scanner.close();

    }
    
}
