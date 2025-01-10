import java.util.Locale;
import java.util.Scanner;


public class Media {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double A, B, media;

        System.out.println("Digite o valor de A: "); //recebendo o valor de A
        A = scanner.nextInt();
        System.out.println("Digite o valor de B: "); //recebendo o valor de B
        B = scanner.nextInt();

        media = (A * 3.5 + B * 7.5) / 11;
        System.out.printf("MEDIA = %.1f", media); // %.1f mostra quantas casas decimais

        scanner.close();
        

    }
}