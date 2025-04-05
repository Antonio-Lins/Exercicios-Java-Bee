import java.util.Scanner;
 
public class exercicio20 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int Segundos = scanner.nextInt();



        int horas = Segundos / 3600;
        Segundos = Segundos % 3600;

        int Minutos = Segundos / 60;
        Segundos = Segundos % 60;



        System.out.printf("%d:%d:%d%n", horas, Minutos, Segundos);



        scanner.close();
    }   
}
