import java.util.Scanner;

public class exercicio27 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        float N1 = scanner.nextFloat();
        float N2 = scanner.nextFloat();
        float N3 = scanner.nextFloat();
        float N4 = scanner.nextFloat();

        float media = ((N1 *2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        

        if ( media >= 7) {
            System.out.printf("Media: %.1f%n",media);
            System.out.printf("Aluno aprovado.%n");
        }

        else if (media < 5) {
            System.out.printf("Media: %.1f%n",media);
            System.out.printf("Aluno reprovado.%n");
            
        }

        else if (media >= 5 && media <=6.9) {
            System.out.printf("Media: %.1f%n",media);
            System.out.printf("Aluno em exame.%n");
            double exame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f%n",exame);
            System.out.printf("Aluno aprovado.%n");
            double MediaFinal = (media + exame)/2;
            System.out.printf("Media final: %.1f%n",MediaFinal);

        }

        scanner.close();
    }
    
}
